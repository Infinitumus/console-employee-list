import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReadEmployee {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    static void readName() {
        while (true) {
            System.out.println("Введите имя\n");
            try {
                MainMenu.employee.setName(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Попробуйте еще раз\n");
            }
        }
    }

    static void readAge() {
        while (true) {
            System.out.println("Введите возраст\n");
            try {
                MainMenu.employee.setAge(Integer.parseInt(reader.readLine()));
                break;
            } catch (Exception e) {
                System.out.println("Попробуйте еще раз\n");
            }
        }
    }

    static void readHeight() {
        while (true) {
            System.out.println("Введите рост\n");
            try {
                MainMenu.employee.setHeight(Integer.parseInt(reader.readLine()));
                break;
            } catch (Exception e) {
                System.out.println("Попробуйте еще раз\n");
            }
        }
    }

    static void readBirthPlace() {
        while (true) {
            System.out.println("Введите место рождения\n");
            try {
                MainMenu.employee.setBirthPlace(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Попробуйте еще раз\n");
            }
        }
    }

    static void readBirthDate() {
        while (true) {
            System.out.println("Введите дату рождения, пример ввода: 1960-08-30\n");
            try {
                MainMenu.employee.setBirthDate(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Попробуйте еще раз\n");
            }
        }
    }
}
