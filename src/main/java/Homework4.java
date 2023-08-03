import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        try {
            String inputString = readNonEmptyStringFromUser();
            System.out.println("Введенная строка: " + inputString);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String readNonEmptyStringFromUser() throws Exception {
        Scanner scanner = new Scanner(System.in);
        String inputString;

        while (true) {
            System.out.print("Введите строку: ");
            inputString = scanner.nextLine();

            if (inputString.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя.");
            } else {
                break;
            }
        }

        return inputString;
    }
}

