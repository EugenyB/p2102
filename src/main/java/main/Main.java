package main;

import main.data.Student;
import main.data.StudentList;
import main.io.IO;
import main.ui.UI;

import java.util.Scanner;

public class Main {

    private StudentList students;
    private UI ui;
    private IO io;

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        ui = new UI(scanner);
        students = new StudentList();
        io = new IO();

        int m;

        while ((m = ui.menu())!=0) {
            switch (m) {
                case 1 -> {
                    Student student = ui.inputStudentData();
                    students.addStudent(student);
                }
                case 2 -> {
                    ui.printStudentList(students);
                }
                case 3 -> {
                    io.saveToFile(students, "file.txt");
                }
                case 4 -> {
                    students = io.readFromFile("file.txt");
                }
            }
        }
    }
}
