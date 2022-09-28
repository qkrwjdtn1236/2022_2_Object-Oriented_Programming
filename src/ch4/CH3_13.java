package ch4;

import java.util.Scanner;

public class CH3_13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("철수 : ");
        String player1 = sc.next();
        System.out.print("영희 : ");
        String player2 = sc.next();

        if (player1.equals(player2)){
            System.out.println("무승부");
        }
        else if (player1.equals("r")){
            if(player2.equals("p"))
                System.out.println("영희, 승!");
            else if(player2.equals("s"))
                System.out.println("철수, 승!");
        }
        else if (player1.equals("p")){
            if(player2.equals("r"))
                System.out.println("철수, 승!");
            else if(player2.equals("s"))
                System.out.println("영희, 승!");
        }
        else if (player1.equals("s")){
            if(player2.equals("r"))
                System.out.println("영희, 승!");
            else if(player2.equals("p"))
                System.out.println("철수, 승!");
        }
    }
}
