package info.katikireddy622.problems;

public class NumberToOrdinal {

	public static String numberToOrdinal(Integer number) {
		String s = "" + number;
		int n = number % 10;
		int nn = number % 100;
		if (number > 0) {
			if (n == 1 && nn != 11) {
				s = s + "st";
			} else if (n == 2 && nn != 12) {
				s = s + "nd";
			} else if (n == 3 && nn != 13) {
				s = s + "rd";
			} else {
				s = s + "th";
			}
		}
		return s;
	}

	public static void main(String[] args) {

		System.out.println(numberToOrdinal(0));
	}
}
