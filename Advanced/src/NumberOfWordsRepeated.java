import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberOfWordsRepeated {

	static String uniq[];
	
	public static String[] convertWordArray(String str) {
		str = str.toLowerCase();
		String test[] = str.split(" ");
		return test;
	}
	
	public static void findRepetitiveWordsinString(String str) {
		String[] test =convertWordArray(str);
		int len = test.length;
		int count;
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i < len; i++) {
			count = 1;
			for (int j = i + 1; j < len; j++) {
				if (test[i].equals(test[j])) {
					count++;
					test[j] = "0";
				}
			}
			if (count > 1 && test[i] != "0") {
				System.out.println(test[i]);
				l.add(i);
			}
		}
		System.out.println("Repetitive words at index :" +l);
		uniq = new String[l.size()];	
		for (int i = 0; i < l.size(); i++) {
			uniq[i] = test[l.get(i)];
		}
		System.out.println("Number of words that are repeated: " + uniq.length);
	}

	public static void countMatches(String a[], String b[]) {
		int count;
		for (int i = 0; i < a.length; i++) {
			count = 0;
			for (int j = 0; j < b.length; j++) {
				if (a[i].equals(b[j]))
					count++;
			}
			if (count > 1) {
				System.out.println("Repeating word is: " + a[i] + "  and the repeating count is " + count);
			}
		}
	}

	public static void main(String[] args) {
		String str;
		Scanner scanner = new Scanner(System.in);
			str = scanner.nextLine();
		findRepetitiveWordsinString(str);
		countMatches(uniq, convertWordArray(str));
	}
}