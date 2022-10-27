package project;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args){
        ttt game = new ttt();
    }
}

class ttt{
    Scanner sc;
    int winCount;
    int loseCount;

    char[] playerList;
    ttt(){

        sc = new Scanner(System.in);
        this.titlePrint();
        int selectCase = sc.nextInt();

        switch (selectCase){
            case 1->singleGameStart();
            case 2->doubleGameStart();
            case 3->showWinLose();
        }
    }

    void titlePrint(){
        System.out.println("-------------------------");
        System.out.println("------Tic Tac Toe--------");
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("1번 : 봇전");
        System.out.println("2번 : 친구전");
        System.out.println("3번 : 전적");
        System.out.println("4번 : 종료");
        System.out.printf("%10s : ","게임모드 숫자 입력");

    }

    void singleGameStart(){
        whoFirstRound(1);

    }
    void doubleGameStart(){
        whoFirstRound(2);

    }
    void showWinLose(){
        System.out.println("당신의 전적은?");
        System.out.println("승리 : "+this.winCount);
        System.out.println("패배 : "+this.loseCount);
    }

    void whoFirstRound(int mode){

        Random random = new Random();
        int result = random.nextInt(1)+1;

        if(mode == 1){
            switch (result) {
                case 1 -> {
                    this.playerList = new char[]{'O', 'X'};
                    System.out.println("당신이 선공입니다.(모양 : O)");
                }
                case 2 -> {
                    this.playerList = new char[]{'X', 'O'};
                    System.out.println("봇이 선공입니다.(모양 : X)");
                }
            }
        }else if(mode == 2){
            switch (result) {
                case 1 -> {
                    this.playerList = new char[]{'O', 'X'};
                    System.out.println("당신이 선공입니다.(모양 : O)");
                }
                case 2 -> {
                    this.playerList = new char[]{'X', 'O'};
                    System.out.println("봇이 선공입니다.(모양 : X)");
                }
            }
        }
    }
}
