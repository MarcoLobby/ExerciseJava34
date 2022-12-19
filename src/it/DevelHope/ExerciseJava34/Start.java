package it.DevelHope.ExerciseJava34;

public class Start {
    public static void main(String[] args) {

        String string = "tup tuup tuuup tuuuup";
        String string2 = string.replaceAll("[u]{2,3}","X");

        System.out.println(string2);

    }
}
/*
    You have a string with the following value: tup tuup tuuup tuuuup
    with a regular expression, change into X all repetitions of the letter u, considering at least 2 repetitions but no more than 3 repeated letters
    print the result
*/