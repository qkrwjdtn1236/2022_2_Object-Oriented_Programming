package ch9;

public class CH5_8 {
    public static void main(String[] args){
        char[] alpha = new char[26];

        for(int i = 0;i<alpha.length;i++)
        {
            alpha[i] = (char) ('A'+i);
            for(int j = 0;j<alpha.length;j++)
            {
                System.out.print(alpha[j]);
            }
            System.out.println();
        }
    }
}
