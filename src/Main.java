import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Employee> listEmployees;
    public static final String SAVE_FILE_PATH = "src/listEmployees.ser";
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //Десериализация при старте программы
    static {
        File file = new File(SAVE_FILE_PATH);
        if (file.exists()) {
            try (FileInputStream fileInputStream = new FileInputStream(file);
                 ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
                listEmployees = (List<Employee>) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else listEmployees = new ArrayList<>();
    }


    public static void main(String[] args) {


        while (true) {
            MainMenu.menu();
            try {
                switch (reader.readLine()) {
                    case "1":
                        listEmployees.forEach(System.out::println);
                        break;
                    case "2":
                        listEmployees.add(new Employee("2022", "Alex", 33, 180, "20", "Nsk"));
                        break;
                    case "3":

                        break;
                    case "4":
                        break;
                    case "5":
                        break;
                    //Сериализация и выход
                    case "6":
                        MainMenu.exit();
                        break;
                    default:
                        MainMenu.error();
                        break;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
