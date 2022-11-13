import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//            String s = "null";
//            Optional<String> opt = Optional.ofNullable(s);
//            opt.ifPresentOrElse(
//                    x -> System.out.println(x),
//            () -> System.out.println("No value"));

        List<Integer> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите колличесво эллементов в коллекции: ");
            if (scanner.hasNextInt()) {
                int elemCollect = scanner.nextInt();

                for (int i = 0; i < elemCollect; i++) {
                    list.add((int) (Math.random() * 5));
                }
            }
            System.out.println("Коллекция сейчас: " + list);
            list.stream().distinct().forEach(System.out::print);

        }


    }
}