import java.util.Random;

public class MagicBox <T> {

    protected String nameMagicBox;// имя Магичесокой коробки
    protected int maxObjects;
    protected Object[] objects; // сохранение элементов в коробке

    public MagicBox (String nameMagicBox, int maxObjects) {
        this.nameMagicBox = nameMagicBox;
        this.objects = new Object[maxObjects];
    }

    public boolean add (T item) {

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                objects[i] = item;
                System.out.println("Заполнена ячейка №"+i+":");
                return true;
            }
        }
        System.out.println("Коробка заполнена");
        return false;

    }

    public int pick (T item) {
        if (add(item)==true) {
            int n = 0;
            for (int i = 0; i < objects.length; i++) {
                if (objects[i] == null) {
                    n = n + 1;
                }

            }
           throw new RuntimeException("Коробка не полна и осталось еще заполнить - " + n + " ячеек");

        } else {
            Random random = new Random();
            int randomInt = random.nextInt(maxObjects); // джава подберёт случайное число от 0 до ЧИСЛО невключительно

            return randomInt;
        }

    }
    public String getNameMagicBox() {
        return nameMagicBox;
    }

    public int getMaxObjects() {
        return maxObjects;
    }


}


