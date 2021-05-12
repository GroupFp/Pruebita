import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String entrada = "C:\\Users\\efe\\eclipse-workspace\\Asistencia\\prueba.sbv";
		String cadena;
		Producir productor=new Producir();
		productor.leer(entrada);
		Consumir consumir=new Consumir();
		
         consumir.escribir(productor.getlista(),"C:\\Users\\efe\\eclipse-workspace\\Asistencia\\reporte.csv");
		 
	}

}
