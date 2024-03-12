package Model;

public class CanBo {
    private String name;
    private int age;
    private String sex;

    public CanBo() {
    }
    public CanBo(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public CanBo(String name, String age, String sex) {
    }

    @Override
    public String toString() {
        return "CanBo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
