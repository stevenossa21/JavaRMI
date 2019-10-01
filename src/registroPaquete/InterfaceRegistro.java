package registroPaquete;

import java.rmi.Remote;

public interface InterfaceRegistro extends Remote {
	
	public String nombre(String name) throws java.rmi.RemoteException; 

}
