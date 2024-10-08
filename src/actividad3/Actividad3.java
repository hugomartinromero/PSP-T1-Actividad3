package actividad3;

import java.io.IOException;

public class Actividad3 {

	public static void main(String[] args) throws InterruptedException {
		
		ProcessBuilder pb = new ProcessBuilder("bash", "programa.sh");
		
		try {
			Process p = pb.start();
			
			boolean fin = false;
			
			while (!fin) {
				if (p.isAlive()) {
					System.out.println("Ejecutando programa...");
					Thread.sleep(3000);
				} else {
					fin = true;
				}
			}
			
			p.destroy();
			
		} catch (IOException e) {
			System.err.println("ERROR: de Entrada/Salida al ejecutar el comando.");
			e.printStackTrace();
		}
	}
}
