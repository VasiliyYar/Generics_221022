import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        int n = 4;
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
        System.out.println("Количество ячеек в каждой коробке = " + (n) + " ячейки");
        System.out.println("Элементы для заполения коробок: или <слово> или <число>. Оба элимента в одной коробке быть не могут");


        while (true) {
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            try {
                int value = Integer.parseInt(input);
                magicBox1.add(value);
                try {
                    magicBox1.pick();
                } catch (RuntimeException k) {
                    System.out.println(k);
                }
            } catch (NumberFormatException e) {

                String item = input;
                magicBox2.add(item);
                try {
                    magicBox2.pick();
                } catch (RuntimeException m) {
                    System.out.println(m);

                }
            }
        }
    }
}



