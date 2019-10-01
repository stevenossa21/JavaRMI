package registroPaquete;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import objetos.InterOperations;

public class ObjetoRegistro extends UnicastRemoteObject implements InterfaceRegistro {

	public ObjetoRegistro() throws RemoteException {
		super();

	}

	private static final long serialVersionUID = 1L;

	public String nombre(String name) {

		String M;

		M = name.toUpperCase();

		int n = M.length();

		return "Hola " + M + ", tu nombre tiene " + n + " caracteres";

	}

}
