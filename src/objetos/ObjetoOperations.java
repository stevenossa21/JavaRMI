package objetos;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



public class ObjetoOperations extends UnicastRemoteObject implements InterOperations {

	public ObjetoOperations() throws RemoteException {
		super();
		
	}

	private static final long serialVersionUID = 1L;

	public int mult(int a, int b) {
		System.out.println("multiplicando " + a + " * " + b + "...");
		return a * b;
	}// multiplicacion
	
	public int sum(int a, int b) {
		System.out.println("sumando " + a + " + " + b + "...");
		return a + b;
	}// suma
	
	public int div(int a, int b) {
		System.out.println("dividiendo " + a + " / " + b + "...");
		if(b!=0) {
		return a / b;
		}else {
			System.out.println("Syntax error");
			return 0;
		}
	}// division
	
	public int rest(int a, int b) {
		System.out.println("restando " + a + "- " + b + "...");
		return a - b;
	}// resta

}// ObjetoRemoto
