package in.sample.porkko.test;

import java.util.Calendar;
import java.util.Locale;

public class DateAndTimeCheck {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		@SuppressWarnings("static-access")
		Locale[] loc = cal.getAvailableLocales();
		System.out.println(loc.length);
		for(Locale l:loc){
			System.out.println("----->"+l.getDisplayCountry()+"---display language--->"+l.getDisplayLanguage());
		}
	}
}
