
/**
 * The first part of the week 2 assignments
 * 
 * @Daniel Simone
 * @1.0
 */
public class Part1 {
    public String findGeneSimple(String dna) {
        // Start with an empty string named "result"
        String result = "";
        // Find where the start codon is
        int startIndex = dna.indexOf("ATG");
        // Make sure that if there is no start codon, "result" is empty
        if (startIndex == -1) {
            return "";
        }
        // Find where the stop codon is
        int stopIndex = dna.indexOf("TAA", startIndex+3);
        // Make sure that if there is no stop codon, "result" is empty
        if (stopIndex == -1) {
            return "";
        }
        // The "result" is all the codons including the start and stop codons
        result = dna.substring(startIndex, stopIndex+3);
        // "result" is the answer
        return result;
    }
    public void testSimpleGene() {
        // Define a string as a DNA sequence for the first test-case
        String dna = "ATGAAGTGACTACCCTACTAA";
        // Print the entire DNA sequence
        System.out.println("DNA strand is " + dna);
        // Find the gene within the DNA sequence
        String gene = findGeneSimple(dna);
        // Print the gene
        System.out.println("Gene is " + gene);
        
        // Define a string as a DNA sequence for the second test-case (no ATG)
        dna = "AAGTGACTACCCTACTAA";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
        
        // Define a string as a DNA sequence for the third test-case (no TAA)
        dna = "ATGAAGTGACTACCCTAC";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
        
        // Define a string as a DNA sequence for the fourth test-case (no ATG or TAA)
        dna = "AAGTGACTACCCTAC";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
        
        // Define a string as a DNA sequence for the fifth test-case (the gene is not a multiple of three - I removed one "C"))
        dna = "ATGAAGTGACTACCTACTAA";
        System.out.println("DNA strand is " + dna);
        gene = findGeneSimple(dna);
        System.out.println("Gene is " + gene);
    }
}
