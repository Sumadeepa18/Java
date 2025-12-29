import java.util.*;

public class Studentmanagement {
    static Scanner sc = new Scanner(System.in);
    static String name[] = new String[10];
    static int roll[] = new int[10];
    static String course[] = new String[10];
    static int count = 0;

    public static void ADDdetails() {
        if (count == 10) {
            System.out.println("Student list full");
            return;
        }
        System.out.println("Enter name:");
        name[count] = sc.next();

        System.out.println("Enter roll number:");
        roll[count] = sc.nextInt();

        System.out.println("Enter course:");
        course[count] = sc.next();

        count++;
        System.out.println("Details added successfully");
    }

    public static void Remove() {
        System.out.println("Enter roll number to remove:");
        int id = sc.nextInt();

        for (int i = 0; i < count; i++) {
            if (roll[i] == id) {
                // Shift elements left
                for (int j = i; j < count - 1; j++) {
                    name[j] = name[j + 1];
                    roll[j] = roll[j + 1];
                    course[j] = course[j + 1];
                }
                count--;
                System.out.println("Student removed successfully");
                return;
            }
        }
        System.out.println("Student not found");
    }

    public static void Display() {
        if (count == 0) {
            System.out.println("No students to display");
            return;
        }

        System.out.println("Student Details:");
        for (int i = 0; i < count; i++) {
            System.out.println(
                "Name: " + name[i] +
                ", Roll: " + roll[i] +
                ", Course: " + course[i]
            );
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("Enter choice:");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    ADDdetails();
                    break;
                case 2:
                    Remove();
                    break;
                case 3:
                    Display();
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
        }
    }
}
