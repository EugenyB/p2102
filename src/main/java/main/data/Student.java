package main.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private int id;
    private String name;
    private int age;
    private double rating;

    public static Student parseStudent(String line) {
        String[] split = line.split("#");
        int id = Integer.parseInt(split[0]);
        String name = split[1];
        int age = Integer.parseInt(split[2]);
        double rating = Double.parseDouble(split[3]);
        return new Student(id, name, age, rating);
    }

    public String toText() {
        return id + "#" + name + "#" + age + "#" + rating;
    }
}
