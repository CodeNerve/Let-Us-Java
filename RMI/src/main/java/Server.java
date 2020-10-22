
import java.rmi.Naming;
public class Server{
	public static void main(String[] argv){
		try
		{
			Naming.rebind("Hello", new HelloImpl ("Hello, this is a java RMI program"));
			System.out.println("server is connected");
		}
		catch(Exception e)
		{
			System.out.println("server is not connected"+e);
		}
	}
}
