package CH12;

public class CH6_5 {
    public static void main(String[] args){
        Circle circle = new Circle(5);
        circle.show();

        ColoredCircle coloredCircle =
                new ColoredCircle(10,"빨간색");
        coloredCircle.show();
    }
}

class Circle{
    int radius;

    Circle(int radius){
        this.radius = radius;
    }
    void show(){
        System.out.println("반지름이 "+this.radius+"인 원이다.");
    }
}

class ColoredCircle extends Circle{
    String color;

    ColoredCircle(int radius, String color){
        super(radius);
        this.color = color;
    }
    void show(){
        System.out.println(
                "반지름이 "+this.radius+"인 "+this.color+" 원이다.");
    }
}
