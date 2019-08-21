public class Main {

    public static void main(String[] args) {
        System.out.println("Повторить создание массива и заполнение цветами радуги, как показано в видео, а затем написать код, переворачивающий этот массив.");
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colors = text.split(",?\\s+");

        System.out.println("Вывод массива в исходном порядке");
        for (int i = 0; i < colors.length; i++)
        {
            System.out.println(colors[i]);
        }
        System.out.println("=======");
        System.out.println("Вывод перевернутого массива:");
        String buf = colors[0];
        for (int i = 0; i < colors.length / 2; i++)
        {
            colors[i] = colors[colors.length - 1 - i];
            colors[colors.length - 1 - i] = buf;
            buf = colors[i + 1];
        }

        for (int i = 0; i < colors.length; i++)
        {
            System.out.println(colors[i]);
        }
    }
}
