package java_advanced_01.day23;

public class ThreadEx01 {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread(); // 실행하는 스레드 객체 참조 얻기
        System.out.println("[Server] Starting on " + mainThread.getName());

        for (int i = 0; i < 3; i++) {
            Thread threadA = new Thread(){
                @Override
                public void run() {
                    System.out.println("[Server] Starting on " + Thread.currentThread().getName());
                }
            };
            threadA.start();    // getName()메소드는 Thread의 인스턴스메소드로 스레드의 이름을 리턴
        }
        Thread chatThread = new Thread(){
            @Override
            public void run() {
                System.out.println("[Server] Starting on " + Thread.currentThread().getName());
            }
        };

//        while (true) {
        chatThread.setName("chatting thread");
        chatThread.start();
//        }
    }
}
