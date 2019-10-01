package paquete;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ObjetoRemoto extends UnicastRemoteObject implements InterRemota {

	protected ObjetoRemoto() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public int mult(int a, int b) {
		System.out.println("multiplicando " + a + " * " + b + "...");
		return a * b;
	}// suma
}// ObjetoRemoto
