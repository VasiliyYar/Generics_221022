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


        while (true) {
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            try {
                int value = Integer.parseInt(input);
                magicBox1.add(value);
                magicBox1.pick();
            } catch (NumberFormatException e) {

                String item = input;
                magicBox2.add(item);
                magicBox2.pick();
            }


        }
    }
}



