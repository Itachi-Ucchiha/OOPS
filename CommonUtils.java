package salarySlip;

import java.util.ResourceBundle;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class CommonUtils{
	
	ResourceBundle rb = ResourceBundle.getBundle("constants");
	Locale locale = new Locale(rb.getString("localeFormat"),rb.getString("localeCountry"));	// taking values from file
//	instead of hard coded input
//	idk why I was stuck here for 1 hour and it runs at the end unexpectedly
//	Error - Exception in thread "main" java.util.MissingResourceException: Can't find bundle for base name
	
	
//	formatting name-------------------------------------
	public String getProperName(String name) {
		String names[] = name.split(" ");
		String fullName = "";
		for(String x : names) {
			fullName+=String.valueOf(x.charAt(0)).toUpperCase()+x.substring(1).toLowerCase()+" ";
		}
		return fullName;
	}
	
	
	
//	formatting salary ------------------------------
	public String formatSalary(double salary) {
//		Locale locale = new Locale("hi","IN");	
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale); // no new object is made 
		String formatsal = nf.format(salary);
		return formatsal;
	}
	
	
//	formatting the date
	public String formatDate() {
		
//		Locale locale = new Locale("hi","IN");	
//		did this because it's easy for client to edit the settings
		
		Date date = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT, locale);	// no new object is made
		String formatdate = df.format(date);
		return formatdate;
		
		
	}
}
	