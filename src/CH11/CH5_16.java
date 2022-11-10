package CH11;

import java.util.Scanner;

public class CH5_16 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String s = in.next();

        Day day = Day.valueOf(s.toUpperCase());

        dayIsLike(day);
    }

    static void dayIsLike(Day day){
        switch(day){
            case MONDAY -> System.out.println("월요일은 싫다.");
            case FRIDAY -> System.out.println("금요일은 좋다.");
            case SATURADAY,SUNDAY -> System.out.println("주말이 최고");
            default -> System.out.println("주중은 별로");
        }
    }
}

enum  Day{
    MONDAY,FRIDAY, SUNDAY,SATURADAY;
}
