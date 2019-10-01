package objetos;
import java.rmi.Remote;

public interface InterOperations extends Remote{

	public int sum(int a, int b) throws java.rmi.RemoteException; 
	public int mult(int a, int b) throws java.rmi.RemoteException;

}//InterfaceRemota
