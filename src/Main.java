import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Дан список ArrayList<Integer> целых чисел. Удалить из него нечетные числа

        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(integers);
        removeOddNumbers(integers);
        System.out.println(integers);



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
    private static void removeOddNumbers(ArrayList<Integer> integers) {
        for(int i = 0; i< integers.size(); i++) {
            if(integers.get(i) % 2 != 0 )
                integers.remove(i);
        }

    }
}
