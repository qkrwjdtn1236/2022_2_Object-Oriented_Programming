package ch5;

public class CH4_14 {
    public static void main(String[] args){
        Member2 a = new Member2("홍길동","h123",701011);
        Member2 b = new Member2("홍길동","h456",701011);
        Member2 c = new Member2("홍길동","h789");

        System.out.println(a.isSameMember(b));
        System.out.println(a.isSameMember(c));
    }
}

class Member2{
    private String name, id;
    private int birthday;

    Member2(String name,String id, int birthday){
        this(name,id);
        this.birthday = birthday;
    }
    Member2(String name,String id){
        this.name = name;
        this.id = id;
    }
    boolean isSameMember(Member2 m){
        return this.name == m.name && this.birthday == m.birthday;
    }
}
