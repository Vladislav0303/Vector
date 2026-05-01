import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        MyVector vector = new MyVector();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < vector.mass.length; i++) {
            while (i < vector.mass.length / 2) {
                System.out.println("Введіть значення яке хочете записати в масив: ");
                int el = sc.nextInt();
                sc.nextLine();
                vector.mass[i] = el;
                i++;
            }
        }
        vector.get();
        System.out.println("Введіть число яке хочете додати в кінець масиву: ");
        int el = sc.nextInt();
        vector.Add_Element_In_End(el);
        vector.get();
        sc.nextLine();
        System.out.println("Введіть число який хочете додати в середину масиву: ");
        int el1 = sc.nextInt();
        vector.Add_Element_In_Between(el1);
        vector.get();
        sc.nextLine();
        System.out.println("Введіть число який хочете додати в початок масиву: ");
        int el2 = sc.nextInt();
        vector.Add_Element_In_Start(el2);
        vector.get();
        sc.nextLine();
        vector.Add_Element();
        System.out.println("Введіть елемент який хочете видалити за індексом: ");
        int el3 = sc.nextInt();
        vector.Delete_Element(el3);
        vector.get();
        vector.capasity();
        sc.nextLine();
        System.out.println("Хочете видалити весь масив?: ");
        if (sc.nextLine().equals("Так")) {
            vector.Clear_Mass();
        }
        vector.get();
    }
}