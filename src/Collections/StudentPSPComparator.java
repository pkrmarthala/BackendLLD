package Collections;

import java.util.Comparator;

// Comparator provides a custom sorting. We have to explicitly pass the comparator object to the Collections.sort()
// method along with the list to be sorted.

// We can define as many comparators as we want for a class depending on our requirement.
// These comparators need not be part of the class, objects of which we will be comparing.

public class StudentPSPComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        // s1 to come first: return -1
        // s2 to come first: return 1
        // anything is fine, return 0

        // Desc order of PSP
        if(s1.psp > s2.psp) {
            return -1;
        } else if(s1.psp < s2.psp) {
            return 1;
        } else {
            return 0;
        }

    }
}
