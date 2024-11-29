import java.util.*;

public class firstCode {
    public static void main(String[] args) {
        
        //Type safe collection
        // Arraylist
        ArrayList<String> names = new ArrayList<String>();

        names.add("Durgesh");
        names.add("Sitara");
        names.add("Satyam");
        names.add("Pooja");
        names.add("Vandna");
        names.add("vandna");
        System.out.println(names);

        // for get element
        System.out.println(names.get(0));
        System.out.println(names.get(1));

        // for remove element
        names.remove("Sitara");
        names.remove("Vandna");
        System.out.println(names);

        // for size of elements
        System.out.println("SIZE = " +names.size());

        //check item is there or not
        System.out.println(names.contains("Sitara"));
        System.out.println(names.contains("Satyam"));

        //check for empty
        System.out.println(names.isEmpty());

        //setting value
        names.set(1, "Ram");
        System.out.println(names);
        names.add(1, "Satyam");
        System.out.println(names);

        //remove all elements
        // names.clear();
        // System.out.println(names);


        // vector
        Vector<String> vector = new Vector<>();
        vector.addAll(names);

        System.out.println("VECTOR " +vector);


        System.out.println("-----------------------------------------------------");


        //Hashset
        HashSet<Double> nms = new HashSet<>();
        nms.add(14.14);
        nms.add(34.12354);
        nms.add((2354.235));
        nms.add(99.3);
        nms.add(99.3);
        nms.add(5.3);

        System.out.println(nms);

        //Treeset
        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(nms);
        System.out.println(tset);


        //Un-Type Safe
        // LinkedList list = new LinkedList();
        // list.add("Sachin");
        // list.add(101);
        // list.add(625.5124);
        // list.add(true);
        // System.out.println(list);
    }
}
