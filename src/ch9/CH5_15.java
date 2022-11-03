package ch9;

public class CH5_15 {
    public static void main(String[] args){
        char alpha[][];
        alpha = makeAlpha();

        for(int i = 0;i<alpha.length;i++)
        {
            for(int j = 0;j<alpha[i].length;j++)
            {
                System.out.printf("%2c",alpha[i][j]);
            }
            System.out.println();
        }
    }

    private static char[][] makeAlpha() {
        char result[][] = new char[5][5];
        char index = 'A';
        for(int i = 0;i<result.length;i++)
        {
            for(int j = 0;j<result[i].length;j++)
            {
                result[i][j] = index++;
            }
        }
        return result;
    }
}
