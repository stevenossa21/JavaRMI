package objetos;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import paquete.InterRemota;

public class ClienteOperations {

	public static void main(String[] args) throws RemoteException, NotBoundException {
		Registry r = LocateRegistry.getRegistry(10000);
		InterOperations objeto = (InterOperations) r.lookup("operaciones");
		System.out.println("La suma realizada en el servidor es: " + objeto.sum(5, 520));
		System.out.println("La multiplicacion realizada en el servidor es: " + objeto.mult(5, 8));
		System.out.println("La division realizada en el servidor es: " + objeto.div(50, 2));
		System.out.println("La resta realizada en el servidor es: " + objeto.rest(50, 2));
		

	}
}
