package Model;

public class CongNhan extends CanBo{
    private int lever;



    @Override
    public String toString() {
        return "CongNhan{" +
                "lever=" + lever +
                '}';
    }

    public int getLever() {
        return lever;
    }

    public void setLever(int lever) {
        this.lever = lever;
    }

    public CongNhan(int lever) {
        this.lever = lever;
    }

    public CongNhan(String name, int age, String sex, int lever) {
        super(name, age, sex);
        this.lever = lever;
    }
}
