package ch4;

import java.util.Scanner;

public class Gudan {
    public static void main(String[] args){


        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
//        for(int i = 1;i<=9;i++)
//        {
//            System.out.printf("%d * %d = %d\n",num,i,num*i);
//        }
        int i = 1;
        while(i<=9){
            System.out.printf("%d * %d = %d\n",num,i,num*i);
            i++;
        }
    }
}
