package ch4;
import java.util.Scanner;

public class CH3_2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("5자리 숫자를 입력하세요.");
        int number = sc.nextInt();
        sc.close();

        int odd = 0, even = 0;
        int num = 1;

        while(number%10 !=0 && number >0){
            if ((number%10) %2 == 0)
                even++;
            else
                odd++;

            System.out.printf("%5d의 자리 : %d\n",num,number%10);
            num*=10;
            number/=10;

        }
        System.out.println("짝수의 갯수 : "+even);
        System.out.println("홀수의 갯수 : "+odd);

    }
}
