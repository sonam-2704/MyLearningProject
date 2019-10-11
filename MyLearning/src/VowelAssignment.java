import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class VowelAssignment {

	public static void main(String[] args) {

		identifyVowels("Bbc");
		identifyVowels("aardvarks");
		identifyVowels("Aaren");
		identifyVowels("Aargau");
		identifyVowels("A.B");
		identifyVowels("Aaron's-beard");
	}

	static void identifyVowels(String a) {

		char[] b = a.toLowerCase().toCharArray();
		Map<Character, Integer> al = new HashMap<>();
		Arrays.sort(b);
		//System.out.println(b);

		for (char c : b) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				if (al.containsKey(c)) {
					al.put(c, al.get(c) + 1);
				} else {
					al.put(c, 1);
				}

			}

		}

		int vowelcountA = al.containsKey('a') ? al.get('a') : 0;
		System.out.println("Count of vowel A=" + vowelcountA);

		int vowelcountE = al.containsKey('e') ? al.get('e') : 0;
		System.out.println("Count of Vowel E=" + vowelcountE);

		int vowelcountI = al.containsKey('i') ? al.get('i') : 0;
		System.out.println("Count of Vowl I=" + vowelcountI);

		int vowelcountO = al.containsKey('o') ? al.get('o') : 0;
		System.out.println("Count of vowl O=" + vowelcountO);

		int vowelcountU = al.containsKey('u') ? al.get('u') : 0;
		System.out.println("Count of vowel U=" + vowelcountU);

		calcute(vowelcountA, vowelcountE, vowelcountI, vowelcountO, vowelcountU);

	}

	static void calcute(int A, int E, int I, int O, int U) {
		if (A != 0 || E != 0 || I != 0 || O != 0 || U != 0) {
			int sum = A + E + I + O + U;
			System.out.println("The given string is ordered");
			System.out.println("VowelCount=" + "[" + sum + "]");
		}

		else {
			System.out.println("The given input string is not ordered");
		}

	}
}
