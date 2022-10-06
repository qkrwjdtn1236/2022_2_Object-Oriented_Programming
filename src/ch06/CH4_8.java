package ch06;

public class CH4_8 {
    public static void main(String[] args){
        Triangle t1 = new Triangle(10.0,5.0);
        System.out.println(t1.findArea());
    }
}

class Triangle{
    private double r, h;

    Triangle(double a,double b){
        this.r = a;
        this.h = b;
    }
    public double findArea(){
        return this.r * this.h /2;
    }

    public boolean isSameArea(Triangle t){
        return (this.findArea() == t.findArea())?true : false;
    }
}
