package baitap1toi9;

import java.lang.Math;
import java.util.Scanner;

public class btso6 {
    private int n;

    public btso6() {
        n = 0;
    }

    public btso6(int n) {
        this.n = n;
    }

    public btso6(btso6 orther) {
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

    static boolean kiemtra(double n) {
        if (n < 2) {
            return false;
        } else {
            int i = 2;
            boolean snt = true;
            while (i <= Math.sqrt(n * 1.0) && snt == true) {
                if (n % i == 0) {
                    snt = false;
                }
                i++;
            }
            return snt;
        }
    }

    static Scanner sc = new Scanner(System.in);

    public void luachon6() {
        if (kiemtra(n)) {
            System.out.println(n + " la so nguyen to.");
        } else {
            System.out.println(n + " khong la so nguyen to.");
        }
    }
}
