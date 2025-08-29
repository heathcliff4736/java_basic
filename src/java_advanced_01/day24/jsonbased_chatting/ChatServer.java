package java_advanced_01.day24.jsonbased_chatting;

// 클라이언트가 서버에 접속시 연결 수락
// 클라이언트에게 메시지를 입력받을수 있도록 대기
// 입력시 다른 사용자가 볼 수 있게 출력
// 통신용 SocketClient를 생성

import org.json.JSONObject;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// 서버 소켓 선언 -> accept()로 수락받자
public class ChatServer {
    
    // 클라이언틔의 연결 요청 수락
    private static ServerSocket serverSocket;  

    //100개의 스레드를 만든 뒤 반환받음 -> 재사용성         (사용자들을 관리함) 만약 101번 -> 100번 꽉찼으니까 대기
    ExecutorService threadPool = Executors.newFixedThreadPool(100);

    // 통신용 SocketClient를 관리하는 동기화된 Map 컬렉션이다
    // 공유객체(chatRoom)에 대한 동시접근이 불가능하게 락
    Map<String, SocketClient> chatRoom = new ConcurrentHashMap<>(new HashMap<>());
    // ConcurrentHashMap: 병렬처리가 가능한 동기화된 맵 컬렉션


    // 메소드 : 서버 시작
    // start() 메소드 -> 채팅서버 시작할때 가장 먼처 호출되야 함
    // 50001번 Port에 바인딩하는 ServerSocket을 생성하고 작업스레드가 처리할 Runnable을 람다식 ()->{...} 제공
    public void start() throws IOException {
        serverSocket = new ServerSocket(50001);
        System.out.println("Server has started");

        Thread thread = new Thread(()->{
            try {
                while (true) {                                  // 람다식이 하는 일을 개발자가 지정
                    Socket socket = serverSocket.accept();      // accept()로 연결을 수락
                    SocketClient client = new SocketClient();   // 통신용 SocketClient를 반복해서 생성함
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        thread.start();
    }
    
    // 메소드 : 클라이언트 연결시 SocketClient 생성하고 Map에 추가하는기능
    public void addSocketClient(SocketClient socketClient) {
        // 클라이언트 정보를 이용하여 고유key생성
        String key = socketClient.chatName + "@" + socketClient.clientIp;
        chatRoom.put(key, socketClient);
        System.out.println("입장 > :" +key);
        System.out.println("현재 채팅자 수 : "+chatRoom.size()+"\n");
    }


    // 메소드 : 클라이언트 연결 종료시 SocketClient 제거 (Map에서 제거, Chatroom에서도 제거)   -- 사용자가 채팅방에서 나간것을 공지
    public void removeSocketClient(SocketClient socketClient) {
        String key = socketClient.chatName + "@"+socketClient.clientIp;
        chatRoom.remove(key);
        System.out.println("퇴장>"+key);
        System.out.println("현재 채팅자 수 : "+chatRoom.size()+"\n");
    }

    // 메시지 브로드캐스트 기능 : Json메시지를 생성하여 채팅방에 있는 모든
    // 접속된 모든 클라이언트들한테 브로드캐스트
    public void sendToAll(SocketClient sender, String message) {
        JSONObject root = new JSONObject();
        root.put("clientIp", sender.clientIp);
        root.put("chatName", sender.chatName);
        root.put("message", message);
        String json = root.toString();      // { "clientIp" : "xxx.xxx.xx.11",
                                            //   "chatName" : "yumi",
                                            //   "message"  : "hello, 오랜만이야" }
        // Collections<SocketClient>
        // send()로 JSON 메시지를 보내게 한다.
        Collection<SocketClient> clients = chatRoom.values();
        for(SocketClient client : clients) {
            if(client == sender) continue;
            client.send(json);
        }
    }

    // 서버 종료 : stop()
    public void stop(){
        try {
            serverSocket.close();
            threadPool.shutdown();
//        chatRoom.values().stream().forEach(sc->sc.close));
            chatRoom.clear();
            System.out.println("Server has shut down");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





}
