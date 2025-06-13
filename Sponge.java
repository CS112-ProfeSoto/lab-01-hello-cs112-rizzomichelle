/*
 * Michelle De Lacerda
 * CS 112
 * Sponge.java
 * UML CLASS DIAGRAM:
 * -------------------------------------------------------
 *   Sponge
 * -------------------------------------------------------
 * - goodNoodleStars : int
 * -------------------------------------------------------
 * + Sponge()                           // default constructor
 * + Sponge(goodNoodleStars : int)     // full constructor
 * + Sponge(original : Sponge)         // copy constructor
 * + setGoodNoodleStars(stars : int) : void
 * + getGoodNoodleStars() : int
 * + toString() : String
 * + equals(other : Sponge) : boolean
 * -------------------------------------------------------
 */
public class Sponge {
    private int goodNoodleStars;

    // Default constructor
    public Sponge() {
        this.goodNoodleStars = 1;
    }

    // Full constructor
    public Sponge(int goodNoodleStars) {
        this.goodNoodleStars = goodNoodleStars;
    }

    // Copy constructor
    public Sponge(Sponge other) {
        this.goodNoodleStars = other.goodNoodleStars;
    }

    // Setter
    public void setGoodNoodleStars(int stars) {
        this.goodNoodleStars = stars;
    }

    // Getter
    public int getGoodNoodleStars() {
        return this.goodNoodleStars;
    }

    // toString method
    public String toString() {
        return "SpongeBob has " + goodNoodleStars + " Good Noodle star(s)!";
    }

    // equals method
    public boolean equals(Sponge other) {
        return this.goodNoodleStars == other.goodNoodleStars;
    }
}