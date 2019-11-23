package info.katikireddy622.problems;

public class CreditCardMasking {

	public static String maskify(String creditCardNumber) {
		String s = "";
		int length = creditCardNumber.length();

		if (length >= 6) {
			for (int i = 0; i < length - 4; i++) {
				char c = creditCardNumber.charAt(i);
				if (i == 0) {
					s = s + creditCardNumber.charAt(0);
				} else if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7'
						|| c == '8' || c == '9') {
					s = s + "#";
				} else {
					s = s + c;
				}
			}

			for (int i = length - 4; i < length; i++) {
				s = s + creditCardNumber.charAt(i);
			}

			return s;

		}

		return creditCardNumber;
	}

	public static void main(String[] args) {

		System.out.println(maskify("4567ASD565DE8900"));
	}

}
