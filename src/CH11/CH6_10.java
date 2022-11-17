package CH11;

public class CH6_10 {
    public static void main(String[] args){
        Vehicle a = new Vehicle("검정",150);
        a.show();

        System.out.println();
        Car c = new Car("파랑",200,1000,5);
        Vehicle v = c;

        v.show();
    }
}

class Vehicle{
    String color;
    int speed;
    Vehicle(String color, int speed){
        this.color = color;
        this.speed = speed;
    }
    void show(){
        System.out.println("색상 : "+this.color);
        System.out.println("속도 : "+this.speed);
    }
}

class Car extends Vehicle{
    int a, b;
    Car(String color,int speed, int a,int b){
        super(color,speed);
        this.a = a;
        this.b = b;
    }

    void show(){
        super.show();
        System.out.println("자동차 배기랑 : "+this.a);
        System.out.println("자동차 기어 단수 : "+this.b);
    }
}