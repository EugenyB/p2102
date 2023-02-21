package main.io;

import main.data.Student;
import main.data.StudentList;

import java.io.*;

public class IO {
    public void saveToFile(StudentList students, String filename) {
        try (PrintWriter out = new PrintWriter(filename)) {
            out.println(students.size());
            for (int i = 0; i < students.size(); i++) {
                out.println(students.get(i).toText());
            }
            System.out.println("write success");
        } catch (FileNotFoundException e) {
            System.out.println("Can't create file");
        }
    }

    public StudentList readFromFile(String filename) {
        StudentList students = new StudentList();
        try (BufferedReader in = new BufferedReader(new FileReader(filename))) {
            int n = Integer.parseInt(in.readLine());
            for (int i = 0; i < n; i++) {
                String line = in.readLine();
                Student student = Student.parseStudent(line);
                students.addStudent(student);
            }
            System.out.println("read success");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Error while read");
        }
        return students;
    }
}
