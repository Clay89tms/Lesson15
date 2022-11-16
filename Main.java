import java.util.*;
import java.util.stream.Collectors;

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
                    list.add((int) (Math.random() * 20));
                }
            }
            System.out.println("Исходная Коллекция: " + list);

            List<Integer> list2 = list.stream().distinct().sorted().toList();
            System.out.println("Коллекция без Дублей: " + list2);

            List<Integer> list3 = list2.stream().filter(s -> (s > 7) && (s < 17) && (s % 2 == 0)).toList();
            System.out.println("Коллекция Четных чисел с 7 до 17: " + list3);

            list = list2.stream().map(s -> s * 2).collect(Collectors.toList());
            System.out.println("Коллекция х2: " + list);

            list3 = list2.stream().limit(4).toList();
            System.out.println("Первых 4 эллемента Коллекции: " + list3);

            System.out.println("Длинна Коллекции: " + list2.size());

            System.out.println("Среднее Арифметическое Коллекции: " + list2.stream()
                    .reduce((s, a) -> (s + a)).map(s -> (double) s/list2.size()));
        }
// ЗАДАНИЕ 2 Доплнительно
        List<String> listName = new ArrayList<>();
        listName.add("Валерия");
        listName.add("Денис");
        listName.add("Глеб");
        listName.add("Ольга");
        listName.add("Роман");
        listName.add("Ольга");
        listName.add("Даниил");
        listName.add("Александр");
        listName.add("Елизавета");
        listName.add("Святослав");
        listName.add("Яна");
        listName.add("Мария");
        listName.add("Дмитрий");
        listName.add("Ирина");
        listName.add("Александр");
        listName.add("Даниил");
        listName.add("Юлия");

        System.out.println(listName);

        List<String> listName1 = listName.stream()
                .filter(x -> x.toLowerCase(Locale.ROOT).equals("рОмАн".toLowerCase(Locale.ROOT)))
                .collect(Collectors.toList());
        System.out.println("Сколько людей в группе с таким же как у меня именем (кроме меня)?: " + (listName1.size()-1));

        List<String> listName2 = listName.stream()
                .filter(x -> x.toLowerCase(Locale.ROOT).startsWith("а"))
                .collect(Collectors.toList());
        System.out.println("Сколько людей в группе с именем коротое начинается на Аа?: " + listName2);
    }
}