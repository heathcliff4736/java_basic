package javabasic_02.day12.interfaceEx01;

public class User {

    public static void main(String[] args) {
        RemoteControl rc;
        rc = new Television();
        rc.turnOn();

        rc.setVolume(10);
        rc.setVolume(15);
        rc.setVolume(78);
        rc.setMute(true);
        rc.setMute(false);

        // 인스턴스 없이 호출할수 있다.
        RemoteControl.changeBattery();      // 정적 메소드 수행

        // 리모컨을 통해서 청소기를 동작시키려 한다.  rc 사용
        // 1. 청소기 전원을 켠다
        // 2. 10분간 청소를 시킨다.
        // 3. 10분 후 청소기를 끈다.
//        rc = new Cleaner(10);
//        rc.turnOn();
//        rc.turnOff();

        // TV의 최대 볼륨 확인     public static final은 타입.상수명  >> 바로 접근하여 상수값 읽음
        System.out.println(RemoteControl.MAX_VOLUME);
        // TV의 최소 볼륨 확인
        System.out.println(RemoteControl.MIN_VOLUME);




    }
}
