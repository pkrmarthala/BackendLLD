package Collections;

public class Student implements Comparable<Student> {
    int age;
    double psp;
    String name;
    double attendance;

    Student(int age, double psp, String name, double attendance) {
        this.age = age;
        this.psp = psp;
        this.name = name;
        this.attendance = attendance;
    }

    // Comparable gives a single method compareTo() for sorting objects based on a criteria,
    // that you can define inside the function.

    // The comparable interface and the compareTo() method need to be part of the class,
    // the objects of which we will be comparing.


    // Order: Desc
    @Override
    public int compareTo(Student o) {
        // One object will be passed as a parameter and the other will be the
        // 'this' object, that calls theis function.

        // comparison will happen like st1.compareTo(st2);

        // if you want the 'this' object to come first, return -1.
        // if you want the o object to come first, return 1.
        // if any object is fine to come first, return 0.

        if(this.age > o.age) {
            return -1;
        } else if(this.age < o.age) {
            return 1;
        } else {
            return 0;
        }
    }
}
