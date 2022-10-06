package ch5;

public class ExeDog {
    public static void main(String[] args){
        Dog d1 = new Dog("망고","골든리트리버",2);
        d1.wag();
        d1.bark();
        Dog d2 = new Dog("까미","믹스",3);
        d2.wag();
        d2.bark();
    }
}

class Dog{
    String name;
    String jong;
    int age;
    Dog(String name, String jong, int age){
        this.name = name;
        this.jong = jong;
        this.age = age;

        System.out.println("이름 : "+name);
        System.out.println("품종 : "+jong);
        System.out.println("나이 : "+age);

    }
    void wag(){
        System.out.println(this.name+"가 살랑살랑~");
    }
    void bark(){
        System.out.println(this.name+"가 멍멍!");
    }

}