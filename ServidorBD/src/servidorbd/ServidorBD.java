package servidorbd;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import rmibd.RMIBD;
import rmibd.persona;
/**
 *
 * @author Carlos-Aqln
 */
public class ServidorBD extends UnicastRemoteObject implements RMIBD {

public ServidorBD() throws RemoteException{
    super();
}

public static void main (String [] args){
        try{
            
            Registry registro=LocateRegistry.createRegistry(4567);
            registro.rebind("rmi://localhost:6616/RMIBD",new ServidorBD());
            System.out.println("Servidor Activo");
            
        }catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }


/*@Override
public ArrayList<persona>mostrar() throws RemoteException{
    int cod;
    String nom,apll,dir;
    ArrayList<persona> lispersona=new ArrayList<>();
    try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo10", "root", "");
        String sentencia= "select * from persona";
        Statement stn=(Statement) cn.createStatement();
        ResultSet rs = stn.executeQuery(sentencia);
        while (rs.next()){
            cod=rs.getInt(1);
            nom=rs.getString(2);
            apll=rs.getString(3);
            dir=rs.getString(4);
            persona persona = new persona (cod, nom, apll, dir);
            lispersona.add(persona);
        }
        cn.close();
    }catch (Exception e) {
            System.out.println(e);
        }
    return lispersona;
}

@Override
public boolean Ingresar (int codigo, String nombre, String apellido, String direccion) throws RemoteException{
    boolean exito;
    exito=false;
    try{
        Class.forName("com.mysql.jdbc.Driver"); //carga el driver
        Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/ejemplo10", "root", "");
        String sentencia = "insert into persona(codigo,nombre,apellido,direccion) values (?,?,?,?)";
        PreparedStatement ps = cn.prepareStatement(sentencia);
        ps.setInt(1, codigo);
        ps.setString(2, nombre);
        ps.setString(3, apellido);
        ps.setString(4, direccion);
        ps.executeUpdate();
        exito=true;
        cn.close();
    }catch (Exception e){
        System.out.println(e);
    }
    return exito;
}





   public boolean agregar(int codigo, String nombre, String apellido, String direccion) throws RemoteException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    */

    @Override
    public ArrayList<persona> buscar_persona(int codigo) throws RemoteException {

           int cod;  
        String app,apm,nom;
        
        ArrayList<persona>lisempleado=new ArrayList<>();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
            String sentencia ="select * from prueba1 where codigo='"+codigo+"'";
            Statement stm =(Statement)cn.createStatement();
            ResultSet rs=stm.executeQuery(sentencia);
            while(rs.next()){
                cod=rs.getInt(1);
                app=rs.getString(2); 
                apm=rs.getString(3);
                nom=rs.getString(4); 
                persona oempleado=new persona(cod,app,apm,nom);     
                lisempleado.add(oempleado);
            }
            cn.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
          return lisempleado;  

    }

    @Override
    public ArrayList<persona> mostrar() throws RemoteException {
            
        int cod;
        String app,apm,nom;
        
        ArrayList<persona>lisempleado=new ArrayList<>();
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
            String sentencia = "select * from prueba1";
            Statement stm =(Statement)cn.createStatement();
            ResultSet rs=stm.executeQuery(sentencia);
           
            while(rs.next()){
                cod=rs.getInt(1);
                app=rs.getString(2); 
                apm=rs.getString(3);
                nom=rs.getString(4); 
                persona oempleado=new persona(cod,app,apm,nom);
                lisempleado.add(oempleado);
                System.out.println(lisempleado);
            }
            cn.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
          return lisempleado;  
    }

    @Override
    public boolean eliminar(int codigo) throws RemoteException {

            boolean exito;
            exito=false;
            
            try{
              Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
            String sentencia ="delete from prueba1 where codigo=?";
           PreparedStatement ps=cn.prepareStatement(sentencia);
            ps.setInt(1, codigo);
            ps.executeUpdate();
            exito=true;
            cn.close();
            }
            catch(Exception ex){
                System.out.println(ex);
            }
            return exito;
            
    }

    @Override
    public boolean modificar(int codigo, String nombre, String apellido, String direccion) throws RemoteException {

    boolean exito;
            exito=false;
            
            try{
              Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba","root","");
            String sentencia ="update prueba1 set nombre=?, apellido=?, direccion=? where codigo=?";
           PreparedStatement ps=cn.prepareStatement(sentencia);
            ps.setString(1, nombre);
             ps.setString(2, apellido);
            ps.setString(3, direccion);
            ps.setInt(4, codigo);

            ps.executeUpdate();
            exito=true;
            cn.close();
            }
            catch(Exception ex){
                System.out.println(ex);
            }
            return exito;
            
 
    }

    @Override
    public boolean Ingresar(int codigo, String nombre, String apellido, String direccion) throws RemoteException {
            boolean exito;
               exito=false;
               try{
                   Class.forName("com.mysql.jdbc.Driver"); //carga el driver
                   Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "root", "");
                   String sentencia = "insert into prueba1(codigo,nombre,apellido,direccion) values (?,?,?,?)";
                   PreparedStatement ps = cn.prepareStatement(sentencia);
                   ps.setInt(1, codigo);
                   ps.setString(2, nombre);
                   ps.setString(3, apellido);
                   ps.setString(4, direccion);
                   ps.executeUpdate();
                   exito=true;
                   cn.close();
               }catch (Exception e){
                   System.out.println(e);
               }
               return exito;  
    }
}
  
