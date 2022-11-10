package CH11;

import java.util.Scanner;

public class CH6_1 {
    public static void main(String[] args){
        Average av = new Average();
        Scanner sn = new Scanner(System.in);

        System.out.print("국어 : ");
        av.kor = sn.nextInt();

        System.out.print("수학 : ");
        av.math = sn.nextInt();

        System.out.print("영어 : ");
        av.eng = sn.nextInt();

        av.calc_total();
        av.calc_avr();

    }
}

class Total{
    int kor,math,eng;

    int calc_total(){
        int result = this.kor+this.math+this.eng;
        System.out.println("총점은 "+(result)+"이다.");
        return result;
    }
}

class Average extends Total{
    void calc_avr(){
        System.out.println("평균은 "+(super.calc_total()/3.0)+"이다.");
    }
}
