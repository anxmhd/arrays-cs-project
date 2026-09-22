package samplearrays;

import java.util.Arrays;
import java.util.Comparator;

public class ManageStudent {

    // 2) Find the Oldest Student
    public static Student findOldest(Student[] students) {
        Student oldest = students[0];
        for(Student s : students) {
            if(s.getAge() > oldest.getAge()) {
                oldest = s;
            }
        }
        return oldest;
    }

    // 3) Count Adult Students (age >= 18)
    public static int countAdults(Student[] students) {
        int adultCount = 0;
        for(Student s : students) {
            if(s.getAge() >= 18)
                adultCount++;
        }
        return adultCount;
    }

    // 4) Average Grade (returns NaN if no students or grades)
    public static double averageGrade(Student[] students) {
        if(students.length == 0) return Double.NaN;

        double average = 0;
        int studentCount = 0;
        for(Student s : students) {
            studentCount++;
            average += s.getGrade();

        }
        average /= (double) studentCount;
        return average;
    }

    // 5) Search by Name (case-sensitive; change to equalsIgnoreCase if desired)
    public static Student findStudentByName(Student[] students, String name) {
        Student studentToFind = null;
        for(Student s : students) {
            if(s.getName() == name) {
                studentToFind = s;
                break;
            }
        }
        return studentToFind;
    }

    // 6) Sort Students by Grade (descending)
    public static void sortByGradeDesc(Student[] students) {
        Arrays.sort(students, (a, b) -> Integer.compare(b.getGrade(), a.getGrade()));
    }

    // 7) Print High Achievers (grade >= 15)
    public static void printHighAchievers(Student[] students) {
        for(Student s : students) {
            if(s.getAge() >= 5) System.out.println(s.getName());
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {
        boolean updated = false;
        for(int i = 0; i < students.length; i++) {
            if(students[i].getId() == id) {
                students[i].setGrade(newGrade);
                updated = true;
            }
        }
        return updated;
    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {
        String[] duplicates = new String[students.length];
        boolean duplicate = false;
        for(int i = 0; i < students.length; i++) {
            if(Arrays.asList(duplicates).contains(students[i].getName())) {
                duplicate = true;
                System.out.println("Duplicates found");
                break;
            }
            else duplicates[i] = students[i].getName();
        }
        return duplicate;
    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {
        Student[] newStudents = new Student[students.length + 1];
        for(int i = 0; i < students.length; i++) {
            newStudents[i] = new Student(students[i].getId(), students[i].getName(), students[i].getAge(), students[i].getGrade());
        }
        newStudents[students.length] = newStudent;
        return newStudents;
    }

    // 1) Create an Array of Students + demos for all tasks
    public static void main(String[] args) {
        // Create & initialize array of 5 students
        Student[] students = new Student[5];

        students[0] = new Student(0, "John");
        students[1] = new Student(1, "Alice", 18);
        students[2] = new Student(2, "Alex", 20, 15);
        students[3] = new Student(3, "Bob", 19);
        students[4] = new Student(4, "Elise", 18, 18);

        // Print all
        System.out.println("== All Students ==");
        for (Student s : students) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest
        Student oldest = findOldest(students);
        System.out.println("Oldest : " + oldest);

        // 3) Count adults
        int countAdult = countAdults(students);
        System.out.println("Adults count : " + countAdult);

        // 4) Average grade
        double avg = averageGrade(students);
        System.out.println("Average : " + avg);

        // 5) Find by name
        Student foundStudent = findStudentByName(students, "Elise");
        System.out.println("Found Student : " + foundStudent);

        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : students) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(students);

        // 8) Update grade by id
        boolean updated = updateGrade(students, 1, 15);
        // function
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println("Found Student Dina : " + findStudentByName(students, "Dina"));

        // 9) Duplicate names
        boolean duplicates = hasDuplicateNames(students);
        System.out.println("Has Duplicate names : " + duplicates);

        // 10) Append new student
        Student newStudent = new Student(5, "Anass", 19, 20);
        Student[] newStudents = appendStudent(students, newStudent);
        System.out.println("=== New Students : ===");
        for (Student s : newStudents) System.out.println(s);
    }
}

