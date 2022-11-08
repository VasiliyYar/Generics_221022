import java.util.Random;

public class MagicBox<T> {

    protected String nameMagicBox;// имя Магической коробки для вывода названия заполняемой коробки в консоли
    protected int maxObjects;
    protected T[] objects;


    public MagicBox(String nameMagicBox, int maxObjects) {
        this.nameMagicBox = nameMagicBox;
        this.objects = (T[]) new Object[maxObjects];
    }

    public boolean add(T item) {

        for (int i = 0; i < objects.length; i++) {

            if (objects[i] == null) {
                objects[i] = item;
                System.out.println("Заполняем магическую коробку: " + getNameMagicBox());
                System.out.println("Заполнена ячейка №" + (i + 1) + ", элементом = (" + item + ")");

                return true;
            }
        }
        return false;
    }


    public T pick() throws RuntimeException {

        int numberFull = 0;
        String text = null;

        for (int i = 0; i < objects.length; i++) {
            if (objects[i] == null) {
                throw new RuntimeException("Коробка еще не полна. Незаполнено ячеек: " + (objects.length - i));
            } else {
                numberFull++;
                if (numberFull == (objects.length)) {
                    text = "Коробка заполнена";
                    System.out.println(text);
                    Random random = new Random();
                    int randomInt = random.nextInt(objects.length);
                    objects[randomInt] = null;
                    System.out.println("Ячейка №" + (randomInt + 1) + " теперь пуста");

                }

            }

        }

        return (T) text;
    }

    public String getNameMagicBox() {
        return nameMagicBox;
    }

    public int getMaxObjects() {
        return maxObjects;
    }

    public T[] getObjects() {
        return objects;
    }

    public void setObjects(T[] objects) {
        this.objects = objects;
    }

}


