package ch06;

import java.util.Scanner;

public class CH4_11 {

    static void swap(Number n){

        int temp = n.a;

        n.a = n.c;

        n.c = n.b;

        n.b = temp;

        System.out.printf("swap() 메서드 호출 후 : %d %d %d",n.a,n.b,n.c);

    }
    public static void main(String[] args){
        System.out.print("3개의 숫자 입력 : ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Number number = new Number(a,b,c);

        System.out.printf("swap() 메서드 호출 전 : %d %d %d\n",number.a,number.b,number.c);
        swap(number);

    }
}

class Number{
    int a, b, c;
    Number(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
