package stringPrograms;

public class NumberOfWordsInStringUsingArray {

	public static void main(String[] args) {

		String sentence = "This is a program program program to find number number of words number in a String";
		int count = 0;
		sentence = sentence.trim();

		String[] s = sentence.split(" ");

		for (int i = 0; i < s.length-1; i++) {
			// count =1;
			for (int j = i + 1; j < s.length; j++) {
				if (s[i].equalsIgnoreCase(s[j])) {
					count++;
					s[j] = "0";
				}
			}
			if (count > 1 && s[i] != "0") {
				System.out.println("Repeated String is: " + s[i] + "  Number of occurance in String: " + count);
			}
			count = 1;
		}
	}
}
