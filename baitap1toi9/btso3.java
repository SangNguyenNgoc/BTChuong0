package baitap1toi9;
import java.util.Scanner;

public class btso3 {

    private double r;

    public btso3() {
        r = 0;
    }
    public btso3(Double r) {
        this.r = r;
    }
    public btso3(btso3 orther) {
        this.r = orther.r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public void setR() {
        System.out.print("\nMoi ban nhap ban kinh: ");
        r = Double.parseDouble(sc.nextLine());
    }

    public void nhap() {
       setR();
    }

    public double getR() {
        return r;
    }

    public void xuat() {
        System.out.println("Ban kinh la: " + getR());
    }
    double chuvi(){
        return 2*r*3.14;
    }

    double dientich(){
        return r*r*3.14;
    }

    static Scanner sc = new Scanner(System.in);
    public void luachon3(){
        System.out.println("Moi ban lua chon \n" +
                           "1. Tinh chu vi hinh tron \n" +
                           "2. Tinh dien tich hinh tron \n");
        String op;
        do{
            System.out.print("Moi ban nhap luc chon: ");
            op = sc.nextLine();
            if(Integer.parseInt(op)>2 || Integer.parseInt(op)<1){
                System.out.println("Ban da nhap sai, moi nhap lai!");
            }
        }while(Integer.parseInt(op)>2 || Integer.parseInt(op)<1);

        switch(Integer.parseInt(op))
        {
            case 1:{
                System.out.println("Chu vi hinh tron la: " + chuvi());
                break;
            }

            case 2:{
                System.out.println("Dien tich hinh tron la: " + dientich());
                break;
            }
        }    
    }
}
