package chpter2.UsingCollections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PickElements {
    final private static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Scott");

    public static void main(String[] args) {
        /*final List<String> startsWithN = new ArrayList<String>();
        for (String name : friends) {
            if(name.startsWithN("N")){
            startsWithN.add(name);
            }
        }*/

        final List<String> startsWithN =
                friends.stream()
                        .filter(name -> name.startsWith("N"))
                        .collect(Collectors.toList());
    }
}
