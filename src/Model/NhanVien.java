package Model;

public class NhanVien extends CanBo{
    private String job;

    @Override
    public String toString() {
        return "NhanVien{" +
                "job='" + job + '\'' +
                '}';
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public NhanVien(String job) {
        this.job = job;
    }

    public NhanVien(String name, int age, String sex, String job) {
        super(name, age, sex);
        this.job = job;
    }
}
