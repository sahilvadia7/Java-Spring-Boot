package ad_java.collection.set;

import java.util.HashSet;
import java.util.Set;

public class LearnHashSet {
    public static void main(String[] args) {

        // Not allow duplicate elements in it.
        // Hasing use in backgroud every thing convert into random hash and always use that hash for every time.
        // not follow the oder
        // time complexity BigO(1)
        
        Set<Integer> myhash = new HashSet<>();
        myhash.add(1);
        myhash.add(5);
        myhash.add(2);
        myhash.add(3);
        myhash.add(7);

        System.out.println(myhash);
        System.out.println(myhash.remove(3));
        System.out.println(myhash.isEmpty());
        System.out.println(myhash.contains(5));
        System.out.println(myhash.size());

        System.out.println(myhash);

    }
}
