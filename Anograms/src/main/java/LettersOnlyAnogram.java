
public class LettersOnlyAnagram {

	private String reverseLettersOnly(String inputString) {

		String[] words = inputString.split(" ");
		for (int i = 0; i < words.length; i++) {

			StringBuilder word = new StringBuilder(words[i]);
			StringBuilder wordLettersOnly = selectLetters(word);
			StringBuilder reversedWordLettersOnly = reverseLetters(wordLettersOnly);
			StringBuilder reversedWord = insertNonLetters(reversedWordLettersOnly, word);

			words[i] = reversedWord.toString();
		}

		return reversedLettersString = String.join(" ", words);
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

		return wordLettersOnly.reverse();
	}

	private StringBuilder insertNonLetters(StringBuilder reversedWordLettersOnly, StringBuilder word) {

		char[] wordArray = word.toString().toCharArray();

		StringBuilder reversedChars = reversedWordLettersOnly;
		for (int i = 0; i < wordArray.length; i++) {
			if (!Character.isLetter(wordArray[i]))
				{
				Character j = (Character) wordArray[i];
				reversedChars.insert(word.indexOf(j.toString()), j);
				}
		}

		return reversedChars;
	}

	public static void main(String[] args) {

		LettersOnlyAnogram example = new LettersOnlyAnogram();

		System.out.println(example.reverseLettersOnly("a1bcd efg!h"));

	}

}
