package day53_Iterable_Maps;

import sun.awt.image.ImageWatched;

import java.util.*;

public class Iterating_Collections2 {
    public static void main(String[] args) {
        LinkedHashSet<String> names = new LinkedHashSet<>();
        names.addAll(Arrays.asList("Mehmet","Mohammed","Yucel","Sha","Ozgur","Ahmet","Osmanj","Ozgur","Ozgur","Ozgur","Ozgur","Ozgur","Irina"));

        System.out.println(names);

        Iterator<String> it = names.iterator();
        while (it.hasNext()){
            String s = it.next();
            if ( s.toLowerCase().contains("m") ){
                it.remove();
            }
        }

        System.out.println("names = " + names);
        System.out.println("======================================");

        LinkedHashSet<String> n = new LinkedHashSet<>();
        n.addAll(Arrays.asList("Mehmet","Mohammed","Yucel","Sha","Ozgur","Ahmet","Osmanj","Ozgur","Ozgur","Ozgur","Ozgur","Ozgur","Irina"));

        n.removeIf(s -> s.contains("m") || s.contains("M"));
        System.out.println("n = " + n);

        System.out.println("=======================================");

        LinkedHashSet<String> T = new LinkedHashSet<>();
        T.addAll(Arrays.asList("Mehmet","Mohammed","Yucel","Sha","Ozgur","Ahmet","Osmanj","Ozgur","Ozgur","Ozgur","Ozgur","Ozgur","Irina"));

        T.removeAll(Arrays.asList("Mehmet","Ozgur","Mohammed"));
        System.out.println(T);

        System.out.println("========================================");
        LinkedHashSet<String> R = new LinkedHashSet<>();
        R.addAll(Arrays.asList("Mehmet","Mohammed","Yucel","Sha","Ozgur","Ahmet","Osmanj","Ozgur","Ozgur","Ozgur","Ozgur","Ozgur","Irina"));

        R.retainAll(Arrays.asList("Yucel","Sha","Ahmet"));
        System.out.println(R);

        System.out.println("===========================================");
        List<Integer> list = new ArrayList<>();
        list.addAll((Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7)));

        boolean result =  list.containsAll(Arrays.asList(5,6,9,11,8));

        System.out.println(result);

    }


}
