package ch4;

import java.util.Scanner;

public class CH3_14 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String c = input("철수");
        String y = input("영희");
        whosWin(c,y);
    }
    static void whosWin(String player1,String player2){
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
    static String input(String name){
        System.out.print(name+" : ");
        return sc.next();
    }

}
