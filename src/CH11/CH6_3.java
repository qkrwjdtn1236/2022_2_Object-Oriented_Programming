package CH11;

public class CH6_3 {
    public static void main(String[] args){
        Person p = new Person();
        p.setPhone("010-1111-2222");
        System.out.println(p.getPhone());

        Professor a = new Professor();
        a.setPhone("010-1234-5678");
        System.out.println(a.getPhone());
    }
}

class Person{
    String phone;
    void setPhone(String phone){
        this.phone = phone;
    }
    String getPhone(){
        return "Person : "+this.phone;
    }
}

class Professor extends Person{
    String getPhone(){
        return super.getPhone() + "(Professor)";
    }
}
