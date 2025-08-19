package java_advanced_01.day17.anonymousClass.class03;

class Animal {
    public String eat() {
        return "eat";
    }
}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal() {
            @Override
            public String eat() {
//                run();          // 호출 가능
                return "dog barks";
            }

            public String run() {
                return "dog runs";
            }
        };
        String eat = dog.eat();
        System.out.println(eat);
//        dog.run();
    }
}
// 새로 정의한 메소드는 외부 스코프에서는 호출될 수 없고, 익명 클래스 내에서만 호출 가능하다.
