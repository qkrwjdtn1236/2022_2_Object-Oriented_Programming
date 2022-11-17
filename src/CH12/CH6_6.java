package CH12;

public class CH6_6 {
    public static void main(String[] args){
//        Parent p;
//        p = new Parent();
//        p.print();
//
//        p = new Child();
//
//        p.print();

        Parent p;
        Child c = new Child();
        p = c;
        System.out.println(p.name);
        p.print();
    }
}
class Parent{
    String name = "영조";
    void print(){
        System.out.println(this.name);

    }
}

class Child extends Parent{
    String name = "사도세자";
    void print(){
        System.out.println("나는 "+this.name+"이다.");
    }
}