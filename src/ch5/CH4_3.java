package ch5;

public class CH4_3 {
    public static void main(String[] args){
        Phone myPhone = new Phone();
        myPhone.model = "갤럭시 S8";
        myPhone.value = 100;
        myPhone.print();

        Phone yourPhone = new Phone();
        yourPhone.model = "G6";
        yourPhone.value = 85;
        yourPhone.print();
    }
}
class Phone{
    String model;
    int value;

    void print(){
        System.out.printf("%d만원 짜리 %s 스마트폰\n",this.value,this.model);
    }
}
