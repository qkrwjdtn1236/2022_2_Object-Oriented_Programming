package CH12;

public class CH6_7 {
    public static void main(String[] args){
        Phone[] phones = {new Phone("황건이"),
                new Telephone("길동이","내일"),
                new Smartphone("민국이","빨간색","갤러그")};

        for(Phone phone : phones){

            if(phone instanceof Smartphone){
                ((Smartphone)phone).playGame();
            }else if(phone instanceof Telephone){
                ((Telephone)phone).autoAnswering();
            }
            else {
                phone.talk();
            }
        }
    }
}

class Phone{
    protected String owner;
    Phone(String name){
        this.owner = name;
    }
    void talk(){
        System.out.println(this.owner+"가 통화 중이다.");
    }
}

final class Telephone extends Phone{
    private String when;
    Telephone(String name,String when){
        super(name);
        this.when = when;
    }
    void autoAnswering(){
        System.out.println(super.owner+"가 부재 중이다."+this.when+" 전화 줄래.");
    }
}

final class Smartphone extends Phone{
    private String game;

    Smartphone(String name,String dummy,String game){
        super(name);
        this.game = game;
    }
    void playGame(){
        System.out.println(super.owner+"가 "+this.game+" 게임을 하는 중이다.");
    }
}