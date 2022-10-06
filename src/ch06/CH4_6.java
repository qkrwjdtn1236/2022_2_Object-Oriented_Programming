package ch06;

public class CH4_6 {
    public static void main(String[] args){
        Phone myPhone = new Phone();

        myPhone.setModel("갤럭시 S8");
        myPhone.setValue(100);
        myPhone.print();

        Phone yourPhone = new Phone();
        yourPhone.setModel("G6");
        yourPhone.setValue(85);
        yourPhone.print();

    }
}

class Phone{
    private String model;
    private int value;

    void print(){
        System.out.printf("%d만 원짜리 %s 스마트폰\n",this.value,this.model);
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setValue(int value){
        this.value = value;
    }

}