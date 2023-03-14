import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
// Дан список ArrayList<String>. Удалить из него все строки, которые являются числами.

        ArrayList<String> list = new ArrayList<>(List.of("string", "s", "5", "6", "-12", "my_value"));
        System.out.println("Исходный" + list);

        for (int i=0; i< list.size(); i++) {
            try {
                int j = Integer.parseInt(list.get(i).trim());
                list.remove(i);

            } catch (NumberFormatException nfe) {
                System.out.println("NumberFormatException: " + nfe.getMessage());
            }

        }
        System.out.println("Итоговый" + list);

    }
}
