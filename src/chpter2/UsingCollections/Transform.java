package chpter2.UsingCollections;

import java.util.Arrays;
import java.util.List;

import static chpter2.UsingCollections.Folks.friends;

public class Transform {
    //final private static List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Scott");

    public static void main(String[] args) {

        //final List<String> uppercaseNames = new ArrayList<String>();

        /*for (String name : friends) {
            uppercaseNames.add(name.toLowerCase());
        }*/

        /*friends.forEach(name -> uppercaseNames.add(name.toLowerCase()));*/

        /*friends.stream()
                .map(name -> name.toUpperCase())
                .forEach(name -> System.out.print(name + " "));
        System.out.println();*/

        /*friends.stream()
                .map(name -> name.length())
                .forEach(count -> System.out.print(count + " "));*/

        friends.stream()
                .map(String::toUpperCase)
                .forEach(name -> System.out.print(name));

    }
}
