package no.hvl.dat100.oppgave4;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		 String filsti = mappe + File.separator + filnavn;
	     String innhold = samling.toString();

	       
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filsti))) {	            
	            writer.write(innhold);
	            return true; 
	        } catch (IOException e) {
	            System.out.println("Feil under skriving til fil: " + e.getMessage());
	            return false; 
	        }
	}
} 

