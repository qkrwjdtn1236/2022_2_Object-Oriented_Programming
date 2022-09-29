package ch5;

import java.util.Scanner;

public class CH3_15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("국어 영어 수학 성적을 입력하세요 : ");
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int math = sc.nextInt();

            if(kor<0)
                break;
            int score = (kor+eng+math)/3;
            char result = switch (score/10){
                case 10, 9 -> 'A';
                case 8 -> 'B';
                case 7 -> 'C';
                case 6 -> 'D';
                default -> 'E';
            };
            System.out.println("당신의 성적 등급은 "+result+"입니다.");

        }
        sc.close();
        System.out.println("프로그램을 종료합니다!");
    }
}
