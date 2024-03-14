class Student {
    private String name;
    private int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }
    public int getMarks() {
        return marks;
    }
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 80) {
            return 'B';
        } else if (marks >= 70) {
            return 'C';
        } else if (marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

public class Grade {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student("Alice", 95);
        Student student2 = new Student("Bob", 82);
        Student student3 = new Student("Charlie", 68);
        Student student4 = new Student("David", 75);

        // Printing grades
        System.out.println(student1.getName() + " - Grade: " + student1.calculateGrade());
        System.out.println(student2.getName() + " - Grade: " + student2.calculateGrade());
        System.out.println(student3.getName() + " - Grade: " + student3.calculateGrade());
        System.out.println(student4.getName() + " - Grade: " + student4.calculateGrade());
    }
}

