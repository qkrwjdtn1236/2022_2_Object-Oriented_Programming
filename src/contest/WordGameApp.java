package contest;

import java.util.Scanner;

public class WordGameApp {
    Scanner sc = new Scanner(System.in);

    String startWord = "국민대";
    static Player[] players;
    void run(){
        this.createPlayers();
        System.out.print("참가자 명단 : ");

        String[] playerList = new String[players.length];

        for(int i = 0;i<players.length;i++)
        {
            System.out.print(players[i].getName()+" ");
            playerList[i] = players[i].getName();
        }

        System.out.printf("\n시작하는 단어는 %s 입니다.\n",this.startWord);

        int round = 0;
        System.out.print(playerList[round]+">>");
        players[round%players.length].getWordFromUser();

        while(true){
            // System.out.println(this.startWord);
            if(!(players[round%players.length].checkSuccess(this.startWord)))
                break;

            this.startWord = players[round%players.length].word;
            //System.out.println(this.startWord);
            round++;

            System.out.print(playerList[round%players.length]+">>");
            players[round%players.length].getWordFromUser();
        }
        System.out.print(playerList[round%players.length]+"이 졌습니다.");
    }
    void createPlayers(){
        System.out.print("게임에 참가하는 인원은 몇명입니까>>");
        int cnt = sc.nextInt();

        players = new Player[cnt];

        for(int i = 0;i<cnt;i++)
        {
            System.out.print("참가자의 이름을 입력하세요 : ");
            players[i] = new Player(sc.next());
        }
    }

    public static void main(String[] args){
        WordGameApp wordGameApp = new WordGameApp();
        wordGameApp.run();
    }
}

class Player{
    String name;
    String word;
    Scanner sc = new Scanner(System.in);
    String getName(){
        return this.name;
    }

    Player(String name){
        this.name = name;
    }
    String getWordFromUser(){
        this.word = sc.next();
        return this.word;
    }
    boolean checkSuccess(String lastWord){
        //System.out.printf("%c %c",this.word.charAt(0),lastWord.charAt(lastWord.length()-1));
        return this.word.charAt(0) == lastWord.charAt(lastWord.length()-1);
    }
}