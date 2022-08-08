public class Main {


    public static void main(String[] args) {
        MagicBox magicBox = new MagicBox(3);
        magicBox.add(50);
        magicBox.add(100);
        magicBox.add(300);
        magicBox.add(400);
        System.out.println("Случайное число: " + magicBox.pick());

        MagicBox magicBox1 = new MagicBox(4);
        magicBox1.add("Понедельник");
        magicBox1.add("Вторник");
        magicBox1.add("Среда");
        magicBox1.add("Четверг");
        magicBox.add("Пятница");
        System.out.println("Случайное слово: " + magicBox1.pick());

    }
}
