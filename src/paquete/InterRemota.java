package paquete;
import java.rmi.Remote;

public interface InterRemota extends Remote{

	public int mult(int a, int b) throws java.rmi.RemoteException; 

}//InterfaceRemota
