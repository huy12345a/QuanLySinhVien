import java.util.Scanner;

public class QuanLiSinhVien {
    protected SinhVien[] liststudent;
    protected int limit;
    protected int size;

    public QuanLiSinhVien(int limit) {
        this.limit = limit;
        this.liststudent = new SinhVien[limit];
        this.size = 0;
    }

    public void addSinhvien(SinhVien sinhvien) {
        if (this.size == this.limit) {
            System.out.println("Student full");
        } else {
            liststudent[this.size] = sinhvien;
            this.size++;
        }
    }

    public void showStudent() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(liststudent[i]);
        }
    }

    public void deleteStudent(int id) {
        SinhVien[] newlist = new SinhVien[this.size - 1];

        int vitri = -1;
        for (int i = 0; i < this.size; i++) {
            if (liststudent[i].getId() == id) {
                vitri = i;
                break;
            }
        }
        if (vitri == -1) {
            return;
        }
        for (int i = 0; i < vitri; i++) {
            newlist[i] = liststudent[i];
        }
        for (int i = vitri + 1; i < this.size; i++) {
            newlist[i - 1] = liststudent[i];
        }
        liststudent = newlist;
        this.size--;
    }
    public SinhVien getStudentById(int id) {
        for (int i = 0; i < this.size; i++) {
            if (this.liststudent[i].getId() == id) {
                return this.liststudent[i];
            }
        }
        return null;
    }
    public void fixstudent(int id) {
        int index = -1;
        for (int i = 0; i < this.size; i++) {
            if (this.liststudent[i].getId() == id) {
                index = i;
            }
        }
        if (index != -1) {
            System.out.println("new name : ");
            Scanner sc = new Scanner(System.in);
            String newname = sc.next();
            liststudent[index].setName(newname);
            System.out.println("new email :");
            String newemail = sc.next();
            liststudent[index].setEmail(newemail);
            System.out.println("new phone :");
            String newphone = sc.next();
            liststudent[index].setPhone(newphone);
            System.out.println("new GPA :");
            int newGPA = sc.nextInt();
            liststudent[index].setGPA(newGPA);
        }
    }
}