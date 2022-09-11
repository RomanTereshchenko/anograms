package com.foxminded.javaspring.anagrams;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class LettersOnlyAnagramTest {

	@Test
	public void reverseLettersOnly_returnsReversedLettersAndNonReversedElse_anyStringInput() {
		LettersOnlyAnagram example = new LettersOnlyAnagram();
		assertEquals("d1cba hgf!e", example.reverseLettersOnly("a1bcd efg!h"));
	}

	@Test(expected = NullPointerException.class)
	public void reverseLettersOnly_throwsNullPointerException_inputIsNull() {
		LettersOnlyAnagram example = new LettersOnlyAnagram();
		String nullCheck = null;

		NullPointerException thrown = Assertions.assertThrows(NullPointerException.class, () -> {
			example.reverseLettersOnly(nullCheck);
		});
		String expectedMessage = "NullPointerException";
		String actualMessage = thrown.getMessage();
		assertTrue(actualMessage.contains(expectedMessage));
	}

	@Test
	public void reverseLettersOnly_returnsEmpty_inputIsEmptyString() {
		LettersOnlyAnagram example = new LettersOnlyAnagram();
		assertEquals("", example.reverseLettersOnly(""));
	}

	@Test
	public void reverseLettersOnly_returnsReversedLettersAndNonReversedElse_inputContainsSeveralSpaces() {
		LettersOnlyAnagram example = new LettersOnlyAnagram();
		assertEquals("d1cba   hgf!e", example.reverseLettersOnly("a1bcd   efg!h"));
	}

	@Test
	public void reverseLettersOnly_returnsSingleCharacter_inputIsSingleCharacter() {
		LettersOnlyAnagram example = new LettersOnlyAnagram();
		assertEquals("a", example.reverseLettersOnly("a"));
	}

	@Test
	public void reverseLettersOnly_returnsreturnsReversedLettersAndNonReversedElse_inputContainsMultipleSameLetter() {
		LettersOnlyAnagram example = new LettersOnlyAnagram();
		assertEquals("dcbaaaa1aaa hgggggggf!e", example.reverseLettersOnly("aaaaaaa1bcd efggggggg!h"));
	}

	@Test
	public void reverseLettersOnly_returnsreturnsReversedLettersAndNonReversedElse_inputContainsSameCharacterInLowerAndUpperCase() {
		LettersOnlyAnagram example = new LettersOnlyAnagram();
		assertEquals("dc1bAa Hhg!fe", example.reverseLettersOnly("aA1bcd efg!hH"));
	}

	@Test
	public void reverseLettersOnly_returnsreturnsReversedLettersAndNonReversedElse_inputIsOtherWords() {
		LettersOnlyAnagram example = new LettersOnlyAnagram();
		assertEquals("$rehto sdr*ow", example.reverseLettersOnly("$other wor*ds"));
	}

	@Test
	public void reverseLettersOnly_returnsNonReversedCharacters_inputIsOnlySymbols() {
		LettersOnlyAnagram example = new LettersOnlyAnagram();
		assertEquals("!@#$ %^&*", example.reverseLettersOnly("!@#$ %^&*"));
	}

	@Test
	public void reverseLettersOnly_returnsReversedLettersAndNonReversedElse_inputIsSeveralWords() {
		LettersOnlyAnagram example = new LettersOnlyAnagram();
		assertEquals("!dcba h@gfe lk#ji pon$m", example.reverseLettersOnly("!abcd e@fgh ij#kl mno$p"));
	}

}
