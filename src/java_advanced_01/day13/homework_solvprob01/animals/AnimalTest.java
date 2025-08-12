package java_advanced_01.day13.homework_solvprob01.animals;

public class AnimalTest {

    public static void main(String[] args) {
        Animal dog = new Dog(8);
        Animal chicken = new Chicken(3);
        Chicken cheatableChicken = new Chicken(5);

        if (cheatableChicken instanceof Cheatable) cheatableChicken.fly();
//        if (cheatableChicken instanceof Chicken) cheatableChicken.fly();

        for (int i = 1; i < 4; i++) {
            dog.run(i);
            chicken.run(i);
            cheatableChicken.run(i);
            System.out.println(i+"시간 후");
            System.out.printf("개의 이동거리=%.1f\n", dog.getDistance());
            System.out.printf("닭의 이동거리=%.1f\n", chicken.getDistance());
            System.out.printf("날으는 닭의 이동거리=%.1f\n", cheatableChicken.getDistance());
        }
    }
}
