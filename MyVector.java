import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MyVector {
    public int[] mass;

    public MyVector() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть розмір масиву: ");
        int size = sc.nextInt();
        mass = new int[size * 2];
        for (int i = 0; i < mass.length; i++) {
            while (i < size) {
                System.out.println("Введіть значення яке хочете записати в масив: ");
                int el = sc.nextInt();
                sc.nextLine();
                mass[i] = el;
                i++;
            }
    }
        get();
        System.out.println("Введіть число яке хочете додати в кінець масиву: ");
        int el = sc.nextInt();
        Add_Element_In_End(el);
        get();
        sc.nextLine();
        System.out.println("Введіть число який хочете додати в середину масиву: ");
        int el1 = sc.nextInt();
        Add_Element_In_Between(el1);
        get();
        sc.nextLine();
        System.out.println("Введіть число який хочете додати в початок масиву: ");
        int el2 = sc.nextInt();
        Add_Element_In_Start(el2);
        get();
        sc.nextLine();
        Add_Element();
        System.out.println("Введіть елемент який хочете видалити за індексом: ");
        int el3 = sc.nextInt();
        Delete_Element(el3);
        get();
        capasity();
        sc.nextLine();
        System.out.println("Хочете видалити весь масив?: ");
        if (sc.nextLine().equals("Так")) {
            Clear_Mass();
        }
        get();
    }
    public void Add_Element_In_End(int el) {
        for (int i = 0; i < mass.length; i++) {
            int end = mass.length / 2;
            mass[end - 1] = el;
        }
    }
    public void Add_Element_In_Between(int el) {
        for (int i = 0; i < mass.length; i++) {
            mass[mass.length / 4] = el;
        }
    }
    public void Add_Element_In_Start(int el) {
        for (int i = 0; i < mass.length; i++) {
            mass[0] = el;
        }
    }
    public void Delete_Element(int el3) {
        for (int i = 0; i < mass.length; i++) {
            mass[el3] = 0;
        }
    }
    public void Clear_Mass() {
        for (int i = 0; i < mass.length; i++) {
            mass[i] = 0;
        }
    }
    public void get() {
        System.out.println(Arrays.toString(mass));
    }
    public void capasity() {
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            if(mass[i] != 0) {
                count++;
            }
        }
        System.out.println("capasity: " + count);
        System.out.println("size: " + mass.length);
    }
    public void Add_Element() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mass.length; i++) {
            if(mass[i] == 0) {
                System.out.println("Хочете додати ще елемент якщо масив заповнений?: ");
                if(sc.nextLine().equals("Так")) {
                    System.out.println("Введіть значення яке хочете записати в масив: ");
                    int el4 = sc.nextInt();
                    sc.nextLine();
                    mass[i] = el4;
                    get();
                }
            }
        }
    }
}