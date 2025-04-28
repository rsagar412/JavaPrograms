import java.util.HashSet;

public class Hashsetjava {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>(6, 0.5f);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println(set);
        System.out.println(set.clone());
        System.out.println(set.size());
    }
}
