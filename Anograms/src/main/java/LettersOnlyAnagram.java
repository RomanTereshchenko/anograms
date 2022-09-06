
public class LettersOnlyAnagram {

	private String reverseLettersOnly(String inputString) {

		String[] words = inputString.split(" ");
		for (int i = 0; i < words.length; i++) {

			StringBuilder word = new StringBuilder(words[i]);
			StringBuilder wordLettersOnly = selectLetters(word);
			StringBuilder reversedWordLettersOnly = reverseLettersOnly(wordLettersOnly);
			StringBuilder reversedWord = insertNonLetters(reversedWordLettersOnly, word);

			words[i] = reversedWord.toString();
		}
		
		return String.join(" ", words);
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

	private StringBuilder reverseLettersOnly(StringBuilder wordLettersOnly) {

		return wordLettersOnly.reverse();
	}

	private StringBuilder insertNonLetters(StringBuilder reversedWordLettersOnly, StringBuilder word) {

		char[] wordAsArrayOfChars = word.toString().toCharArray();

		StringBuilder reversedChars = reversedWordLettersOnly;
		for (int i = 0; i < wordAsArrayOfChars.length; i++) {
			if (!Character.isLetter(wordAsArrayOfChars[i]))
				{
				Character j = (Character) wordAsArrayOfChars[i];
				reversedChars.insert(i, wordAsArrayOfChars[i]);
				}
		}

		return reversedChars;
	}

	public static void main(String[] args) {

		LettersOnlyAnagram example = new LettersOnlyAnagram();

		System.out.println(example.reverseLettersOnly("a1bcd efg!h"));

	}

}
