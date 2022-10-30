package baitap1toi9;
import java.util.Scanner;

public class btso2{

    private int d;
    private int r;

    public btso2() {
        d = 0;
        r = 0;
    }
    public btso2(int d,int r) {
        this.d = d;
        this.r = r;
    }
    public btso2(btso2 orther) {
        this.d = orther.d;
        this.r = orther.r;
    }

    public void setD(int d) {
        this.d = d;
    }
    public void setD() {
        System.out.print("\nMoi ban nhap chieu dai: ");
        d = Integer.parseInt(sc.nextLine());
    }

    public void setR(int r) {
        this.r = r;
    }
    public void setR() {
        System.out.print("Moi ban nhap chieu rong: ");
        r = Integer.parseInt(sc.nextLine());
    }

    public int getD() {
        return d;
    }

    public int getR() {
        return r;
    }

    public void nhap() {
        setD();
        setR();
    }

    public void xuat() {
        System.out.println("Dai la: " + getD());
        System.out.println("Rong la: " + getR());
    }

    double chuvi(){
        return 2*(d+r);
    }

    double dientich(){
        return d*r;
    }
    
    static Scanner sc = new Scanner(System.in);
    public void luachon2(){
        System.out.println("Moi ban lua chon \n" +
                           "1. Tinh chu vi hinh chu nhat \n" +
                           "2. Tinh dien tich hinh chu nhat \n");
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
                System.out.println("Chu vi hinh chu nhat la: " + chuvi());
                break;
            }

            case 2:{
                System.out.println("Dien tich hinh chu nhat la: " + dientich());
                break;
            }
        }
    }
}
