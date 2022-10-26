package ch06;

public class CH4_12 {
    public static void main(String[] args){
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a == b);
    }
}

class Line{
    int num;
    Line(int num){
        this.num = num;
    }

    boolean isSameLine(Line l){
        return l.num == this.num;
    }
}
