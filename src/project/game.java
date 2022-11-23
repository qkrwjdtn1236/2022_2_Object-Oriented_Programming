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
            case 2->showWinLose();
        }
    }

    void titlePrint(){
        System.out.println("-------------------------");
        System.out.println("------Tic Tac Toe--------");
        System.out.println("-------------------------");
        System.out.println();
        System.out.println("1번 : 봇전");
        System.out.println("2번 : 전적");
        System.out.println("3번 : 종료");
        System.out.printf("%10s : ","게임모드 숫자 입력");

    }

    void singleGameStart(){
        this.board = new char[3][3];
        whoFirstRound();
        int round = 0;
        while(!(this.isGameEnd(this.board,'O') || this.isGameEnd(this.board,'X'))){

//            for(int i = 0;i<this.playerList.length;i++){
//                if(this.playerList[i] == 'O') {
//                    // 플레이어 인경우
//                    inputPos("플레이어");
//                    if (isGameEnd(this.board,'O'))
//
//                }
//            }
            if(this.playerList[round%this.playerList.length] == 'O'){ // 플레이어 인 경우
                inputPos("플레이어");
                if (isGameEnd(this.board,'O')){
                    break;
                }
            }else{
                botProcess(this.board);
            }
            round++;
        }
        System.out.println(this.playerList[round%this.playerList.length]+"말 승리");
    }

    private void botProcess(char[][] board) {

    }

    void showWinLose(){
        System.out.println("당신의 전적은?");
        System.out.println("승리 : "+this.winCount);
        System.out.println("패배 : "+this.loseCount);
    }

    void whoFirstRound() {
        Random random = new Random();
        int result = random.nextInt(1) + 1;

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

    void inputPos(String name){
        int x,y;
        do{
            System.out.println("위치를 입력하세요.");
            System.out.println(name+"님 x,y 좌표 입력해주세요.");
            x = this.sc.nextInt()-1;
            y = this.sc.nextInt()-1;
        }while((this.board[y][x] == 'O') || (this.board[y][x] == 'X')||(x<1)||(y<1));
        board[y][x] = 'O';
    }
}
