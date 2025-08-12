package java_advanced_01.day13.homework_solvprob02.fac;

public abstract class Factory {
    private int openHour;
    private int closeHour;
    private String name;

    public Factory(int openHour, int closeHour, String name) {
        this.openHour = openHour;
        this.closeHour = closeHour;
        this.name = name;
    }

    String getFactoryName(){ return name; }

    int getWorkingTime(){ return closeHour-openHour; }

    abstract int makeProducts(char skill);
}
