import java.net.*;
public class Cnet
{
  public static void main(String [] args)
	{
	 try{
	      String hostname = InetAddress.getLocalHost().getHostName();
		System.out.println(hostname);
		}
		catch(Exception ex)
		{
		 System.out.println(ex);
		}
  }
}
