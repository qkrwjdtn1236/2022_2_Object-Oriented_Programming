package ch4;

public class CH3_7 {
    public static void main(String[] args){
        for(int i = 3;i<=20;i++)
        {
            for(int j = 3;j<=20;j++)
            {
                for(int k = 3;k<=20;k++)
                {
                    if(i*i + j*j == k*k){
                        System.out.printf("%2d, %2d, %2d\n",i,j,k);
                    }
                }
            }
        }
    }
}
