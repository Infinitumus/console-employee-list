import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainMenu {
    public static void menu() {
        System.out.println("Выберите действие:");
        System.out.println("1. Просмотреть список сотрудников");
        System.out.println("2. Добавить сотрудника");
        System.out.println("3. Редактировать сотрудника");
        System.out.println("4. Удалить сотрудника");
        System.out.println("5. Сортировка списка");
        System.out.println("6. Выход");
    }

    public static void exit() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(Main.SAVE_FILE_PATH);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(Main.listEmployees);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.exit(0);
    }

    public static void error(){
        System.out.println();
        System.out.println("Выберите корректное значение");
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
