package javabasic_02.day11.test.test03;

public class Emp {

    private String id;
    private String name;
    private int baseSalary;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary(double bonus) {
        double salary = baseSalary * bonus;
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String toString(){
        String toString = getName()+"("+getId()+")"+"사원의 기본급은 "+getBaseSalary()+"원 입니다.";
        return toString;
    }
}
