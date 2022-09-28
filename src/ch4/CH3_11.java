package ch4;

import java.util.Scanner;

public class CH3_11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String result;

        while(true){
            System.out.print("성적을 입력하세요 : ");
            int score = sc.nextInt();
            if(score<0)
                break;

            char rank = switch(score/10){
                case 10,9 -> 'A';
                case 8,7 -> 'B';
                case 6,5 -> 'C';
                case 4 -> 'D';
                default -> 'F';

            };
            System.out.println("당신의 성적 등급은 "+rank+"입니다.");
        }
        sc.close();
        System.out.println("프로그램을 종룍합니다.");

    }
}
