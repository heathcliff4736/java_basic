package javabasic_02.day12.assignments.wheel;

public class Truck extends Wheeler {

    public Truck(String carName, int velocity, int wheelNumber) {
        this.carName = carName;
        this.velocity = velocity;
        this.wheelNumber = wheelNumber;
    }

    @Override
    public void speedUp(int speed) {
        this.velocity = (velocity + speed * 5);
        if (this.velocity > 100) this.velocity = 100;
            System.out.printf("%s의 현재 속도는 %d 입니다.\n", this.carName, this.velocity);
    }

    @Override
    public void speedDown(int speed) {
        this.velocity = (velocity - speed * 5);

        if (this.velocity - speed * 5 < 50){
            this.velocity = 50;
            System.out.printf("%s의 최저속도위반으로 속도를 %d으로 올립니다.\n", this.carName, this.velocity);
        } else {
            this.velocity = (velocity - speed * 5);
            System.out.printf("%s의 현재 속도는 %d 입니다.\n", this.carName, this.velocity);
        }
    }
}
