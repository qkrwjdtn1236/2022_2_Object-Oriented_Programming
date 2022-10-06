package ch06;

import java.util.Scanner;

public class CH4_8_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("반지름 입력 : ");
        double r = sc.nextDouble();

        System.out.print("높이 입력 : ");
        double h = sc.nextDouble();

        Cylinder cylinder = new Cylinder(r,h);
        System.out.println("원기둥의 부피 = "+cylinder.findVolume());
    }
}

class Cylinder{
    private double r;
    private double h;

    Cylinder(double r,double h){
        this.r = r;
        this.h = h;
    }

    public double findVolume() {
        return r*r*h*3.14;
    }
}
