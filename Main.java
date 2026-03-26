int[] mass = new int[10];
int[] mass1 = new int[mass.length * 2];
void main() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Введіть елемент який хочете додати в кінець масиву: ");
    int el = sc.nextInt();
    Add_Element_In_End(el);
    System.out.println(Arrays.toString(mass));
    sc.nextLine();
    System.out.println("Введіть елемент який хочете додати в середину масиву: ");
    int el1 = sc.nextInt();
    Add_Element_In_Between(el1);
    System.out.println(Arrays.toString(mass));
    sc.nextLine();
    System.out.println("Введіть елемент який хочете додати в початок масиву: ");
    int el2 = sc.nextInt();
    Add_Element_In_Start(el2);
    System.out.println(Arrays.toString(mass));
    sc.nextLine();
    System.out.println("Введіть елемент який хочете видалити: ");
    int el3 = sc.nextInt();
    Delete_Element(el3);
    sc.nextLine();
    System.out.println(Arrays.toString(mass));
    System.out.println("capasity: " + mass.length);
    System.out.println("size: " + mass.length);
    System.out.println("Хочете видалити весь масив?: ");
    if(sc.nextLine().equals("Так")) {
    Clear_Mass();
    }
    System.out.println(Arrays.toString(mass));
}
public void Add_Element_In_End(int el) {
    for (int i = 0; i < mass.length; i++) {
        mass[mass.length - 1] = el;
    }
}
public void Add_Element_In_Between(int el) {
    for (int i = 0; i < mass.length; i++) {
        mass[mass.length / 2] = el;
    }
}
public void Add_Element_In_Start(int el) {
    for (int i = 0; i < mass.length; i++) {
        mass[0] = el;
    }
}
public void Delete_Element(int el) {
    for (int i = 0; i < mass.length; i++) {
            mass[el] = 0;
    }
}
public void Clear_Mass() {
    for (int i = 0; i < mass.length; i++) {
        mass[i] = 0;
    }
}
