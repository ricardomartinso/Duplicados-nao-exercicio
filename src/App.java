import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        List<String> arrayUm = new ArrayList<>();
        List<String> arrayDois = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String string = "Maçã " + i;

            arrayUm.add(string);
        }

        arrayDois.add("Maçã 0");
        arrayDois.add("Maçã 1");

        for (int i = 0; i < 5; i++) {
            String string = "Uva " + i;

            arrayDois.add(string);
        }

        for (int i = 0; i < arrayUm.size(); i++) {
            if (arrayDois.contains(arrayUm.get(i))) {
                System.out.println("Item em comum " + arrayUm.get(i));
            }
        }
    }

}
