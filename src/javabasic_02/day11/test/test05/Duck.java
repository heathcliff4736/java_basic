package javabasic_02.day11.test.test05;

public class Duck {
    private String name;
    private int legs;
    private double length;

    public void setName(String name) {
        this.name = name;
    }

    void fly(){
        System.out.println("오리("+this.name+")는 날지 않습니다.");
    }

    void sing(){
        System.out.println("오리("+this.name+")가  소리내어 웁니다.");
    }

    public String toString(){
        String str = "오리의 이름은 "+name+" 입니다.";
        return str;
    }
}
