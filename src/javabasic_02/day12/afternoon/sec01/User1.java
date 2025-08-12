package javabasic_02.day12.afternoon.sec01;

public class User1 {
    public static void main(String[] args) {
        RemoteControl rc = new SmartTelevision();
        // 인터페이스 타입으로 자동 타입변환
//        List<Integer> list = new ArrayList<>();
//        List<Integer> list = new Vector<>();
        rc.turnOn();
        rc.turnOff();

        Searchable searchable = new SmartTelevision();
        searchable.search("https://www.youtube.com");


    }
}
