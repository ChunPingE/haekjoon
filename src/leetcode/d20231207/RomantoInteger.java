package leetcode.d20231207;

public class RomantoInteger {
	public int romanToInt(String s) {
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			int num = getNumber(c);

			if (i + 1 == s.length()) {
				sum += num;
				continue;
			}

			char next = s.charAt(i + 1);

			if (num < getNumber(next)) {
				sum -= num;
			} else {
				sum += num;
			}
		}

		return sum;
	}

	public int getNumber(char character) {
		switch (character) {
		case 'V': {
			return 5;
		}
		case 'X': {
			return 10;
		}
		case 'L': {
			return 50;
		}
		case 'C': {
			return 100;
		}
		case 'D': {
			return 500;
		}
		case 'M': {
			return 1000;
		}
		default: {
			return 1;
		}
		}
	}

}
