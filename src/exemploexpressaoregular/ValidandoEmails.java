package exemploexpressaoregular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidandoEmails {

	public static void main(String[] args) {
		String[] emails = {"java@hotmail.com", "python@", "ruby@ruby", "android@hotmail.com"};

		Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
		for (String email : emails) {
			Matcher matcher = pattern.matcher(email);
			if (matcher.matches()) {
				System.out.println(email + " � um e-mail v�lido.");
			}
		}
	}

}
