package ch06;

public class CH4_8 {
    public static void main(String[] args){
        Triangle t1 = new Triangle(10.0,5.0);
        System.out.println(t1.findArea());
    }
}

class Triangle{
    private double r;
    private double h;
    private double area;

    Triangle(double a,double b){
        this.r = a;
        this.h = b;
        this.area = this.r * this.h /2;
    }

    public double findArea(){
        return this.area;
    }

    public boolean isSameArea(Triangle t){
        return (this.findArea() == t.findArea())?true : false;
    }
}
