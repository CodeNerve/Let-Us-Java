
import java.rmi.*;
   import java.rmi.server.*;
   public class HelloImpl extends UnicastRemoteObject implements HelloInt
  {
    private String message;
    public HelloImpl(String msg) throws RemoteException
   {
    message= msg;
   }
   public String say() throws RemoteException
  {
   return message;
   }
   }

