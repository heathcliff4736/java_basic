package java_advanced_01.day13.homework_solvprob01.animals;

public class Dog extends Animal{

    Dog(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        setDistance(getSpeed() * hours/2);
//        distance+=(double)speed*hours/2;
    }

}
