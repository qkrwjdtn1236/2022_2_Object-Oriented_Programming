package CH13;

public class CH7_2 {
    public static void main(String[] args){
        Human.echo();
        Worker p = new Worker();
        p.print();
        p.eat();

        Student s = new Student(20);
        s.print();
        s.eat();
    }
}

class Student implements Human{
    int age;
    Student(int age){
        this.age = age;
    }

    @Override
    public void print() {
        System.out.println(this.age+"세의 학생입니다.");
    }

    @Override
    public void eat() {
        System.out.println("도시락을 먹습니다.");
    }
}
