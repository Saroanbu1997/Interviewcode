package Interviewquestion;

public class Reverseadates {

	public static void main(String[] args) {
		String word = "2022-07-19";
		String rev = "";
		String[] revchar = word.split("-");
		for (int i = revchar.length - 1; i >= 0; i--) {

			if (rev.equals("")) {

				rev = revchar[i];
			} else {

				rev = rev + "-" + revchar[i];
			}

		}

		System.out.println(rev);
	}
}
