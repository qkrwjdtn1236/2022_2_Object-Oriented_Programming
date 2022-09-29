package ch4;

import java.util.Scanner;

public class CH3_12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수를 입력하세요 : ");
        int x = sc.nextInt();

        System.out.print("두번째 정수를 입력하세요 : ");
        int y = sc.nextInt();

        System.out.println("두 수 중에 큰 수는 "+get_max(x,y)+" 입니다.");
    }

    public static int get_max(int x, int y){
        return (x>=y)?x:y;
    }
}

