package baitap1toi9;

import java.util.Scanner;

public class btso8 {

    private int sopt;
    private int[] a;

    public btso8() {
        sopt = 0;
        a = new int[1000];
    }

    public btso8(int sopt, int[] a) {
        this.sopt = sopt;
        this.a = a;
    }

    public btso8(btso8 orther) {
        this.sopt = orther.sopt;
        this.a = orther.a;
    }

    public void setSopt(int sopt) {
        this.sopt = sopt;
    }

    public void setSopt() {
        System.out.print("\nMoi ban nhap so phan tu: ");
        sopt = Integer.parseInt(sc.nextLine());
    }

    public int getSopt() {
        return sopt;
    }

    public void nhap() {
        setSopt();

        for (int i = 0; i < sopt; i++) {
            System.out.print("Phan tu thu " + i + ": ");
            a[i] = Integer.parseInt(sc.nextLine());
        }
    }

    public void xuat() {
        System.out.println("So phan tu la: " + getSopt());
        for (int i = 0; i < sopt; i++) {
            System.out.println("Phan tu thu " + i + " : " + a[i]);
        }
        System.out.println("\n");
    }

    void choice1_in_8() {
        int tong = 0;
        System.out.print("\nCac phan tu cua mang: ");
        for (int i = 0; i < sopt; i++) {
            System.out.print(a[i] + " ");
            tong += a[i];
        }
        System.out.println("\n Tong cac phan tu la: " + tong);
    }

    void choice2_in_8() {
        int tong = 0;
        System.out.print("\nCac phan tu chan cua mang");
        for (int i = 0; i < sopt; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                tong += a[i];
            }
        }
        System.out.println("\n Tong cac phan tu chan la: " + tong);
    }

    void choice3_in_8() {
        int tong = 0;
        System.out.print("\nCac phan tu le cua mang");
        for (int i = 0; i < sopt; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                tong += a[i];
            }
        }
        System.out.println("\n Tong cac phan tu le la: " + tong);
    }

    void choice4_in_8() {
        int tong = 0;
        System.out.print("\nCac phan tu la so nguyen to cua mang");
        for (int i = 0; i < sopt; i++) {
            if (btso6.kiemtra(a[i])) {
                System.out.print(a[i] + " ");
                tong += a[i];
            }
        }
        System.out.println("\n Tong cac phan tu la so nguyen to la: " + tong);
    }

    void choice5_in_8(int k) {
        sopt++;
        for (int i = 0; i < sopt; i++) {
            if (i == sopt - 1) {
                a[i] = k;
            }
        }
    }

    void choice6_in_8(int vt) {
        int i = 0;
        boolean daxoa = false;
        while (i < sopt && daxoa == false) {
            if (i == vt) {
                for (int j = i; j < sopt - 1; j++) {
                    a[j] = a[j + 1];
                }
                a[sopt - 1] = 0;
                sopt--;
                daxoa = true;
            }
            i++;
        }
    }

    int choice7_in_8(int x) {
        int vitri = -1;
        for (int i = 0; i < sopt; i++) {
            if (a[i] == x) {
                vitri = i;
            }
        }
        return vitri;
    }

    static Scanner sc = new Scanner(System.in);

    public void luachon8() {
        System.out.println("\n1. Xuat cac phan tu cua mang a va tong cua chung\n" +
                "2. Xuat cac phan tu chan cua mang a va tong cua chung\n" +
                "3. Xuat cac phan tu le cua mang a va tong cua chung\n" +
                "4. Xuat cac phan tu la so nguyen to va tong cua chung\n" +
                "5. Them 1 phan tu moi vao mang\n" +
                "6. Xoa phan tu thu k cua mang a\n" +
                "7. Nhap 1 so x, kiem tra so x co trong a hay khong, neu co tra ve vi tri cua x");

        String op;
        do {
            System.out.print("Moi ban nhap lua chon: ");
            op = sc.nextLine();
            if (Integer.parseInt(op) > 7 || Integer.parseInt(op) < 1) {
                System.out.println("Ban da nhap sai, moi nhap lai!");
            }
        } while (Integer.parseInt(op) > 7 || Integer.parseInt(op) < 1);

        switch (Integer.parseInt(op)) {
            case 1: {
                choice1_in_8();
                break;
            }

            case 2: {
                choice2_in_8();
                break;
            }

            case 3: {
                choice3_in_8();
                break;
            }

            case 4: {
                choice4_in_8();
                break;
            }

            case 5: {
                System.out.print("Moi nhap phan tu moi: ");
                choice5_in_8(Integer.parseInt(sc.nextLine()));
                System.out.println("Sau khi them: ");
                xuat();
                break;
            }

            case 6: {
                String z;
                do {
                    System.out.print("Nhap vi tri can xoa: ");
                    z = sc.nextLine();
                    if (Integer.parseInt(z) >= sopt) {
                        System.out.println("Ban da nhap sai, moi nhap lai!");
                    }
                } while (Integer.parseInt(z) >= sopt);
                choice6_in_8(Integer.parseInt(z));
                System.out.println("Sau khi xoa: ");
                xuat();
                break;
            }

            case 7: {
                System.out.print("Moi nhap so can tim: ");
                String x = sc.nextLine();
                int z = choice7_in_8(Integer.parseInt(x));
                if (z == -1) {
                    System.out.println("Khong tim thay");
                } else {
                    System.out.println(x + " o vi tri " + z);
                }
            }
        }
        
    }
}
