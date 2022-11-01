package ch9;

import java.util.Scanner;

public class CH5_7 {
    public static void main(String[] args){
        int array[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<array.length;i++)
        {
            System.out.printf("%d번째 입력 : ",i+1);
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for(int i = 1;i<array.length;i++){
            if (array[i] >max)
                max = array[i];
        }
        System.out.println("입력된 수에서 가장 큰 수는 "+max+"입니다.");
    }
}
