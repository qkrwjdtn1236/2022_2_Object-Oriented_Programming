package ch5;

public class MyExpDemo {
    public static void main(String[] args){
//        MyExp number1 = new MyExp(2,3);
//        System.out.printf("%d의 %d승 = %d\n",number1.base,number1.exp,(int)number1.getValue());
//
//        MyExp number2 = new MyExp(3,4);
//        System.out.printf("%d의 %d승 = %d\n",number2.base,number2.exp,(int)number2.getValue());

        System.out.printf("%d의 %d승 = %d\n",2,3,MyExp1.getValue(2,3));

        System.out.printf("%d의 %d승 = %d\n",3,4,MyExp1.getValue(3,4));

    }
}
class MyExp{

    int base;
    int exp;

//    MyExp(int a,int b){
//        this.base = a;
//        this.exp = b;
//    }

//    int getValue(){
//        int result = 1; // 리턴할 변수 : 거듭제곱 결과 변수
//        for(int i = 1;i<=this.exp;i++) // b만큼 반복
//            result *=this.base ; // a 횟수 만큼 반복
//        return result;
//    }

    double getValue(){
        return Math.pow(this.base, this.exp);
    }
}

class MyExp1{
    static int getValue(int a,int b){
        int result = 1; // 리턴할 변수 : 거듭제곱 결과 변수
        for(int i = 1;i<=b;i++) // b만큼 반복
            result *=a ; // a 횟수 만큼 반복
        return result;
    }
}
