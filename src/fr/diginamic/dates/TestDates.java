package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {
		
		Date date = new Date(2022, 9, 20);
		
		System.out.println(date);
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String dateFormatee = formateur.format(date);
		
		System.out.println(dateFormatee);
		
		
		Date date2 = new Date(2016, 4, 19, 23, 59,30);
		System.out.println(date2);
		
		SimpleDateFormat formateur2 = new SimpleDateFormat("'Date du 'yyyy/MM/dd 'à' HH:mm:ss 'secondes'");
		String dateFormatee2 = formateur2.format(date2);
		
		System.out.println(dateFormatee2);
		
		Date date3 = new Date();
		SimpleDateFormat formateur3 = new SimpleDateFormat("'Date du 'yyyy/MM/dd 'à' HH:mm:ss 'secondes'");
		
		String dateFormatee3 = formateur3.format(date3);
		
		System.out.println(dateFormatee3);
	}

}
