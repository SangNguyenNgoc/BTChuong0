package baitap1toi9;

import java.util.Scanner;

public class btso9 {
    private String s;
    static Scanner sc = new Scanner(System.in);

    public btso9() {
        s = null;
    }

    public btso9(String s) {
        this.s = s;
    }

    public btso9(btso9 orther) {
        this.s = orther.s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public void setS() {
        System.out.print("Moi nhap chuoi: ");
        s = sc.nextLine();
    }

    public String getS() {
        return s;
    }

    public void nhap() {
        setS();
    }

    public void xuat() {
        System.out.println("Chuoi la: " + getS());
    }

    int choice1_in_9() {
        return s.length();
    }

    String choice2_in_9() {
        return s.replaceAll("\\s\\s+", " ").trim();
    }

    void choice3_int_9() {
        String str = choice2_in_9();
        String[] tu = str.split(" ");
        int dodai = tu.length;
        System.out.println("So tu trong chuoi: " + dodai);
        for (int i = 0; i < dodai; i++) {
            System.out.println(tu[i]);
        }
    }

    void choice4_in_9() {
        System.out.print("Hay nhap so k: ");
        int k = Integer.parseInt(sc.nextLine());
        System.out.println("Ben trai: " + s.substring(0, k));
        System.out.println("Ben phai: " + s.substring(s.length() - k));
    }

    void choice5_in_9() {
        System.out.print("Hay nhap so k: ");
        int k = Integer.parseInt(sc.nextLine());
        System.out.print("Hay nhap so n: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("n ki tu tu vi tri k: " + s.substring(k, k + n));
    }

    public void luachon9() {
        System.out.println("\n1. Xuat ra do dai cua chuoi\n" +
                "2. Xoa bo khoang trang thua cua chuoi\n" +
                "3. Dem so tu cua chuoi va xuat moi tu nam tren 1 dong\n" +
                "4. Nhap so tu nhien k, xuat k ki tu ben phai, k ki tu ben trai cua chuoi\n" +
                "5. Nhap 2 so k, n, xuat n ki tu cua chuoi tu vi tri k\n");

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
                System.out.println("Do da cua chuoi: " + choice1_in_9());
                break;
            }

            case 2: {
                s = choice2_in_9();
                System.out.println("Sau khi xoa bo khoang trang: " + s);
                break;
            }

            case 3: {
                choice3_int_9();
                break;
            }

            case 4: {
                choice4_in_9();
                break;
            }

            case 5: {
                choice5_in_9();
                break;
            }
        }

    }
}
