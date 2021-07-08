package chpter2.UsingCollections;

import java.util.function.Predicate;

import static chpter2.UsingCollections.Folks.*;

public class PicElementsMultipleCollection {
    public static void main(String[] args) {

        Predicate<String> startsWithN = name -> name.startsWith("N");
        final long countFriendsStartN = friends.stream().filter(startsWithN).count();

        final long countComradesStartN = comrades.stream().filter(startsWithN).count();

        final long countEditorsStartN = editors.stream().filter(startsWithN).count();

    }

}
