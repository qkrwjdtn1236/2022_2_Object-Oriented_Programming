package CH13;

interface Human{
    void eat();
    void print();
    static void echo(){
        System.out.println("야호!!!");
    }
}

public class CH7_1 {
    public static void main(String[] args){
        Human.echo();
        Worker p = new Worker();

        p.print();
        p.eat();

    }
}

class Worker implements Human{
    @Override
    public void eat() {
        System.out.println("빵을 먹습니다.");
    }


    @Override
    public void print() {
        System.out.println("인간입니다.");
    }
}

