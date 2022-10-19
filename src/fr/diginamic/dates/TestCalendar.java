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
		
		Date date2 = cal2.getTime();
		
		SimpleDateFormat formateur2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String dateFormatee2 = formateur2.format(date2);
		
		System.out.println(dateFormatee2);
		
		// Format France
		Calendar calJour = Calendar.getInstance();
		
		Date dateJour = calJour.getTime();
		
		SimpleDateFormat formateurFR = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.FRANCE);
		String dateFormateeFR = formateurFR.format(dateJour);
		
		System.out.println(dateFormateeFR);
		
		// Format Ruisse
		
		SimpleDateFormat formateurRU = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", new Locale("ru", "RU"));
		String dateFormateeRU = formateurRU.format(dateJour);
		
		System.out.println(dateFormateeRU);
		
		// Format Chinois
		SimpleDateFormat formateurCH = new SimpleDateFormat("EEEE dd MMMM yyyy HH:mm:ss", Locale.CHINA);
		String dateFormateeCH = formateurCH.format(dateJour);
		
		System.out.println(dateFormateeCH);
	}

}
