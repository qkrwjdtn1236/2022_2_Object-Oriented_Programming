package ch9;

import java.util.Scanner;

public class CH5_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("단어 입력 : ");
        String text = sc.next();

        System.out.printf("단어(%d글자): %s",
                text.length(),"-".repeat(text.length()));
    }
}
