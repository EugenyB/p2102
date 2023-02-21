package main.ui;

import lombok.AllArgsConstructor;
import main.data.Student;
import main.data.StudentList;

import java.util.Scanner;

@AllArgsConstructor
public class UI {

    private Scanner scanner;
    public Student inputStudentData() {
        System.out.print("id: ");
        int id = scanner.nextInt(); scanner.nextLine();
        System.out.print("name: ");
        String name = scanner.nextLine();
        System.out.print("age: ");
        int age = scanner.nextInt(); scanner.nextLine();
        System.out.print("rating: ");
        double rating = scanner.nextDouble(); scanner.nextLine();
        return new Student(id, name, age, rating);
    }

    public void printStudent(Student student) {
        System.out.println(student);
    }

    public void printStudentList(StudentList students) {
        for (int i = 0; i < students.size(); i++) {
            printStudent(students.get(i));
        }
    }

    public int menu() {
        System.out.println("""
                1. Add Student
                2. Show Students
                3. Save To File
                4. Read From File
                0. Exit
                """);
        int res = scanner.nextInt();
        scanner.nextLine();
        return res;
    }
}
