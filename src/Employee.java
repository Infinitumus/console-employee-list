import java.io.*;

public class Employee implements Externalizable {
    @Serial
    private static final long serialVersionUID = 1000001L;
    private static int countId = 0;
    private int id;
    private String date;
    private String name;
    private int age;
    private int height;
    private String birthDate;
    private String birthPlace;

    public Employee() {
    }

    public Employee(String date, String name, int age, int height, String birthDate, String birthPlace) {
        this.id = Employee.countId++;
        this.date = date;
        this.name = name;
        this.age = age;
        this.height = height;
        this.birthDate = birthDate;
        this.birthPlace = birthPlace;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", birthDate='" + birthDate + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(countId);
        out.writeInt(this.getId());
        out.writeObject(this.getDate());
        out.writeObject(this.getName());
        out.writeObject(this.getAge());
        out.writeObject(this.getHeight());
        out.writeObject(this.getBirthDate());
        out.writeObject(this.getBirthPlace());
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        countId = (int) in.readObject();
        this.id = in.readInt();
        this.date = (String) in.readObject();
        this.name = (String) in.readObject();
        this.age = (int) in.readObject();
        this.height = (int) in.readObject();
        this.birthDate = (String) in.readObject();
        this.birthPlace = (String) in.readObject();
    }
}
