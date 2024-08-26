package Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {

        // list: ordered collection: Insertion Order
        // List allows duplicate elements
        // index: inserting, searching, random access
        // Famous for storing properties

        // Array BTS. Dynamic / Growable Array
        // random access: O(1) TC: using index
        // Not thread safe => not synchronized
        List<String> list = new ArrayList<>();

        // doubly LinkedList is used to implement this collection
        // random access: O(N) TC
        // lot of insertion & deletion
        // Not thread safe => not synchronized
        List<Integer> list1 = new LinkedList<>();

        // Synchronized ArrayList => Thread safe
        // Not very frequently used. It has become Legacy collection.
        // It'll be slow since all the methods are synchronized, and they'll be locking the entire object during the iteration.
        // copyAndWriteArrayList offers high performance
        List<Integer> list2 = new Vector<>();

        // DS with LIFO behaviour
        // Array / LinkedList BTS
        // Stack extends vector class => Synchronized => Thread safe.
        List<Integer> list3 = new Stack<>();

        /* ------------------------------------------------------------------------------------------ */

        // Set interface: will not allow duplicates.
        // generally not ordered collection. We do have specifically ordered ones as well.
        // famous for fast searching capabilities: O(1) TC

        // Not of any Order: Random
        // Avg TC: O(1) Worst case: O(N)
        // Similar to ArrayList
        Set<Integer> set1 = new HashSet<>();

        // Insertion order
        // Avg TC: O(1) Worst case: O(N)
        // DLL (to maintain insertion order) + HashMap (for quick search)
        Set<Integer> set2 = new LinkedHashSet<>();

        // Natural Sorted Order: Default: Ascending Order
        // Avg TC: O(log2(N))
        // BBST: Balanced Binary Search Tree: Red Black Trees
        // We can also pass the comparator to change the sorted order.
        Set<Integer> set3 = new TreeSet<>();

        set1.add(16);
        set1.add(5);
        set1.add(2);
        set1.add(8);
        set1.add(1);

        set2.add(16);
        set2.add(5);
        set2.add(2);
        set2.add(8);
        set2.add(1);

        set3.add(16);
        set3.add(5);
        set3.add(2);
        set3.add(8);
        set3.add(1);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);

        // Queue: used to hold items before processing
        // General order of precessing is FIFO. We can have any order based on the priority
        // Direct implementation: Priority Queue

        // Queue is extended by another interface called Deque (Double ended Queue).
        // Remove and insert at both the ends.

        // For FIFO behaviour
        Queue<Integer> q = new LinkedList<>();

        // For any other behaviour,
        // Default: Natural Sorted Order -> Ascending Order => Min Heap
        // Insertion & Traversal TC: O(log2N) exactly same as heap
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(16);
        pq.add(5);
        pq.add(2);
        pq.add(8);
        pq.add(1);

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
            // pq.poll();
        }

        // We can also pass the comparator to change the sorted order.



        /* ------------------------------------------------------------------------------------------ */

        // Map interface: Key, Value
        // Collections expect only one data type.
        // To bring all the other DS under one root, Map is not put under the collections

        // Same differences between these three version of implementations just like the Set

        // No order
        Map<Integer,String> map1 = new HashMap<>();

        // Insertion Order
        Map<Integer,String> map2 = new LinkedHashMap<>();

        // Sorted Order: Natural: Asc
        Map<Integer,String> map3 = new TreeMap<>();


        Map<Integer,String> map4 = new Hashtable<>();

        // Diff between HashMap, Hashtable, ConcurrentHashMap
        // HashMap -> Not thread safe, allows null
        // Hashtable (will not allow null) , ConcurrentHashMap -> Thread safe

        // Hashtable will block the complete block / collection during operations
        // ConcurrentHashMap divides the complete collection into a bucket / segment.
        // During ops, only that particular segment will be blocked from updates/writes.
        // Reading, searching can be done though. But it'll take sometime to check for the latest updates. (CAS algo).


        /* ------------------------------------------------------------------------------------------ */

        // Comparable, Comparator
        List<Student> students = new ArrayList<>();
        students.add(new Student(25, 65.0, "Mohit", 10.0));
        students.add(new Student(21, 78.0, "Nidhi", 100.0));
        students.add(new Student(28, 20.0, "Kanu", 90.0));

        // Comparable is used for a single default ordering of any custom class.
        // Comparator provides multiple custom sorting rules for a single class.

        System.out.println(" ");

        Collections.sort(students);  // does based on the compareTo function provided.

        for(Student s : students) {
            System.out.println(s.name);
        }

        // Collections.sort(students, new StudentPSPComparator());
        // used the Lambda expression for sorting based on attendance percentage
        Collections.sort(students, (o1, o2) -> {
            if(o1.attendance > o2.attendance) {
                return -1;
            } else if(o1.attendance == o2.attendance) {
                return 1;
            } else return 0;
        });

        System.out.println(" ");

        for(Student s : students) {
            System.out.println(s.name);
        }

        Queue<Student> q1 = new PriorityQueue<>(new StudentPSPComparator());
        // This will use the comparator passed to prioritize the objects in the priority queue.

        while(!q1.isEmpty()) {
            System.out.println(q1.poll());
            // pq.poll();
        }

    }
}
