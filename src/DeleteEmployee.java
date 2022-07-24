import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DeleteEmployee {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void delete() {
        Employee employee;
        while (true) {
            int id = 0;
            boolean isDeleted = false;
            System.out.println("Введите id сотрудника для удаления из списка\n");
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println("Попробуйте еще раз\n");
            }
            for (int i = 0; i < Main.listEmployees.size(); i++) {
                employee = Main.listEmployees.get(i);
                if (employee.getId() == id) {
                    Main.listEmployees.remove(employee);
                    isDeleted = true;
                }
            }
            if (isDeleted) {
                System.out.println("Сотрудник удален\n");
            } else {
                System.out.println("Сотрудника с таким id нет в списке\n");
            }
            break;
        }
    }
}
