import java.util.Random;

public class MagicBox<T> {
    public T[] box;

    public MagicBox(int size) {
        this.box = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < box.length; i++) {
            if (box[i] == null) {
                box[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < box.length; i++) {
            if (box[i] == null) {
                throw new RuntimeException("Коробка не заполнена! Осталось заполнить " + (box.length - i) + " ячейки!");
            }
        }
        Random random = new Random();
        int randomInt = random.nextInt(box.length);
        return box[randomInt];
    }
}
