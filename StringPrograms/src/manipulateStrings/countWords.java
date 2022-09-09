package manipulateStrings;

public class countWords {

	public static int countWords1(String inputString) {

	    int wordCount = 0;
	    int endOfString = inputString.length() - 1;

	    String str = inputString.trim(); // making sure that string should not have any spaces at the starting and
	                                        // ending
	    for (int i = 0; i < inputString.length(); i++) {

	        if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {

	            wordCount++;

	        } else if (str.charAt(i) == ' ' && str.charAt(i++) == ' ') { // if there is more than one space in between
	                                                                        // string

	            i++;

	        } else if (i == endOfString) { // matching the first missing word

	            wordCount++;
	        }
	    }
	    return wordCount;

	}
	
	
	public static void main(String[] args) {
		System.out.println(countWords1("Hurray! this is a drill for counting words"));
	}
}