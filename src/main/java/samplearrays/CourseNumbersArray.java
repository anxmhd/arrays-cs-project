package samplearrays;

public class CourseNumbersArray {
    public static void main(String[] args) {
        int[] registeredCourses = {1010, 1020, 2080, 2140, 2150, 2160};
        int[] updatedCourses = new int[registeredCourses.length + 1];

        for(int i = 0; i < registeredCourses.length; i++) {
            updatedCourses[i] = registeredCourses[i];
        }

        int newCourse = 2200;
        updatedCourses[registeredCourses.length] = newCourse;

        System.out.println("Updated Courses :");
        for(int el : updatedCourses) System.out.println(el);

        int courseToCheck = 3000;
        boolean found = false;
        for(int el : updatedCourses) {
            if(el == courseToCheck) found = true;
        }
        if(found) System.out.println("Course " + courseToCheck + " found");
        else System.out.println("Course " + courseToCheck + " not found");
    }
}
