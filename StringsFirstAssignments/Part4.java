import edu.duke.URLResource;
import edu.duke.StorageResource;

/**
 * The fourth part of the week 2 assignments
 * 
 * @Daniel Simone
 * @1.0
 */

public class Part4 {
    public String youtuber (URLResource linkList) {
        // Create a URLResource (basically, a file with the stuff in the web page)
        linkList = new URLResource("https://www2.cs.duke.edu/courses/common/videos/");
        // For every word in LinkList,
        for (String wordList : linkList.words()) {
            // Convert all of the words to upper case (to avoid problems with lower/upper case link characters)
            String wordListUpper = wordList.toUpperCase();
            // Find the reference position of youtube.com
            int referencePosition = wordList.indexOf("YOUTUBE.COM");
            // If the link has youtube.com,
            if (referencePosition != -1) {
                // Find where the link starts and ends
                int startPosition = wordList.lastIndexOf("\"", referencePosition);
                int endPosition = wordList.indexOf("\"", referencePosition + 1);
                // Create and print a substring which has everything in between the start and end position
                System.out.println("The youtube link is: " + wordList.substring(startPosition + 1, endPosition));
            }
        }
        // I have not figure out how to fix this to make it run :(
        String wordList = "";
        return wordList;
    }
}
