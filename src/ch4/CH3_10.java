package ch4;

import java.util.Scanner;
// 4주차 참여 과제 항목까지
public class CH3_10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String result;

        int rank;
        while((rank = sc.nextInt()) !=0){
            result = switch(rank){

                case 1 -> "아주 잘했습니다.";
                case 2,3 -> "잘했습니다.";
                case 4,5,6 -> "보통입니다.";
                default -> "노력해야 겠습니다.";
            };
            System.out.println(result);
        }
    }
}
