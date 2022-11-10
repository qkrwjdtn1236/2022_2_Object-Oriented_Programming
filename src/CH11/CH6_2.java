package CH11;

public class CH6_2 {
    public static void main(String[] args){
        BadBank b1 = new BadBank();
        NormalBank b2 = new NormalBank();
        GoodBank b3 = new GoodBank();

        System.out.println("BadBank의 이자율 : "+b1.getInt_rate()+"%");

        System.out.println("NormalBank의 이자율 : "+b2.getInt_rate()+"%");

        System.out.println("GoodBank의 이자율 : "+b3.getInt_rate()+"%");
    }
}


class Bank{
    double rate = 0.01;

    double getInt_rate(){
        return rate;
    }
}

class BadBank extends Bank{
    double getInt_rate(){
        super.rate = 10.0;
        return super.rate;
    }
}

class NormalBank extends Bank{
    double getInt_rate(){
        super.rate = 5.0;
        return super.rate;
    }
}
class GoodBank extends Bank{
    double getInt_rate(){
        super.rate = 3.0;
        return super.rate;
    }
}