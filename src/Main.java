import java.util.Scanner;

public class Main {
    public static void main(String[] args){

    MagicBox <Integer> magicBox1 = new MagicBox("Слова или число", 10);
    magicBox1.getNameMagicBox();
    magicBox1.getMaxObjects();
    magicBox1.objects = new Object[10];


        Scanner scanner = new Scanner(System.in);

        System.out.println("Магическая коробка");
        System.out.println(magicBox1.getMaxObjects());
        while (true) {
            System.out.println("Выберите элемент для заполнения коробки (слово или число):");
            String input = scanner.nextLine();
            if ("end".equals(input)) {
                break;
            }

            int item = scanner.nextInt();
            magicBox1.add(item);
            magicBox1.pick(item);

            }


        }



    }



