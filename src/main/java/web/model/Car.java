package web.model;


import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "modeller")
    private String modeller;

    @Column(name = "series")
    private int series;
    @Column(name = "age")
    private int age;

    public Car(int id, String model, int series, int age) {
        this.id = id;
        this.modeller = model;
        this.series = series;
        this.age = age;
    }

    public Car() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModel() {
        return modeller;
    }

    public void setModel(String model) {
        this.modeller = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + modeller + '\'' +
                ", series=" + series +
                ", age=" + age +
                '}';
    }
}
