package ch9;

public class CH5_14 {
    public static void main(String[] args){
        int arr[][] = new int[5][5];
        int index = 1;
        for(int i = arr.length-1;i>=0;i--)  {
            for(int j = arr.length-1;j>=i;j--)
                arr[arr.length-1-i][j] = index++;
        }
        for(int i = 0;i<arr.length;i++) {
            for(int j = 0;j<arr[i].length;j++)
                System.out.printf("%2d",arr[i][j]);
            System.out.println();
        }
    }
}
