
public class SimpleAnogram {

	private String reverseString(String inputString) {
		String[] words = inputString.split(" ");
		for (int i = 0; i < words.length; i++) {
			StringBuilder wordSB = new StringBuilder(words[i]);
			StringBuilder reversedWordSB = wordSB.reverse();
			words[i] = reversedWordSB.toString();
		}

		String reversedString = String.join(" ", words);
		return reversedString;
	}

	public static void main(String[] args) {
		SimpleAnogram example = new SimpleAnogram();
		System.out.println(example.reverseString("abcd efgh"));
	}

}
