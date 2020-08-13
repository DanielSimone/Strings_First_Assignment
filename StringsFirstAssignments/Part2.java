
/**
 * The second part of the week 2 assignments
 * 
 * @Daniel Simone
 * @1.0
 */
public class Part2 {
    public String findGeneSimple(String dna, String startCodon, String stopCodon) {
        // Start with an empty string named "result"
        String result = "";
        // Convert all incoming DNA to uppercase
        String resultUpper = dna.toUpperCase();
        // Find where the start codon is
        int startIndex = resultUpper.indexOf("ATG");
        // Make sure that if there is no start codon, the result reflects that
        if (startIndex == -1) {
            return "There is no start codon";
        }
        // Find where the stop codon is
        int stopIndex = resultUpper.indexOf("TAA", startIndex+3);
        // Make sure that if there is no stop codon, the result reflects that
        if (stopIndex == -1) {
            return "There is no stop codon";
        }
        // Make sure that if there is no start or stop codon, the result reflects that
        if (startIndex == -1 && stopIndex == -1) {
            return "There is no start or stop codon";
        }
        // If there is a start and stop codon, then:
        else {
            // The resulting gene is everthing from the start to the stop codon
            result = dna.substring(startIndex+3, stopIndex);
            // Create a lowercase string to check if the original was lowercase
            String resultLower = result.toLowerCase();
            if (resultLower.equals(result)) {
                result.toLowerCase();
            }
            // The remainder integer is the remainder after the string's length is divided by 3
            int remainder = result.length() % 3;
            // Make sure the remainder is zero
            if (remainder == 0) {
                return result;
            }
            // Else, make sure the result reflects that
            else {
                return "The DNA sequence is not a multiple of three";
            }
        }
        }
    
    public void testSimpleGene() {
        // Start with a string for startCodon
        String startCodon = "ATG";
        // Start with a string for stop Codon
        String stopCodon = "TAA";
        
        // Define a string as a DNA sequence for the first test-case
        String dna = "ATGAAGTGACTACCCTACTAA";
        // Print the entire DNA sequence
        System.out.println("DNA strand is " + dna);
        // Find the gene within the DNA sequence
        String gene = findGeneSimple(dna, startCodon, stopCodon);
        // Print the gene
        System.out.println("Gene is " + gene);
        
        // Define a string as a DNA sequence for the second test-case (no ATG)
        dna = "AAGTGACTACCCTACTAA";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna, startCodon, stopCodon);
        System.out.println("Gene is " + gene);
        
        // Define a string as a DNA sequence for the third test-case (no TAA)
        dna = "ATGAAGTGACTACCCTAC";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna, startCodon, stopCodon);
        System.out.println("Gene is " + gene);
        
        // Define a string as a DNA sequence for the fourth test-case (no ATG or TAA)
        dna = "AAGTGACTACCCTAC";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna, startCodon, stopCodon);
        System.out.println("Gene is " + gene);
        
        // Define a string as a DNA sequence for the fifth test-case (the gene is not a multiple of three - I removed one "C"))
        dna = "ATGAAGTGACTACCTACTAA";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna, startCodon, stopCodon);
        System.out.println("Gene is " + gene);
        
        // Define a string as a DNA sequence for the sixth test-case (lowercase)
        dna = "atgcccgggtttagataa";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna, startCodon, stopCodon);
        System.out.println("Gene is " + gene);
    }
}
