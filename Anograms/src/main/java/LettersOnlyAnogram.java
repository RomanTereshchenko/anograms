
public class LettersOnlyAnogram {

	private String reverseLettersOnly(String inputString) {

		String[] words = inputString.split(" ");
		for (int i = 0; i < words.length; i++) {

			StringBuilder word = new StringBuilder(words[i]);
			StringBuilder wordLettersOnly = selectLetters(word);
			StringBuilder reversedWordLettersOnly = reverseLetters(wordLettersOnly);
			StringBuilder reversedWord = insertNonLetters(reversedWordLettersOnly, word);

			words[i] = reversedWord.toString();
		}

		String reversedLettersString = String.join(" ", words);
		return reversedLettersString;
	}

	private StringBuilder selectLetters(StringBuilder word) {

		char[] wordArray = word.toString().toCharArray();
		StringBuilder selectedLetters = new StringBuilder("");

		for (Character character : wordArray) {
			if (Character.isLetter(character))
				selectedLetters.append(character);
		}

		return selectedLetters;
	}

	private StringBuilder reverseLetters(StringBuilder wordLettersOnly) {

		StringBuilder reversedLettersOnly = wordLettersOnly.reverse();
		return reversedLettersOnly;
	}

	private StringBuilder insertNonLetters(StringBuilder reversedWordLettersOnly, StringBuilder word) {

		char[] wordArray = word.toString().toCharArray();

		StringBuilder reversedChars = new StringBuilder("");
		for (Character c : wordArray) {
			if (!Character.isLetter(c))
				reversedWordLettersOnly.insert(word.indexOf(c.toString()), c);
		}

		return reversedChars;
	}

	public static void main(String[] args) {

		LettersOnlyAnogram example = new LettersOnlyAnogram();

		System.out.println(example.reverseLettersOnly("a1bcd efg!h"));

	}

}
