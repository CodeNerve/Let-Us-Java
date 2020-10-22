
import java.rmi.Naming;
public class Client{
	public static void main(String[] argv)
	{
		try
		{
			HelloInt hello=(HelloInt)Naming.lookup("//127.0.0.1/Hello");
			System.out.println(hello.say());
		}
		catch(Exception e)
		{
			System.out.println("HelloClient exception:" +e);
		}
		
	}
}
