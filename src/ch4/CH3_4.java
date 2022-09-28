package ch4;

import java.util.Scanner;

public class CH3_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result;
        int sum = 0;
        do{
            System.out.print("양의 정수를 입력하세요 : ");
            result = sc.nextInt();
            if(result%2 == 0 && result>0)
                sum+=result;
        }
        while(result>0);
        System.out.println("입력한 양의 정수 중에서 짝수의 합은 "+sum);
        sc.close();
    }
}
