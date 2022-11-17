package CH12;

public class CH6_4 {
    public static void main(String[] args){
        Man p = new Man();

        p.setMan("Hong gil dong","010-1111-2222");

        System.out.println(p.getMan());
        Student s = new Student("20211234");


        s.setMan("Kim sil dong","010-1122-3333");

        System.out.println(s.hakbun+ " " + s.getMan());

    }
}

class Man{
    String name, phone;

    void setMan(String namem, String phone){
        this.name = namem;
        this.phone = phone;
    }

    String getMan(){
        return this.name +"HP: "+this.phone;
    }
}

class Student extends Man{
    String hakbun;
    Student(String id){
        this.hakbun = id;
    }
    String getMan(){
        return super.name +" HP: "+super.phone+"(Student)";
    }
}