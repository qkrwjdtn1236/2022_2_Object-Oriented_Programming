package ch9;

import java.util.Scanner;

public class CH5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text;
        System.out.print("URL을 입력하세요 : ");
        text = sc.next();
        while (!text.equals("bye")) {

            if (text.endsWith("com"))
                System.out.printf("%s은 'com'으로 끝납니다.\n", text);
            else
                System.out.printf("%s은 'com'으로 끝나지 않습니다.\n", text);

            if (text.contains("java"))
                System.out.printf("%s은 'java'를 포함합니다.\n", text);
            else
                System.out.printf("%s은 'java'를 포함하지 않습니다.\n", text);


            System.out.print("URL을 입력하세요 : ");
            text = sc.next();
        }
    }
}
