package ch06;

public class CH4_7 {
    public static void main(String[] args){
        CircleConstructor circleConstructor =
                new CircleConstructor(100.0);
    }
}

class CircleConstructor{
    double pi = 3.14;
    double radius;
    double area;


    CircleConstructor(double radius){
        this.radius = radius;
        area = radius*radius*pi;
        System.out.println("원의 면적은 "+area+"입니다.");
    }
}
