package co.edu.unbosque.view;

import java.util.Scanner;

public class VistaConsola{

	private Scanner leer;

	public VistaConsola() {

		leer = new Scanner(System.in);
	}

	public void mostrarInformacion(Object object) {
		System.out.println(object);
	}

	public int leerDato(String mensaje) {
		mostrarInformacion(mensaje);
		int n = leer.nextInt();
		return n;
	}

	public Scanner getLeer() {
		return leer;
	}

	public void setLeer(Scanner leer) {
		this.leer = leer;
	}

}
