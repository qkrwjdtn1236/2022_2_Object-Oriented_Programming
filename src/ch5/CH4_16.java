package ch5;

public class CH4_16 {
    public static void main(String[] args){
        GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("피터");
        g3.print();
    }
}

class GolfClub{
    String kind;
    int number;
    GolfClub(){
        this.number = 7;
        this.kind = "아이언";
    }
    GolfClub(int number){
        this();
        this.number = number;
    }
    GolfClub(String kind){
        this.kind  = kind;
    }
    void print(){
        if (number !=0)
            System.out.printf("%d번 %s입니다.\n",this.number,this.kind);
        else
            System.out.printf("%s입니다.\n",this.kind);
    }
}