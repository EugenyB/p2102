package main.data;

public class StudentList {
    private Student[] students = new Student[10];
    private int count = 0;

    public void addStudent(Student student) {
        ensureCapacity(count+1);
        students[count++] = student;
    }

    private void ensureCapacity(int newCapacity) {
        if (newCapacity <= students.length) return;
        Student[] newArray = new Student[students.length*2];
        System.arraycopy(students, 0, newArray, 0, students.length);
        students = newArray;
    }

    public Student get(int index) {
        return students[index];
    }

    public int size() {
        return count;
    }
}
