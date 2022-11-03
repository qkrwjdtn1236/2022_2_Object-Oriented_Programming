package ch9;

public class CH5_13 {
    public static void main(String[] args){
        int[] data = {1,3,5,7,9};
        System.out.print("변환전 :");
        for(int i:data) System.out.printf("%2d",i);
        System.out.println();
        int[] result= reverse(data);
        System.out.print("변환전 :");
        for(int i:result) System.out.printf("%2d",i);
    }
    public static int[] reverse(int[] org){
        int[] result = new int[org.length];
        for(int i = org.length-1;i>=0;i--){
            result[org.length-i-1] = org[i];
        }
        return result;
    }
}
