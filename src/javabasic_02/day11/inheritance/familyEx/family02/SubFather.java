package javabasic_02.day11.inheritance.familyEx.family02;

public class SubFather extends GrandFather {
    private String familyName = "프로그래머";
    private String houseAddress = "인천";

    public String getFamilyName() { return familyName; }

    public String gethouseAddress() {
        return houseAddress;
    }

    void printFather() {
        System.out.println("나는 아버지입니다! 나는 할아버지로부터 상속받습니다.");
    }

}
