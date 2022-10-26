package ch9;

public class CH5_1  {
    public static void main(String[] args){
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("red");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수 : %d",
                Car.getNumOfCar(),Car.getNumOfRedCar());
    }
}


class Car{
    static int redCarCount;
    static int blueCarCount;

    Car(String type){
        if (type.equals("red"))
            redCarCount++;
        else if(type.equals("blue"))
            blueCarCount++;
    }
    static int getNumOfCar(){
        return Car.redCarCount + Car.blueCarCount;
    }
    static int getNumOfRedCar(){
        return Car.redCarCount;
    }
    static int getNumOfBlueCar(){
        return Car.blueCarCount;
    }
}
