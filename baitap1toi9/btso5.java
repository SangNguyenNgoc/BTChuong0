package baitap1toi9;
import java.util.Scanner;

public class btso5 {

    private int n;

    public btso5() {
        n = 0;
    }
    public btso5(int n) {
        this.n = n;
    }
    public btso5(btso5 orther) {
        this.n = orther.n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void setN() {
        System.out.print("\nMoi ban nhap so nguyen N: ");
        n = Integer.parseInt(sc.nextLine());
    }

    public int getN() {
        return n;
    }

    public void nhap() {
        setN();
    }
    public void xuat() {
        System.out.println(" N la: " + getN());
    }
    static Scanner sc = new Scanner(System.in);
    public void luachon5(){
        if(n == 0){
            System.out.println("Zero!");
        }
        else if(n <0){
            System.out.println(n + " la so am");
        }
        else{
            System.out.println(n + " la so duong");
        }    
    } 
}
