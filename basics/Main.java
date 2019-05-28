public class Main {
  public static void main(String[] args) {
    int dogCount = 2;
    int catCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize(dogCount, "dog") + " and " + catCount + " " + pluralize(catCount, "cat"));

  }

  public static String pluralize(int numberInput, String stringInput) {
    if(numberInput == 1) {
      return stringInput;
    } else {
      return stringInput + "s";
    }
  }
}