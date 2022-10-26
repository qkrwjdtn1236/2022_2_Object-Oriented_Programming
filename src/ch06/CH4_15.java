package ch06;

public class CH4_15 {
    public static void main(String[] args){
        Complex c1 = new Complex(2.0);
        System.out.println(c1.print());
        Complex c2 = new Complex(1.5,2.5);
        System.out.println(c2.print());
    }
}

class Complex{
    double a,b;
    Complex(double a){
        this.a = a;
    }
    Complex(double a,double b){
        this(a);
        this.b = b;
    }
    String print(){
        return this.a + " + "+this.b+"i";
    }
}
