package java_advanced_01.day17.lamdaEx.lamda02;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        person.action(
                () -> {
                    System.out.println("9시까지 출근");
                    System.out.println("12시부터 1시까지 점심시간");
                    System.out.println("1시부터 5시까지 오후 업무시간");
                }
        );

        person.action(()-> System.out.println("퇴근"));


    }
}
