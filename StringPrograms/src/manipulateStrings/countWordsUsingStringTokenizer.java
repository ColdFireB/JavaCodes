package manipulateStrings;

import java.util.StringTokenizer;

public class countWordsUsingStringTokenizer{
	
	public static int countWordsUsingTokenizer(String inputString) {

	    if (!inputString.isEmpty()) {
	        StringTokenizer stringTokenizer = new StringTokenizer(inputString); // create StringTokenizer using the
	                                                                            // inputString

	        return stringTokenizer.countTokens(); // returning the number of tokens i.e. number of words
	    }
	    return 0;
}
	
	public static void main(String[] args) {

		
		String s1 = "How many words will count this sentence be possible";
		
		//countWordsUsingTokenizer(s1);
		
		StringTokenizer stringTokenizer = new StringTokenizer(s1); // create StringTokenizer using the
        // inputString
		
		System.out.println(stringTokenizer.countTokens());
	}
}