package test;

public class Mathf {
    public static int pow(int a,int b){
        int res = 1;

        while(b!=0){
            if (b %2 != 0){ // 홀수이면
                res*=a;
            }
            a*=a;
            b/=2;
        }
        return res;
    }
}
