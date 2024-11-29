import java.util.*;

public class traverseExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Durgesh");
        names.add("Sitara");
        names.add("Satyam");
        names.add("Pooja");
        names.add("Vandna");
        names.add("vandna");

        //for each Loop:
        for(String str:names)
        {
            System.out.print(str +"\t"+ str.length()+ "\t");
            StringBuffer br = new StringBuffer(str);
            System.out.println(br.reverse());
        }

        System.out.println("----------------------------------------");

        //traversing using ITERATOR: Forward traversing
        Iterator<String> itr = names.iterator();

        while(itr.hasNext())
        {
            String next = itr.next();
            System.out.println(next);
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");


        //backward traversal of collection LISTITERATOR
        ListIterator<String> litr = names.listIterator(names.size());
        while(litr.hasPrevious())
        {
            String previous = litr.previous();
            System.out.println(previous);
        }


        //Enumeration


        System.out.println("-------------FOR EACH METHOD---------------");

        //for each method
        names.forEach(e->{
            System.out.println(e);
        });

        System.out.println("----------SORTING OF ELEMENTS----------------");
        // sorting of elements
        TreeSet<String> set = new TreeSet<>();
        set.addAll(names);
        set.forEach(e->{
            System.out.println(e);
        });
    }
}
