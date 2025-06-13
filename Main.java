/*
 * Michelle De Lacerda
 * CS 112
 * Main.java
 *
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to CS 112!");
        System.out.println("Bikini Bottom Java Adventures ");
        System.out.println("Hi, I'm SpongeBob and I love CS 112!");

        singThemeSong();
        int jellyfishCaught = countJellyfish(3);
        System.out.println("SpongeBob caught " + jellyfishCaught + " jellyfish today!");

        Sponge bob1 = new Sponge();                // default: 1 star
        Sponge bob2 = new Sponge(7);              // full constructor
        Sponge bob3 = new Sponge(bob2);           // copy constructor

        System.out.println(bob1);
        System.out.println(bob2);
        System.out.println("Are Bob2 and Bob3 equal? " + bob2.equals(bob3));
    }

    public static void singThemeSong() {
        System.out.println("Who lives in a pineapple under the sea?");
        System.out.println("SpongeBob SquarePants!");
    }

    public static int countJellyfish(int hours) {
        return hours * 4;
    }
}