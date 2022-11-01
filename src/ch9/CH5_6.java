package ch9;

import java.util.Scanner;

public class CH5_6 {
    public static void main(String[] args){
        String hiddenString = "hello";
        StringBuffer outputString = new StringBuffer();
        outputString.append("-".repeat(hiddenString.length()));

        Scanner scan = new Scanner(System.in);
        System.out.printf("단어(%d글자): %s\n",
                hiddenString.length(),outputString);

        while(!hiddenString.equals(outputString.toString())){

            System.out.print("1 문자를 입력하세요 : ");
            char user = scan.next().charAt(0);

            for(int i = 0;i<hiddenString.length();i++)
            {
                if(hiddenString.charAt(i) == user){
                    outputString.setCharAt(i,user);
                }
            }
            System.out.printf("단어(%d글자): %s\n",
                    hiddenString.length(),outputString);
        }
        System.out.println("축하합니다");
    }
}
