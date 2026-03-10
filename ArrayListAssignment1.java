import java.util.*;

public class ArrayListAssignment1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Pineapple");
        list.add("Strawberry");

        list.add("Mumbai");
        list.add("Delhi");

        list.add("Singing");
        list.add("Cricket");

        System.out.println("Original ArrayList: " + list);

        list.remove("Cricket");
        System.out.println("After removing hobby Cricket: " + list);

        System.out.println("Searching for cricket: " + list.contains("Cricket"));

        list.remove("Delhi");
        list.remove("Apple");
        System.out.println("After removing 1 city & 1 fruit: " + list);

        System.out.println("4th element: " + list.get(3));
        System.out.println("6th element: " + list.get(5));

        int index = list.indexOf("Singing");
        if (index != -1) list.set(index, "Dancing");
        System.out.println("After replacing Singing with Dancing: " + list);

        Collections.reverse(list);
        System.out.println("Reversed ArrayList: " + list);

        list.add(3, "Kerala");
        list.add(1, "Mango");
        System.out.println("After adding Kerala & Mango: " + list);

        System.out.println("Length of ArrayList: " + list.size());

        list.clear();
        System.out.println("ArrayList after clearing: " + list);
    }
}
