package ch9;

import java.util.Random;
import java.util.Scanner;

public class CH5_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // 스케너 객체
        int cnt = 0; // 몇번 반복해서 실행하는건지 개수 측정

        int com[] = computerNumber(); // 컴퓨터에 난수 구한후 배열에 치한
        int[] userNum = new int[3]; // 유저 숫자 입력
        while(!is3Strike(userNum,com)){ // 3스트라이크가 안될경우 반복실행
            for(int i = 0;i<userNum.length;i++) // 3번만큼 반복
            {
                System.out.print((i+1)+"번째 수 : ");

                userNum[i] = sc.nextInt(); // 1번째 숫자 입력
                while((userNum[i]>=10 || userNum[i]<=0)){ // 입력한 숫자가 0이하, 10이상 입력할 경우 다시 입력하는 무한루프
                    System.out.println("경고 ! 1이상, 10미만인 숫자를 입력해주세요.");
                    System.out.print((i+1)+"번째 수 : ");
                    userNum[i] = sc.nextInt(); // i번재 숫자 입력
                }
            }
            int[] result = ballStrikeProcess(userNum,com); // 스트라이크 볼 측정하는 메소드 실행
            System.out.printf("%d 스크라이크 %d 볼\n",result[1],result[0]); // 스트라이크 볼 출력
            cnt++;
        }
        System.out.printf("%d번째 시도 성공\n",cnt); // 3스트라이크시 n번째 시도
    }
    static int[] computerNumber(){
        int com[] = new int[3];
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        while(com[0] == 0)
            com[0] = r.nextInt(10);
        while(com[1] == com[0] || com[1] == 0)
            com[1] = r.nextInt(10);
        while(com[2] == com[0] || com[2] == com[1] || com[2] == 0)
            com[2] = r.nextInt(10);

        for(int i = 0;i<com.length;i++)
            System.out.printf("com[%d] = %d\n",i,com[i]);
        return com;
    }
    static int[] ballStrikeProcess(int num1[],int num2[]){ // 비교할 대상 배열 2개 매개변수
        int strike = 0, ball = 0;
        for(int i = 0;i<num1.length;i++) // 3번 반복
        {
            for(int j = 0;j<num1.length;j++){
                if(num1[i] == num2[j]){ //ball 인 경우
                    if(i == j) // 스트라이크 인 경우
                        strike++;
                    else
                        ball++;
                }
            }
        }
        return new int[]{ball,strike};
    }
    static boolean is3Strike(int num1[],int num2[]){ // 3스트라이크인지 확인하는 boolean
        for(int i = 0;i<num1.length;i++)
        {
            if(num1[i] != num2[i])
                return false;
        }
        return true;
    }
}
