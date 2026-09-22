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
        double average = 0;
        int studentCount = 0;
        for(Student s : students) {
            if(s != null) {
                studentCount++;
                average += s.getGrade();
            }
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
        System.out.println("High Achievers :");
        for(Student s : students) {
            if(s.getAge() >= 5) System.out.println(s.getName());
        }
    }

    // 8) Update Student Grade by id
    public static boolean updateGrade(Student[] students, int id, int newGrade) {

    }

    // 9) Find Duplicate Names
    public static boolean hasDuplicateNames(Student[] students) {

    }

    // 10) Expandable Array: return a new array with one more slot and append student
    public static Student[] appendStudent(Student[] students, Student newStudent) {

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
        for (Student s : arr) System.out.println(s);
        System.out.println("Total created: " + Student.getNumStudent());

        // 2) Oldest


        // 3) Count adults


        // 4) Average grade


        // 5) Find by name


        // 6) Sort by grade desc
        // sort function
        System.out.println("\n== Sorted by grade (desc) ==");
        for (Student s : arr) System.out.println(s);

        // 7) High achievers >= 15
        System.out.println("\nHigh achievers:");
        printHighAchievers(arr);

        // 8) Update grade by id
        // function
        System.out.println("\nUpdated id=4? " + updated);
        System.out.println(findStudentByName(arr, "Dina"));

        // 9) Duplicate names


        // 10) Append new student

    }
}

