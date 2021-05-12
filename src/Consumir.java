import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Consumir {
	int presentes;
	double porcentajeasistencia;
	public Consumir() {
		this.presentes=0;
		this.porcentajeasistencia=0;
	}
	public void escribir(ArrayList<String> lista,String file) {
		PrintWriter writer=null;
		 int total=0;
		try {
			 writer = new PrintWriter(file);
			
			for(int i=0;i<lista.size();++i) {
				
				if(esalumno(lista.get(i)))
				++total;
				if(lista.get(i).contains("PRESENTE")) { 
					lista.set(i, lista.get(i).substring(0,lista.get(i).indexOf(":")));
					writer.println(lista.get(i));
				++this.presentes;
				
				}
			
			}
			this.porcentajeasistencia=(this.presentes*100/total);
			
			writer.println("NUNERO DE ASISTENTES: "+this.presentes);
			writer.println("Porcentaje de asistencia: "+this.porcentajeasistencia + "%"+ " "+this.presentes+ "/"+total);
			System.out.println(" Se ha generado la lista de alumnos presentes en el archivo: "+file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			if(writer != null)
	            writer.close();
			
		}

		
	}
	public boolean esalumno(String n) {
		for(int i=0;i<n.length();++i)
		if(n.charAt(0)>='A'&&n.charAt(0)<='Z')
			return true;
		return false;
	}


}
