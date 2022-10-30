package baitap1toi9;
import java.util.Scanner;

public class btso1 {

    private int a;
    private int b;

    public btso1(){  
        a = 0;
        b = 0;
    }
    public btso1(int a,int b) { 
        this.a = a;
        this.b = b;
    }
    public btso1(btso1 orther) {  
        this.a = orther.a;
        this.b = orther.b;
    }
    
    public void setA(int a) {  
        this.a = a;
    }
    public void setA() {
        System.out.print("Nhap so a: ");
        a = Integer.parseInt(sc.nextLine());
    }

    public void setB(int b) {
        this.b = b;
    }
    public void setB() {
        System.out.print("Nhap so b: ");
        b = Integer.parseInt(sc.nextLine());
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void nhap(){
        System.out.println("\nHay nhap 2 so nguyen: ");
        setA();
        setB();
    }

    public void xuat() {
        System.out.println(getA());
        System.out.println(getB());
    }

    int tong(){
        return a+b;
    }

    int hieu() {
        return a-b;
    }

    int tich(){
        return a*b;
    }

    double thuong(){
        double a1 = a;
        double b1 = b;
        return a1/b1;
    }

    static Scanner sc = new Scanner(System.in);
    public void luachon1(){
        System.out.println(" \n Moi ban lua chon \n" +
                           "1. In ra tong \n" +
                           "2. In ra hieu \n" +
                           "3. In ra tich \n" +
                           "4. In ra thuong");
        String op;
        do{
            System.out.print("Moi ban nhap lua chon: ");
            op = sc.nextLine();
            if(Integer.parseInt(op)>4 || Integer.parseInt(op)<1){
                System.out.println("Ban da nhap sai, moi nhap lai!");
            }
        }while(Integer.parseInt(op)>4 || Integer.parseInt(op)<1);
            
        switch(Integer.parseInt(op))
        {
            case 1:{
                System.out.println("Tong cua 2 so la: " + tong());
                break;
            }

            case 2:{
                System.out.println("Hieu cua 2 so la: " + hieu());
                break;
            }

            case 3:{
                System.out.println("Tich cua 2 so la: " + tich());
                break;
            }

            case 4:{
                System.out.println("Thuong cua 2 so la: " + thuong());
                break;
            }
        }
    }
}
