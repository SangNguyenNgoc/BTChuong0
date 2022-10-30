/*Ten: Nguyễn Ngọc Sang
 MSSV: 3121410417*/
import java.util.Scanner;
import baitap1toi9.btso1;
import baitap1toi9.btso2;
import baitap1toi9.btso3;
import baitap1toi9.btso4;
import baitap1toi9.btso5;
import baitap1toi9.btso6;
import baitap1toi9.btso7;
import baitap1toi9.btso8;
import baitap1toi9.btso9;

public class baitapMAIN {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println(" \n Thuc thi bai tap (1->9)");
            String op;
            do {
                System.out.print("Ban muon lam bai tap so:  ");
                op = sc.nextLine();
                if (Integer.parseInt(op) > 9 || Integer.parseInt(op) < 1) {
                    System.out.println("Ban da nhap sai moi nhap lai!");
                }
            } while (Integer.parseInt(op) > 9 || Integer.parseInt(op) < 1);

            switch (Integer.parseInt(op)) {
                case 1: {
                    btso1 bt1 = new btso1();
                    System.out.println("Ban da chon bai 1: tinh toan tren 2 so nguyen.");
                    do {
                        bt1.nhap();
                        bt1.luachon1();
                        System.out.print("Bam phim bat ki de lam lai, nhan 't' de thoat khoi bai tap: ");
                    } while (sc.nextLine().charAt(0) != 't');
                    break;
                }

                case 2: {
                    btso2 bt2 = new btso2();
                    System.out.println("Ban da chon bai 2: tinh chu vi, dien tich hinh chu nhat.");
                    do {
                        bt2.nhap();
                        bt2.luachon2();
                        System.out.print("Bam phim bat ki de lam lai, nhan 't' de thoat khoi bai tap: ");
                    } while (sc.nextLine().charAt(0) != 't');
                    break;
                }

                case 3: {
                    btso3 bt3 = new btso3();
                    System.out.println("Ban da chon bai 3: tinh chu vi, dien tich hinh tron.");
                    do {
                        bt3.nhap();
                        bt3.luachon3();
                        System.out.print("Bam phim bat ki de lam lai, nhan 't' de thoat khoi bai tap: ");
                    } while (sc.nextLine().charAt(0) != 't');
                    break;
                }

                case 4: {
                    btso4 bt4 = new btso4();
                    System.out.println("Ban da chon bai 4: kiem tra tinh chan le cua 1 so.");
                    do {
                        bt4.nhap();
                        bt4.luachon4();
                        System.out.print("Bam phim bat ki de lam lai, nhan 't' de thoat khoi bai tap: ");
                    } while (sc.nextLine().charAt(0) != 't');
                    break;
                }

                case 5: {
                    btso5 bt5 = new btso5();
                    System.out.println("Ban da chon bai 5: kiem tra 1 so la am, duong hay zero");
                    do {
                        bt5.nhap();
                        bt5.luachon5();
                        System.out.print("Bam phim bat ki de lam lai, nhan 't' de thoat khoi bai tap: ");
                    } while (sc.nextLine().charAt(0) != 't');
                    break;
                }

                case 6: {
                    btso6 bt6 = new btso6();
                    System.out.println("Ban da cho bai 6: kiem tra 1 so co phai la so nguyen to");
                    do {
                        bt6.nhap();
                        bt6.luachon6();
                        System.out.print("Bam phim bat ki de lam lai, nhan 't' de thoat khoi bai tap: ");
                    } while (sc.nextLine().charAt(0) != 't');
                    break;
                }

                case 7: {
                    btso7 bt7 = new btso7();
                    System.out.println("Ban da chon bai 7: nhap so tu nhien n, xuat ket qua ");
                    do {
                        bt7.nhap();
                        bt7.luachon7();
                        System.out.print("Bam phim bat ki de lam lai, nhan 't' de thoat khoi bai tap: ");
                    } while (sc.nextLine().charAt(0) != 't');

                    break;
                }

                case 8: {
                    btso8 bt8 = new btso8();
                    System.out.println("Ban da chon bai 8: lam viec voi mang ");
                    do {
                        bt8.nhap();
                        bt8.luachon8();
                        System.out.print("Bam phim bat ki de lam lai, nhan 't' de thoat khoi bai tap: ");
                    } while (sc.nextLine().charAt(0) != 't');
                    break;
                }

                case 9: {
                    btso9 bt9 = new btso9();
                    System.out.println("Ban da chon bai 9: lam viec voi chuoi");
                    do {
                        bt9.nhap();
                        bt9.luachon9();
                        System.out.print("Bam phim bat ki de lam lai, nhan 't' de thoat khoi bai tap: ");
                    } while (sc.nextLine().charAt(0) != 't');
                    break;
                }
            }
            System.out.print("Nhan phim bat ki de tiep tuc, nhan 't' de thoat khoi chuong trinh: ");
        } while (sc.nextLine().charAt(0) != 't');
    }
}
