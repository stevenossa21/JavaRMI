package registroPaquete;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import paquete.InterRemota;

public class ClienteRegistro {
	
	
	
	private static Scanner teclado;

	public static void main(String[] args) throws RemoteException, NotBoundException {
		teclado = new Scanner(System.in);
		
		Registry r = LocateRegistry.getRegistry(10000);
		InterfaceRegistro objeto=(InterfaceRegistro)r.lookup("registro");
		
		System.out.print("Ingresa tu nombre: ");
		String nombre = teclado.nextLine();
		
		System.out.println(objeto.nombre(nombre));
		
	}

}
