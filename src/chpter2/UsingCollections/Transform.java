package chpter2.UsingCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Transform {
    final private static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Scott");

    public static void main(String[] args) {

        //final List<String> uppercaseNames = new ArrayList<String>();

        /*for (String name : friends) {
            uppercaseNames.add(name.toLowerCase());
        }*/

        /*friends.forEach(name -> uppercaseNames.add(name.toLowerCase()));*/

        friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
        System.out.println();
    }
}
