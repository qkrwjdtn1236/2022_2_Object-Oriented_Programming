package ch9;

public class CH5_2 {
    public static void main(String[] args){
        System.out.println(countChar("Jazz",'z'));
    }

    static int countChar(String s,char c){
        int cnt = 0;
        for(int i = 0;i<s.length();i++){
            if (s.charAt(i) == c)
                cnt++;
        }
        return cnt;
    }
}
