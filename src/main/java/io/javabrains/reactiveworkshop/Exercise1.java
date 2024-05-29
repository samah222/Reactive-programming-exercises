package io.javabrains.reactiveworkshop;

import java.util.List;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        System.out.println("Print all numbers in the intNumbersStream stream");
        StreamSources.intNumbersStream().forEach(System.out::println);

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        System.out.println("Print numbers from intNumbersStream that are less than 5");
        StreamSources.intNumbersStream().filter(i -> i < 5).forEach(System.out::println);

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        System.out.println("Print the second and third numbers in intNumbersStream that's greater than 5");
        StreamSources.intNumbersStream().filter(i -> i < 5).skip(1).forEach(System.out::println);

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        int result = StreamSources.intNumbersStream().filter(i -> i > 5).findFirst().orElse(-1);
        System.out.println("Print the first number greater than 5 if not exist return -1 : " + result);

        // Print first names of all users in userStream
        // TODO: Write code here
        System.out.println("Print first names of all users in userStream");
        StreamSources.userStream().map(u -> u.getFirstName()).forEach(System.out::println);

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        System.out.println("Print first names in userStream for users that have IDs from number stream");
        List<Integer> Ids = StreamSources.intNumbersStream().toList();
        StreamSources.userStream().filter(u -> Ids.contains(u.getId())).map(u -> u.getFirstName()).forEach(System.out::println);

    }

}
