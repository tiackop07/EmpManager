package Model;

public class KySu extends CanBo{
    private String trainIndus;


    @Override
    public String toString() {
        return "KySu{" +
                "trainIndus='" + trainIndus + '\'' +
                '}';
    }

    public String getTrainIndus() {
        return trainIndus;
    }

    public void setTrainIndus(String trainIndus) {
        this.trainIndus = trainIndus;
    }

    public KySu(String trainIndus) {
        this.trainIndus = trainIndus;
    }

    public KySu(String name, int age, String sex, String trainIndus) {
        super(name, age, sex);
        this.trainIndus = trainIndus;
    }
}
