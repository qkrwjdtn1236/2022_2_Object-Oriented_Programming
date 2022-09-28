package ch4;

public class gugudan {
    public static void main(String[] args){
        for(int i = 2;i<10;i++)
        {
            for(int j = 1;j<i;j++)
            {
                System.out.printf("%3d",i*j);
            }
            System.out.println();
        }
    }
}
