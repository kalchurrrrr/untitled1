public class Main {
    public static void main(String[] args) {
        String str = "Это пример строки";
        String[] parts = str.split(" "); // Разделение строки по пробелу

        // Выводим разделенную строку
        for (String part : parts) {
            System.out.println(part);
        }
    }
}