/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public static void main(String[] args) {
        Restaurant npot = new Restaurant("Heyoo", 5);


        Review one = new Review("Heyoo", "Humane",5);
        Review two = new Review("Heyoo", "the Guy", 4);
        Review three = new Review("Heyoo", "the onine Guy", 1);

        System.out.println(one);
        npot.addReview(one);

        npot.addReview(two);
        npot.addReview(three);
        System.out.println(npot);
    }
}
