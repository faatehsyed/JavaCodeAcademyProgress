import java.util.ArrayList;

public class DNA {

  public static void main(String[] args) {
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    ArrayList<String> dna = new ArrayList<String>();
    dna.add(dna1);
    dna.add(dna2);
    dna.add(dna3);
    //System.out.println(dna.length());

    for (int i = 0; i < dna.size(); i++) {
      String item = new String(dna.get(i));
      int start = item.indexOf("ATG");
      int end = item.indexOf("TGA");
      System.out.println("Start: " + start + " | Protein: " + (i+1));
      System.out.println("End: " + end + " | Protein: " + (i+1));
      if (start != -1 && end != -1 && ((end - start) % 3 == 0)) {
        System.out.println("Yes, this input contains a protein.");
        System.out.println("Protein " + "#" + (i+1) + ": " + item);
      } else {
        System.out.println("No Protein");
      }

    }
    
    /*
    old code
    if (start != -1 && end != -1 && ((end - start) % 3 == 0)) {
      //start != -1 && end != -1 && dna.length() % 3 == 0
      System.out.println("Yes");
      String protein = dna.substring(start, dna.length());
      System.out.println(protein);
    } else {
      System.out.println("No Protein");
    }
    */

  }

}
