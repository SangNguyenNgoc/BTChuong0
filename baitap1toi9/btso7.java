package baitap1toi9;

import java.util.Scanner;

public class btso7 {

    private int n;

    public btso7() {
        n = 0;
    }

    public btso7(int n) {
        this.n = n;
    }

    public btso7(btso7 orther) {
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

    void choice1_in_7() {
        int t = 0;
        System.out.print("\nCac so tu nhien <=N la:  ");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
            t = t + i;
        }
        System.out.println("\nTong cua chung la: " + t);
    }

    void choice2_in_7() {
        int t = 0;
        System.out.print("\nCac so tu nhien chan <=N la:  ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                t = t + i;
            }
        }
        System.out.println("\nTong cua chung la: " + t);
    }

    void choice3_in_7() {
        int t = 0;
        System.out.print("\nCac so tu nhien le <=N la:  ");
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                t = t + i;
            }
        }
        System.out.println("\nTong cua chung la: " + t);
    }

    void choice4_in_7() {
        int t = 0;
        System.out.print("\nCac so tu nhien la so nguyen to <=N la:  ");
        for (int i = 0; i <= n; i++) {
            if (btso6.kiemtra(i)) {
                System.out.print(i + " ");
                t = t + i;
            }
        }
        System.out.println("\nTong cua chung la: " + t);
    }

    void choice5_in_7() {
        int i = 2, dem = 0;
        System.out.print("\nN so nguyen to dau tien la: ");
        while (dem < n) {
            if (btso6.kiemtra(i)) {
                System.out.print(i + " ");
                dem++;
            }
            i++;
        }
        System.out.println("\n");
    }

    static Scanner sc = new Scanner(System.in);

    public void luachon7() {
        System.out.println("\n1. Xuat cac so tu nhien <=N va tong cua chung\n" +
                "2. Xuat cac so tu nhien chan <=N va tong cua chung\n" +
                "3. Xuat cac so tu nhien le <=N va tong cua chung\n" +
                "4. Xuat cac so tu nhien la so nguyen to <=N va tong cua chung\n" +
                "5. Xuat N so nguyen to dau tien\n");

        String op;
        do {
            System.out.print("Moi ban nhap lua chon: ");
            op = sc.nextLine();
            if (Integer.parseInt(op) > 5 || Integer.parseInt(op) < 1) {
                System.out.println("Ban da nhap sai, moi nhap lai!");
            }
        } while (Integer.parseInt(op) > 5 || Integer.parseInt(op) < 1);

        switch (Integer.parseInt(op)) {
            case 1: {
                choice1_in_7();
                break;
            }

            case 2: {
                choice2_in_7();
                break;
            }

            case 3: {
                choice3_in_7();
                break;
            }

            case 4: {
                choice4_in_7();
                break;
            }

            case 5: {
                choice5_in_7();
                break;
            }
        }
    }
}
