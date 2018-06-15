package com.tryout.randomstuff;

import java.util.ArrayList;
import java.util.List;

public class PigLatin {
	static List<Character> vowelList = new ArrayList<>();
	static String DELIMITER = " ";

	static {
		vowelList.add('a');
		vowelList.add('e');
		vowelList.add('i');
		vowelList.add('o');
		vowelList.add('u');
	}

	public static void main(String args[]) {

		/*
		 * Scanner scanner = new Scanner(System.in); 
		 * String input = scanner.next();
		 */
		System.out.println("Encrypted string: " + encrpytSentence("Eats Apples?!?! hello fine, Are you sick today?"));
	}

	static String encrpytSentence(String sentence) {
		if (sentence == null || sentence.length() == 0 || sentence.isEmpty())
			return null;
		String[] wordsArr = sentence.split(DELIMITER);
		String outputStr = "";
		for (String word : wordsArr) {
			char[] letters = word.toCharArray();
			outputStr = outputStr + encrypt(letters);
			outputStr = outputStr + DELIMITER;
		}
		return outputStr;
	}

	/**
	 * to encrypt and add ay at the end
	 * 
	 * @param inputWord
	 * @return
	 */
	static String encrypt(char[] inputWord) {
		if (inputWord == null || inputWord.length == 0) {
			return "";
		}
		char[] outputWord = new char[inputWord.length + 2];

		int firstVowelIndex = findFirstVowelIndex(inputWord);
		int specialCharIndex = findSpecialCharacterIndex(inputWord);
		int startIndex = 0;
		int endIndex = inputWord.length;
		int outputWordIndex = 0;

		if (specialCharIndex != -1) {
			endIndex = specialCharIndex;
		}
		if (firstVowelIndex != -1) {
			startIndex = firstVowelIndex;
		}

		for (int index = startIndex; index < endIndex; index++) {
			outputWord[outputWordIndex++] = inputWord[index];
		}
		for (int index = 0; index < startIndex; index++) {
			if (Character.isUpperCase(inputWord[index]))
				outputWord[outputWordIndex++] = Character.toLowerCase(inputWord[index]);
			else
				outputWord[outputWordIndex++] = inputWord[index];
		}
		outputWord[outputWordIndex++] = 'a';
		outputWord[outputWordIndex++] = 'y';

		for (int index = endIndex; index < inputWord.length; index++) {
			outputWord[outputWordIndex++] = inputWord[index];
		}

		return capsCheck(inputWord, outputWord);
	}

	static char findFirstVowel(char[] letters) {
		for (char letter : letters) {
			if (vowelList.contains(new Character(letter)))
				return letter;
		}
		return '0';
	}

	/**
	 * to find the index of first vowel in a char array
	 * 
	 * @param letters
	 * @return
	 */
	static int findFirstVowelIndex(char[] letters) {
		for (int index = 0; index < letters.length; index++) {
			if (vowelList.contains(new Character(letters[index])))
				return index;
		}
		return -1;
	}

	static int findSpecialCharacterIndex(char[] letters) {
		for (int index = 0; index < letters.length; index++) {
			if (!Character.isLetterOrDigit(letters[index]))
				return index;
		}
		return -1;
	}

	/**
	 * if given string starts with caps convert o/p string to caps(first letter
	 * only)
	 * 
	 * @param inputWord
	 * @param outputWord
	 * @return
	 */
	static String capsCheck(char[] inputWord, char[] outputWord) {
		if (Character.isUpperCase(inputWord[0])) {
			outputWord[0] = Character.toUpperCase(outputWord[0]);
		}
		return new String(outputWord);
	}

}