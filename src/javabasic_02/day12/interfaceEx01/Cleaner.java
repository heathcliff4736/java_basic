package javabasic_02.day12.interfaceEx01;

public class Cleaner implements RemoteControl{

    private int timer;

    public Cleaner(int timer) {
        this.timer = timer;
    }

    @Override
    public void turnOn() {
        System.out.println("청소기가 켜졌습니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("청소기가 꺼졌습니다.");
    }

    @Override
    public void setVolume(int volume) {

    }

    @Override
    public void setMute(boolean mute) {

    }

    public void vacuum(int timer) {
        System.out.println(timer+"분간 청소를 실행합니다.");
    }
}
