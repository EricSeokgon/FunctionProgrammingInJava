package chpter2.UsingCollections;

import static chpter2.UsingCollections.Folks.*;

public class PicElementsMultipleCollection {
    public static void main(String[] args) {
        final long countFriendsStartN = friends.stream().filter(name -> name.startsWith("N")).count();

        final long countComradesStartN = comrades.stream().filter(name -> name.startsWith("N")).count();

        final long countEditorsStartN = editors.stream().filter(name -> name.startsWith("N")).count();
    }

}
