import java.util.Random;

public class MagicBox<T> {

    protected String nameMagicBox;// имя Магичесокой коробки
    protected int maxObjects;
    //protected Object[] objects; // сохранение элементов в коробке
    T[] objects = (T[]) new Object[maxObjects];

    public MagicBox(String nameMagicBox, int maxObjects) {
        this.nameMagicBox = nameMagicBox;
        this.objects = (T[]) new Object[maxObjects];
    }

    public boolean add(T item) {

        int n = 1;//номер ячейки
        for (int i = 0; i < objects.length; i++) {
            n++;
            if (objects[i] == null) {
                objects[i] = item;
                System.out.println("Заполняем магическую коробку: " + getNameMagicBox());
                System.out.println("Заполнена ячейка №" + (i + 1) + ", элементом = (" + item + ")");
                n = i + 1;
                return true;
            }
        }
        System.out.println("Заполнена последняя ячейка " + "№" + n);
        System.out.println("Магическая коробка <" + getNameMagicBox() + "> заполнена. ");
        return false;
    }

    public T pick() {
        int number = 0;
        int numberFull = 0;
        String text = null;
        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                number++;

                try {
                    throw new RuntimeException("Коробка еще не полна. Незаполнено ячеек: " + (number + 1));
                } catch (RuntimeException e) {
                    text = e.getMessage();
                }
            } else {
                numberFull++;

                if (numberFull == (objects.length)) {
                    text = "Коробка заполнена";
                    Random random = new Random();
                    int randomInt = random.nextInt(objects.length);
                    objects[randomInt] = null;
                    System.out.println("Ячейка №" + (randomInt + 1) + " теперь пуста");
                }
            }
        }
        String result = text;
        System.out.println(result);
        return (T) result;
    }

    public String getNameMagicBox() {
        return nameMagicBox;
    }

    public int getMaxObjects() {
        return maxObjects;
    }


}


