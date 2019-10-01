package paquete;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import objetos.ObjetoOperations;

import java.lang.Package;

public class Servidor {
	public static void main(String[] args) throws RemoteException {
    ObjetoRemoto or = new ObjetoRemoto();
    ObjetoOperations o = new ObjetoOperations();
    Registry r = LocateRegistry.createRegistry(10000);
    //Registry r1 = LocateRegistry.createRegistry(9000);
    r.rebind("objetoremoto", or);
    r.rebind("operaciones", o);
    System.out.println("Objeto publicado");
	}
}
