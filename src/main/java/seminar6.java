import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;


public class seminar6 {
    public static void main(String[] args) {
        MySet<Integer> ms = new MySet<>();
        HashSet hs = new HashSet();
        System.out.println(ms.add(456));
        System.out.println(ms.add(456));
        System.out.println(ms.size());
        System.out.println(ms.remove(456));
        System.out.println(ms.remove(456));
        System.out.println(ms.add(9));
        System.out.println(ms.add(10));

        Iterator<Integer> iter = ms.iterator();
                while(iter.hasNext()){
                    System.out.println(iter.next());
                }
    }
}
class MySet<E> {
    private HashMap<E, Object> mp = new HashMap<>();
    private static final Object OBJ = new Object();

    public boolean add(E num) {
        return mp.put(num, OBJ) == null;
    }

    public boolean remove(E num) {
        return mp.remove(num) != null;
    }

    public int size() {
        return mp.size();
    }

    public Iterator<E> iterator(){
        return mp.keySet().iterator();
    }

}