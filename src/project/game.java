package project;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args){
        ttt game = new ttt();
    }
}

class ttt{
    Scanner sc = new Scanner(System.in);;
    int winCount;
    int loseCount;

    char[] playerList; // 봇전 모양, 플레이어 모양

    char[][] board;

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
        this.board = new char[3][3];
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
                    System.out.println("플레이어1 선공입니다.");
                }
                case 2 -> {
                    this.playerList = new char[]{'X', 'O'};
                    System.out.println("플레이어2 선공입니다.");
                }
            }
        }
    }
    boolean isGameEnd(char[][] tttboard,char shape){
        if (tttboard[0][0] == shape && tttboard[1][1] == shape && tttboard[2][2] == shape)
            return true;

        if (tttboard[2][0] == shape && tttboard[1][1] == shape && tttboard[0][2] == shape)
            return true;

        for(int i = 0;i<tttboard.length;i++)
            if (tttboard[i][0] == shape && tttboard[i][1] ==shape && tttboard[i][2]==shape) return true;

        for(int i = 0;i<tttboard.length;i++)
            if (tttboard[0][i] == shape && tttboard[1][i] ==shape && tttboard[2][i]==shape) return true;

        return false;

    }



    int[] inputPos(String name){
        System.out.println(name+"님 x,y 좌표 입력해주세요.");
        return new int[]{sc.nextInt(), sc.nextInt()};
    }
}
