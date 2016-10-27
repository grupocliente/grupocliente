package rmibd;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface RMIBD  extends Remote{
    
 public ArrayList<persona>buscar_persona(int codigo)throws RemoteException;   
 public ArrayList<persona> mostrar() throws RemoteException;
  public boolean eliminar (int codigo) throws RemoteException;
 public boolean modificar (int codigo, String nombre, String apellido, String direccion) throws RemoteException;
 public boolean Ingresar (int codigo, String nombre, String apellido, String direccion) throws RemoteException; 
}
