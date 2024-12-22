import java.util.Scanner;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> myList = new List<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество элементов для добавления в список: ");
        int count = scanner.nextInt();

        System.out.println("Введите элементы списка:");
        for (int i = 0; i < count; i++) {
            myList.add(scanner.nextInt());
        }

        System.out.println("Элементы в списке:");
        for (Integer num : myList) {
            System.out.print(num + " ");
        }
    }
}
