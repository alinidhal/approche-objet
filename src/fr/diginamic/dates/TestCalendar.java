package fr.diginamic.dates;

import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestCalendar {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(2016, 3, 19);
		Date date = cal.getTime();
		
		System.out.println(date);
		
		SimpleDateFormat formateur = new SimpleDateFormat("'Date du 'dd/MM/yyyy 'à' HH:mm 'et' ss 'secondes'");
		String dateFormatee = formateur.format(date);
		
		System.out.println(dateFormatee);
		
		Calendar cal2 = Calendar.getInstance();
		
		cal.set(0, 0);
		Date date2 = cal2.getTime();
		
		System.out.println(date2);
		
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dateFormatee2 = formateur2.format(date2);
		
		System.out.println(dateFormatee2);
		
		// Format France
		Calendar cal3 = Calendar.getInstance();
		
		cal.set(0, 0);
		Date date3 = cal3.getTime();
		
		SimpleDateFormat formateur3 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
		String dateFormatee3 = formateur3.format(date3);
		
		System.out.println(dateFormatee3);
		
		// Format Ruisse
		Calendar cal4 = Calendar.getInstance();
		
		cal.set(0, 0);
		Date date4 = cal4.getTime();
		
		SimpleDateFormat formateur4 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
		String dateFormatee4 = formateur4.format(date4);
		
		System.out.println(dateFormatee4);
		
		// Format Chinois
		Calendar cal5 = Calendar.getInstance();
		
		cal.set(0, 0);
		Date date5 = cal5.getTime();
		
		SimpleDateFormat formateur5 = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
		String dateFormatee5 = formateur5.format(date5);
		
		System.out.println(dateFormatee5);
	}

}
