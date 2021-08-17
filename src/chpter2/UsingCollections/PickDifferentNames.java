package chpter2.UsingCollections;

import java.util.function.Predicate;

import static chpter2.UsingCollections.Folks.friends;

public class PickDifferentNames {
    final Predicate<String> startsWithN = name -> name.startsWith("N");
    final Predicate<String> startsWithB = name -> name.startsWith("B");

    final long countFriendsStartN= friends.stream().filter(startsWithN).count();
    final long countFriendsStartB= friends.stream().filter(startsWithB).count();
}
