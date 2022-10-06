package ch5;

public class CH4_4 {
    public static void main(String[] args){
        Phone1 myPhone = new Phone1();
        myPhone.model = "갤럭시 S8";
        myPhone.value = 100;
        myPhone.print();

        Phone1 yourPhone = new Phone1();
        yourPhone.model = "G6";
        yourPhone.value = 85;
        yourPhone = myPhone;
        yourPhone.print();
    }
}

class Phone1{
    String model;
    int value;

    void print(){
        System.out.printf("%d만원 짜리 %s 스마트폰\n",this.value,this.model);
    }
}