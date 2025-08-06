package javabasic_02.day11.assignments.inheritance02;

public class Student {

    private String name;
    private String subject;
    private int fee;
    private int returnFee;

    public Student(String name, String subject, int fee) {
        this.name = name;
        this.subject = subject;
        this.fee = fee;
    }

    public void calcReturnFee() {
        switch (this.subject) {
            case "javaprogram" -> this.returnFee = fee / 4;
            case "jspprogram" -> this.returnFee = fee / 5;
            default -> System.out.println("그런 과정명은 없습니다");
        }
    }

    public void print() {
        System.out.printf("%s 씨의 과정명은 %s 이고 교육비는 %d 이며 환급금은 %d 입니다.", this.name, this.subject, this.fee, this.returnFee);
    }

    public static void main(String args[]) {
        Student stu = new Student("장동건", "jspprogram",
                500000);
        stu.calcReturnFee();
        stu.print();
    }

}
