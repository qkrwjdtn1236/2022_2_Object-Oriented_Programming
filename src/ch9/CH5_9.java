package ch9;

import java.util.Random;
import java.util.Scanner;

public class CH5_9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = 0;

        int com[] = computerNumber();
        int[] userNum = new int[3];
        while(!is3Strike(userNum,com)){
            for(int i = 0;i<userNum.length;i++)
            {
                System.out.print((i+1)+"번째 수 : ");

                userNum[i] = sc.nextInt();
                while((userNum[i]>=10 || userNum[i]<=0)){
                    System.out.println("경고 ! 1이상, 10미만인 숫자를 입력해주세요.");
                    System.out.print((i+1)+"번째 수 : ");
                    userNum[i] = sc.nextInt();
                }
            }
            int[] result = ballStrikeProcess(userNum,com);
            System.out.printf("%d 스크라이크 %d 볼\n",result[1],result[0]);
            cnt++;
        }
        System.out.printf("%d번째 시도 성공\n",cnt);
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

//        for(int i = 0;i<com.length;i++)
//            System.out.printf("com[%d] = %d\n",i,com[i]);
        return com;
    }
    static int[] ballStrikeProcess(int num1[],int num2[]){
        int strike = 0, ball = 0;
        for(int i = 0;i<num1.length;i++)
        {
            for(int j = 0;j<num1.length;j++){
                if(num1[i] == num2[j]){ //ball 인경우
                    if(i == j)
                        strike++;
                    else
                        ball++;
                }
            }
        }
        return new int[]{ball,strike};
    }
    static boolean is3Strike(int num1[],int num2[]){
        for(int i = 0;i<num1.length;i++)
        {
            if(num1[i] != num2[i])
                return false;
        }
        return true;
    }
}
