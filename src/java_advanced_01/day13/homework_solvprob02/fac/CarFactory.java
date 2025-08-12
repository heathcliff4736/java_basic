package java_advanced_01.day13.homework_solvprob02.fac;

public class CarFactory extends Factory implements IWorkingTogether{
    public CarFactory(String name, int openHour, int closeHour) {
        super(openHour, closeHour, name);
    }

    @Override
    int makeProducts(char skill) {
        switch (skill){
            case 'A' -> { return 3*super.getWorkingTime(); }
            case 'B' -> { return 2*super.getWorkingTime(); }
            case 'C' -> { return super.getWorkingTime(); }
            default -> { return 0; }
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((CarFactory)partner).makeProducts('B');
    }
}
