package baitap1toi9;
import java.util.Scanner;

public class btso4 {

    private int n;

    public btso4() {
        n = 0;
    }
    public btso4(int n) {
        this.n = n;
    }
    public btso4(btso4 orther) {
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
        System.out.println("N la: " + getN());
    }

    static Scanner sc = new Scanner(System.in);
    public void luachon4(){
        if(n%2 == 0)
        {
            System.out.println(n + " la so chan!");
        }
        else{
            System.out.println(n + " la so le!");
        }
    }
}
