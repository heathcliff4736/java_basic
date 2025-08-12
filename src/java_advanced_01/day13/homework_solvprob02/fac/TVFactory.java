package java_advanced_01.day13.homework_solvprob02.fac;

public class TVFactory extends Factory implements IWorkingTogether {
    public TVFactory(String name, int openHour, int closeHour) {
        super(openHour, closeHour, name);
    }

    @Override
    int makeProducts(char skill) {
        switch (skill){
            case 'A' -> { return 8*super.getWorkingTime(); }
            case 'B' -> { return 5*super.getWorkingTime(); }
            case 'C' -> { return 3*super.getWorkingTime(); }
            default -> { return super.getWorkingTime(); }
        }
    }

    @Override
    public int workTogether(IWorkingTogether partner) {
        return ((TVFactory)partner).makeProducts('C');
    }
}
