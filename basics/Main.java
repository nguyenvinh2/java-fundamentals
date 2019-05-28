public class Main {
  public static void main(String[] args) {
    int dogCount = 2;
    int catCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize(dogCount, "dog") + " and " + catCount + " " + pluralize(catCount, "cat"));

    flipNHeads(2);

  }

  public static String pluralize(int numberInput, String stringInput) {
    if(numberInput == 1) {
      return stringInput;
    } else {
      return stringInput + "s";
    }
  }

  public static void flipNHeads(int nFLips) {
    int overallCount = 0;
    int headCount = 0;
    while(headCount < nFLips) {
      double flipResult = Math.random();
      if(flipResult < .5) {
        System.out.println("tails");
        headCount = 0;
      } else {
        System.out.println("heads");
        headCount++;
      }
      overallCount++;
    }
    System.out.println("It took " + overallCount + " flips to flip " + nFLips + " in a row.");
  }
}