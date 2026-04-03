import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть розмір масиву: ");
    int size_of_mass = sc.nextInt();
    sc.nextLine();
    int[] mass = new int[size_of_mass];
    for (int i = 0; i < mass.length; i++) {
        while (i < size_of_mass) {
            System.out.println("Введіть значення яке хочете записати в масив: ");
            int el = sc.nextInt();
            sc.nextLine();
            mass[i] = el;
            i++;
            System.out.println(Arrays.toString(mass));
        }
        }
    System.out.println("Введіть число яке хочете додати в кінець масиву: ");
    int el = sc.nextInt();
    Add_Element_In_End(el, mass);
    System.out.println(Arrays.toString(mass));
    sc.nextLine();
    System.out.println("Введіть число який хочете додати в середину масиву: ");
    int el1 = sc.nextInt();
    Add_Element_In_Between(el1, mass);
    System.out.println(Arrays.toString(mass));
    sc.nextLine();
    System.out.println("Введіть число який хочете додати в початок масиву: ");
    int el2 = sc.nextInt();
    Add_Element_In_Start(el2, mass);
    System.out.println(Arrays.toString(mass));
    sc.nextLine();
    System.out.println("Введіть елемент який хочете видалити за індексом: ");
    int el3 = sc.nextInt();
    Delete_Element(el3, mass);
    sc.nextLine();
    System.out.println(Arrays.toString(mass));
    System.out.println("capasity: " + mass.length);
    System.out.println("size: " + mass.length);
    System.out.println("Хочете видалити весь масив?: ");
    if(sc.nextLine().equals("Так")) {
    Clear_Mass(mass);
    }
    System.out.println(Arrays.toString(mass));
}
public static void Add_Element_In_End(int el, int[] mass) {
    for (int i = 0; i < mass.length; i++) {
        mass[mass.length - 1] = el;
    }
}
public static void Add_Element_In_Between(int el, int[] mass) {
    for (int i = 0; i < mass.length; i++) {
        mass[mass.length / 2] = el;
    }
}
public static void Add_Element_In_Start(int el, int[] mass) {
    for (int i = 0; i < mass.length; i++) {
        mass[0] = el;
    }
}
public static void Delete_Element(int el3, int[] mass) {
    for (int i = 0; i < mass.length; i++) {
            mass[el3] = 0;
    }
}
public static void Clear_Mass(int[] mass) {
    for (int i = 0; i < mass.length; i++) {
        mass[i] = 0;
    }
}
}
