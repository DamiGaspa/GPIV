package ar.edu.unrn.seminario.resources;

import java.util.ResourceBundle;
import java.util.Locale;

public class LanguageHandler {
	private static ResourceBundle idioma;
	
	public static void setLanguage(String nombre_idioma) {
		if(nombre_idioma.equals("Español")) {
			idioma = ResourceBundle.getBundle("labels", new Locale("es")); 
		}
		else if(nombre_idioma.equals("English")) {
			idioma = ResourceBundle.getBundle("labels", new Locale("en")); 
		}
		else {
			idioma = ResourceBundle.getBundle("labels", new Locale("it")); 
		}
	}
	
	public static ResourceBundle getLanguage() {
		return idioma;
	}
}
