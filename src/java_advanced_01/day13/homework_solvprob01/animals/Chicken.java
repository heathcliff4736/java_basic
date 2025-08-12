package java_advanced_01.day13.homework_solvprob01.animals;

public class Chicken extends Animal implements Cheatable{

    Chicken(int speed) {
        super(speed);
    }

    @Override
    void run(int hours) {
        setDistance(getSpeed() * hours);
//        distance+=(double)speed*hours;
    }

    @Override
    public void fly() {
        setSpeed(getSpeed()*2);
//        this.speed*=2;
    }
}
