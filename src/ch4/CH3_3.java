package ch4;

public class CH3_3 {
    public static void main(String[] args){

    int i = 2;
    while(i<=9){
        System.out.println(i+"단 출력");
        int j = 1;
        while(j<=9){
            System.out.printf("%d * %d = %d\n",i,j,i*j);
            j++;
        }
        System.out.println();
        i++;
    }

    }
}
