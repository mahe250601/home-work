import java.util.Scanner;

class Student {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }
}

public class PassDemo {

    // Option 1 – Pass by Value (Primitive)
    static void increaseMarks(int m) {
        m = m + 10;
        System.out.println("Inside method: " + m);
    }

    // Option 2 – Object Reference
    static void updateStudentMarks(Student s) {
        s.marks = s.marks + 10;
        System.out.println("Inside method: " + s.marks);
    }

    // Option 3 – String (Immutable)
    static void changeName(String name) {
        name = name + " Kumar";
        System.out.println("Inside method: " + name);
    }

    // Option 4 – Array (Reference Type)
    static void modifyArray(int arr[]) {
        arr[0] = 99;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n📋 MENU");
            System.out.println("1. Pass by Value – Increase Marks");
            System.out.println("2. Pass by Reference – Update Student Marks");
            System.out.println("3. Pass by Value – Change String");
            System.out.println("4. Pass by Reference – Modify Array");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();
                    System.out.println("Before method call: " + marks);
                    increaseMarks(marks);
                    System.out.println("After method call: " + marks);
                    break;

                case 2:
                    System.out.print("Enter student marks: ");
                    int m = sc.nextInt();
                    Student s = new Student(m);
                    System.out.println("Before method call: " + s.marks);
                    updateStudentMarks(s);
                    System.out.println("After method call: " + s.marks);
                    break;

                case 3:
                    sc.nextLine(); // clear buffer
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.println("Before method: " + name);
                    changeName(name);
                    System.out.println("After method: " + name);
                    break;

                case 4:
                    int arr[] = new int[3];
                    System.out.println("Enter array elements: ");
                    for (int i = 0; i < 3; i++) {
                        arr[i] = sc.nextInt();
                    }

                    System.out.print("Before method: ");
                    for (int i = 0; i < 3; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    modifyArray(arr);

                    System.out.print("\nAfter method: ");
                    for (int i = 0; i < 3; i++) {
                        System.out.print(arr[i] + " ");
                    }
                    break;

                case 5:
                    System.out.println("Program Exited Successfully");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}