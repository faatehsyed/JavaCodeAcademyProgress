// Import statement:

class PrimeDirective {

  int numChosen;

  // Add your methods here:
  public PrimeDirective(int num) {
    numChosen = num;
  }

  public String isPrime() {
    if (numChosen <= 1) {
      return "This is not a prime number";
    } else {
      for (int i = 2; i < numChosen; i++) {
        if (numChosen % i == 0) {
          return "This is not a prime number";
        }
      }

      return "This is a prime number";
    }
  }

  public static void main(String[] args) {
    PrimeDirective test10 = new PrimeDirective(17);
    System.out.println(test10.isPrime());
  }
}
