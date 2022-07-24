import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {
    public static List<Employee> listEmployees;
    public static final String SER_SAVE_FILE_PATH = "C:\\Users\\Public\\files\\listEmployees.ser";
    public static final String TXT_SAVE_FILE_PATH = "C:\\Users\\Public\\files\\listEmployees.txt";
    public static final String LOG_LIST_FILE_PATH = "C:\\Users\\Public\\files\\log.txt";
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    //Десериализация при старте программы
    static {
        SaveLoad.loadList();
    }

    public static void main(String[] args) {
        while (true) {
            MainMenu.menu();
            try {
                switch (reader.readLine()) {
                    case "1" -> MainMenu.showList();
                    case "2" -> MainMenu.addEmployeeInList();
                    case "3" -> MainMenu.editEmployee();
                    case "4" -> MainMenu.deleteEmployee();
                    case "5" -> MainMenu.sortList();
                    case "6" -> MainMenu.exit();
                    default -> MainMenu.error();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
