package CH13;

public class CH7_3 {
     public static void main(String[] args){
        Notebook n = new Notebook();

        n.turnOn();
        n.turnOff();
        n.inMyBag();
     }
}

class Computer implements Controllable{
    @Override
    public void turnOn() {
        System.out.println("TV를 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끈다.");
    }
}

interface Controllable{
    default void repair(){
        show("장비를 수리한다.");
    }

    static void reset(){
        System.out.println("장비를 초기화한다.");
    }
    private void show(String s){
        System.out.println(s);
    }

    void turnOn();
    void turnOff();
}

interface Portable extends Controllable{
    void inMyBag();
}

class Notebook extends Computer implements Portable{
    @Override
    public void turnOn() {
        System.out.println("노트북을 켠다.");
    }

    @Override
    public void turnOff() {
        System.out.println("노트북을 끈다.");
    }

    @Override
    public void inMyBag() {
        System.out.println("노트북은 가방에 있다.");
    }
}