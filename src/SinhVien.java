public class SinhVien {
    private int id;
    private String name;
    private String email;
    private String phone;
    private double GPA;

    public SinhVien(int id, String name, String email, String phone, double GPA) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", GPA=" + GPA +
                ", phone='" + phone + '\'' +
                '}';
    }
}
