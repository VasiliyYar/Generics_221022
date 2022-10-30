import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 3;
        MagicBox<Integer> magicBox1 = new MagicBox("<Число>", n);
        MagicBox<String> magicBox2 = new MagicBox<>("<Слово>", n);
        magicBox1.getNameMagicBox();
        magicBox1.getMaxObjects();
        magicBox2.getNameMagicBox();
        magicBox2.getMaxObjects();
        magicBox1.objects = new Integer[n];
        magicBox2.objects = new String[n];


        Scanner scanner = new Scanner(System.in);

        System.out.println("Две магичесие коробки с названиями Слово и Число");
        System.out.println("Количество ячеек в каждой коробке = " + (n + 1) + " ячейки");
        System.out.println("Элементы для заполения коробок: или <слово> или <число>. Оба элимента в одной коробке быть не могут");
        System.out.println("Вначале ведите любой элемент на консоли для определения типа элемента:");

        while (true) {
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;

            } else if (scanner.hasNextInt()) {

                int item = scanner.nextInt();
                magicBox1.add(item);
                magicBox1.pick();


            } else {
                String item = scanner.nextLine();
                magicBox2.add(item);
                magicBox2.pick();


            }

        }
    }


}



