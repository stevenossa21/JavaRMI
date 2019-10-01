package paquete;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {
	
	public static void main(String[] args) throws RemoteException, NotBoundException {
		Registry r = LocateRegistry.getRegistry(10000);
		InterRemota objeto=(InterRemota)r.lookup("objetoremoto");
		System.out.println("La multiplicacion realizada en el servidor es: "+objeto.mult(10, 15));
		
	}

}
