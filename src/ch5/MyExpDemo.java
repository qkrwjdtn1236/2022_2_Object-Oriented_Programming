package ch5;

public class MyExpDemo {
    public static void main(String[] args){
        MyExp number1 = new MyExp(2,3);
        System.out.printf("%d의 %d승 = %d\n",number1.base,number1.exp,(int)number1.getValue());

        MyExp number2 = new MyExp(3,4);
        System.out.printf("%d의 %d승 = %d\n",number2.base,number2.exp,(int)number2.getValue());

    }
}
class MyExp{

    int base, exp;
    MyExp(int a,int b){
        this.base = a;
        this.exp = b;
    }
    double getValue(){
        return Math.pow(this.base, this.exp);
    }
}