package chpter2.UsingCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickElements {
    final private static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Scott");

    public static void main(String[] args) {
        final List<String> startsWithN = new ArrayList<String>();
        for (String name : friends) {
            startsWithN.add(name);
        }
    }
}
