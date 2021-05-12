import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Producir {
	public ArrayList<String> lista;
	
	public Producir() {
		this.lista =new ArrayList<String>();
		
	}
	public void leer(String entrada) throws IOException {
		String cadena=new String("");
		BufferedReader b = null;
		 try {
			 b = new BufferedReader(new FileReader(entrada));
			String texto = b.readLine();
	         //Repetir mientras no se llegue al final del fichero
	         while(texto != null) {
	        	
	        this.lista.add(texto.toUpperCase());
	             //Leer la siguiente línea
	             texto = b.readLine();
	             
	        	 }
	         System.out.println(" el archivo "+ entrada +" ha sido leido");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(b != null)
	            b.close();
			
		}
		 }


	public ArrayList<String> getlista(){
		return this.lista;
	}
	 
}
