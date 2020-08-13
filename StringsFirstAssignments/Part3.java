
/**
 * The third part of the week 2 assignments
 * 
 * @Daniel Simone 
 * @1.0
 */
public class Part3 {
    public boolean twoOccurrences(String stringa, String stringb) {
        int oneOccurrence = stringb.indexOf(stringa);
        if (oneOccurrence == -1) {
            return false;
        }
        else {
            int twoOccurrence = stringb.indexOf(stringa, oneOccurrence);
            if (twoOccurrence == -1) {
             return false;   
            }
            else {
                return true;
            }
        }
    }
    
    public String lastPart(String stringa, String stringb) {
        String result = "";
        int firstOccurrence = stringb.indexOf(stringa);
        if (firstOccurrence == -1) {
            result = stringb;
        }
        else {
            int length = stringa.length();
            result = stringb.substring(firstOccurrence + length);
        }
        return result;
    }
    
    public void testing() {
        String stringa = "by";
        String stringb = "A story by Abby Long";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println(twoOccurrences(stringa, stringb));
        
        stringa = "an";
        stringb = "banana";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println(twoOccurrences(stringa, stringb));
        
        stringa = "zoo";
        stringb = "forest";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println(twoOccurrences(stringa, stringb));
    }
    
    public void testinglastPart() {
        String stringa = "by";
        String stringb = "A story by Abby Long";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println("The part of the string after " + stringa + " in " + stringb+ " is " + lastPart(stringa, stringb));
        
        stringa = "an";
        stringb = "banana";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println("The part of the string after " + stringa + " in " + stringb+ " is " + lastPart(stringa, stringb));
        
        stringa = "zoo";
        stringb = "forest";
        System.out.println("stringa = "+stringa + " and stringb = " + stringb);
        System.out.println("The part of the string after " + stringa + " in " + stringb+ " is " + lastPart(stringa, stringb));
    }
}
