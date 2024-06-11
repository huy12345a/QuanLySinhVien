import java.util.Scanner;

public class NguoiDung {
    public static void main(String[] args) {
        QuanLiSinhVien quanLiSinhVien = new QuanLiSinhVien(10);
        do {
            System.out.println("Quan li sinh vien : ");
            System.out.println("1 : them sinh vien");
            System.out.println("2 : xoa sinh vien ");
            System.out.println("3 : sua");
            System.out.println("4 : hien thi sinh vien");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("nhap info sinh vien: ");
                    System.out.print("id : ");
                    int a = sc.nextInt();
                    System.out.print(" name : ");
                    String b = sc.next();
                    System.out.print(" email : ");
                    String c = sc.next();
                    System.out.print(" phone : ");
                    String d = sc.next();
                    System.out.print(" GPA : ");
                    int e = sc.nextInt();
                    SinhVien s1 = new SinhVien(a, b, c, d, e);
                    quanLiSinhVien.addSinhvien(s1);
                    break;
                case 2:
                    System.out.println("xoa sinh vien co id : ");
                    int f = sc.nextInt();
                    quanLiSinhVien.deleteStudent(f);
                    break;
                case 3:
                    System.out.println("sua sinh vien co id : ");
                    int g = sc.nextInt();
                    quanLiSinhVien.fixstudent(g);
                case 4:
                    quanLiSinhVien.showStudent();

            }
        } while (true);
    }
}

