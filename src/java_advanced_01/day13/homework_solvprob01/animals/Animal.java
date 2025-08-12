package java_advanced_01.day13.homework_solvprob01.animals;

public abstract class Animal {
    private int speed;
    double distance;

    public Animal(int speed){ this.speed = speed; }

    abstract void run(int hours);

    public double getDistance() { return distance; }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setDistance(double distance) { this.distance = distance; }
}
