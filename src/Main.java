import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(6);
        set.add(8);

        Set<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(3);
        set.add(5);

       symmetricDifference(set,set1);



    }
    public static void symmetricDifference(Set<Integer>a1, Set<Integer>a2){
       Set<Integer> a3 = new HashSet<>(a1);
       a3.addAll(a2);
       Set<Integer> a4 = new HashSet<>(a2);
       a4.retainAll(a2);
       a3.removeAll(a4);
        System.out.println(a3);

    }
}