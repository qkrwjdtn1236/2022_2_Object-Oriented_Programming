package project;
import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args){
        ttt game = new ttt();
    }
}

class ttt{
    Scanner sc = new Scanner(System.in);
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
            case 3->gameEnd();
        }
    }
    void gameEnd(){
        return;
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

    void printTTTBoard(){
        System.out.println("---------------------------");
        for(int i = 0;i<this.board.length;i++)
        {
            for(int j = 0;j<this.board[i].length;j++)
            {
                if(this.board[i][j] == '\u0000'){
                    System.out.print(" | ");

                    continue;
                }else {
                    System.out.printf(" %c ", this.board[i][j]);
                }
            }
            System.out.println();
        }
        System.out.println("---------------------------");
    }

    boolean singleGameStart(){ // 플레이어가 게임에서 이긴 경우 true, 진 경우 false로 리턴함
        for(int i = 0;i<3;i++)
        {

            this.board = new char[3][3];
            whoFirstRound();
            int round = 0;
            printTTTBoard();
            while(!(this.isGameEnd(this.board,'O') || this.isGameEnd(this.board,'X'))){

                if(round == this.board.length*this.board[0].length){
                    System.out.println("무승부");
                    break;
                }

                if(this.playerList[round%this.playerList.length] == 'O'){ // 플레이어 인 경우
                    inputPos("플레이어");
                    if (isGameEnd(this.board,'O')){
                        System.out.println(this.playerList[round%this.playerList.length]+"말 승리");
                        this.winCount++;
                        break;
                    }
                }else{
                    if(botProcess(this.board)){
                        printTTTBoard();
                        System.out.println(this.playerList[round%this.playerList.length]+"말 승리");
                        this.loseCount++;
                        break;
                    }
                }

                printTTTBoard();
                round++;
//            rotateTTT();
//            reverseRock();
            }


        }

        if(this.winCount>this.loseCount){
            System.out.println("최종 승리 : 플레이어");
            return true;
        }
        else if ((this.winCount == 0)&&(this.loseCount == 0))
            singleGameStart();
        else{
            System.out.println("최종 승리 : 봇");
            return false;
        }
        return false;
    }

    private boolean botProcess(char[][] board) { // 컴퓨터가 수를 두는 것을 작동하는 메소드
        char[][] copyBoard = new char[board.length][board[0].length];

        for(int i = 0; i < copyBoard.length; i++){ // 반복문 + ArrayCopy
            System.arraycopy(board[i], 0, copyBoard[i], 0, copyBoard[i].length);
        }
        if(0.3<Math.random()){ // 봇 실력 떨구기 위함.
            for(int i = 0;i<copyBoard.length;i++){ // 모든 수의 공간 탐색 , 봇이 이긴 수인지 확인하기 위한 반복문

                //시뮬레이터 할 보드 배열를 구하고 처리해야함.

                for(int j = 0;j<copyBoard[i].length;j++)
                {
                    if(copyBoard[i][j] == '\u0000'){ // char 초기 값이 \u0000 이거라고 함
                        // 수를 두지 않은 값을 때 조건문 true 발생
                        copyBoard[i][j] = 'X';
                        if(isGameEnd(copyBoard,'X')){ // 봇이 이길 수 있는 수를 찾는 과정, 즉 봇이 이긴 판인지 확인
                            this.board[i][j] = 'X';
                            return true; // 봇이 게임에서 인긴 경우 true 리턴
                        }
                        copyBoard[i][j] = '\u0000'; // 현재 상태의 보드
                    }
                }
            }
        }

        if(0.5<Math.random()){ // 봇 실력 떨구기 위함.
            for(int i = 0;i<copyBoard.length;i++) // 플레이어가 이긴 수를 탐색하기 위한 반복문
            {
                for(int j = 0;j<copyBoard[i].length;j++)
                {
                    if(copyBoard[i][j] == '\u0000'){ // char 초기 값이 \u0000 이거라고 함
                        // 수를 두지 않은 값을 때 조건문 true 발생
                        copyBoard[i][j] = 'O';
                        if(isGameEnd(copyBoard,'O')){ // 플레이어가 이길 수 있는 수를 찾는 과정, 즉 봇이 이긴 판인지 확인
                            this.board[i][j] = 'X';
                            return false; // 게임에서 봇이 게임에서 이긴 것이 아니거나 게임 진행 중인 상태
                        }
                        copyBoard[i][j] = '\u0000'; // 현재 상태의 보드로 변환 (다음 연산하기 위해 마무리하는 과정)
                    }
                }
            }
        }

        int x,y;
        do{
            Random random = new Random();

            x = random.nextInt(this.board[0].length);
            y = random.nextInt(this.board.length);
        }while(this.board[y][x] != '\u0000');

        this.board[y][x] = 'X';
        return false; // 게임에서 봇이 게임에서 이긴 것이 아니거나 게임 진행 중인 상태, 이 코드가 실행이 안되어야 함(실행 된다는 건 조건문이 잘 작동 안하는 것임을 의미)

//        for(int i = 0;i<copyBoard.length;i++) // 봇, 플레이어가 이길 수 있는 수가 없을 때 실행하는 반복문
//        {
//            for(int j = 0;j< copyBoard.length;j++)
//            {
//                if(copyBoard[i][j] == '\u0000'){
//                    this.board[i][j] = 'X';
//                    return false;
//                }
//            }
//        }

    }

    void showWinLose(){
        System.out.println("당신의 전적은?");
        System.out.println("승리 : "+this.winCount);
        System.out.println("패배 : "+this.loseCount);
    }

    void whoFirstRound() {
        Random random = new Random();
        int result = random.nextInt(2) + 1;
        System.out.println(result);
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
        if (tttboard[0][0] == shape && tttboard[1][1] == shape && tttboard[2][2] == shape){
            System.out.println("case 1");return true;

        }

        if (tttboard[2][0] == shape && tttboard[1][1] == shape && tttboard[0][2] == shape){
            System.out.println("case 2");
            return true;

        }

        for(int i = 0;i<tttboard.length;i++)
            if ((tttboard[i][0] == shape) && (tttboard[i][1] ==shape) && (tttboard[i][2]==shape)) {
                System.out.println(shape+"case 3");
                return true;
            }

        for(int i = 0;i<tttboard.length;i++)
            if ((tttboard[0][i] == shape) && (tttboard[1][i] ==shape) && (tttboard[2][i]==shape)) {
                System.out.println(shape+"case 4");
                return true;
            }

        return false;
    }

    void inputPos(String name){
        int x,y;
        do{
            System.out.println("위치를 입력하세요.");
            System.out.println(name+"님 x,y 좌표 입력해주세요.");
            x = this.sc.nextInt()-1;
            y = this.board.length - this.sc.nextInt();
        }while((this.board[y][x] == 'O') || (this.board[y][x] == 'X'));
        board[y][x] = 'O';
    }

    void rotateTTT(){ // ttt보드에서 상하반전 해주는 메소드
        Random rand = new Random();
        int[] degreeList = {90,180,270};

        char[][] copyBoard = new char[board.length][board[0].length];

        for(int i = 0; i < copyBoard.length; i++){ // 반복문 + ArrayCopy
            System.arraycopy(board[i], 0, copyBoard[i], 0, copyBoard[i].length);
        }

        int n = this.board.length;
        int m = this.board[0].length;

        int degree = degreeList[rand.nextInt(degreeList.length)];
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                switch (degree) {
                    case 90 -> this.board[i][j] = this.board[n - 1 - j][i];
                    case 180 -> this.board[i][j] = this.board[n - 1 - i][m - 1 - j];
                    case 270 -> this.board[i][j] = this.board[j][m - 1 - i];
                }
            }
        }
    }

    char[][] reverseRock(){

        char[][] copyBoard = new char[board.length][board[0].length];

        for(int i = 0; i < copyBoard.length; i++){ // 반복문 + ArrayCopy
            System.arraycopy(board[i], 0, copyBoard[i], 0, copyBoard[i].length);
        }

        for(int i = 0;i<copyBoard.length;i++)
        {
            for(int j = 0;j<copyBoard[i].length;j++)
            {
                if(copyBoard[i][j] == 'X')
                    copyBoard[i][j] = 'O';
                else if(copyBoard[i][j] == 'O')
                    copyBoard[i][j] = 'X';
            }
        }

        return copyBoard;
    } // 수의 모양을 바꾸는 메소드
}
