package chpter2.UsingCollections;

import java.util.Arrays;
import java.util.List;

public class iterating {
    public static void main(String[] args) {
        final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Scott");

        /*for (int i = 0; i < friends.size(); i++) {
            System.out.println(friends.get(i));
        }*/

        /*for (String name : friends) {
            System.out.println(name);
        }*/

        /*friends.forEach(new Consumer<String>() {
            public void accept(String name) {
                System.out.println(name);
            }
        });*/

        /*friends.forEach((final String name) -> System.out.println(name));*/

        /*friends.forEach((name) -> System.out.println(name));*/

        /*friends.forEach(name -> System.out.println(name));*/

        friends.forEach(System.out::println);


    }
}
