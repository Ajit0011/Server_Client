import java.net.*;
import java.io.*;
import java.util.*;
public class EchoServerSum{
		Date d = new Date();
	private ServerSocket Server;
		public EchoServerSum(int port){
			try{
			     
			     Server = new ServerSocket (port);
			   }
			catch(Exception ex){
			      System.out.println(ex);
			   }
		}
public void serve(){
	try{
		while(true){
		       Socket client = Server.accept();
			BufferedReader r = new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintWriter w = new PrintWriter(client.getOutputStream(),true);
		int a = Integer.parseInt(r.readLine());
		int b = Integer.parseInt(r.readLine());
		w.println("result: "+(a+b));	
		client.close();
          }
}
	catch(Exception ex1){
		System.out.println(ex1);
	  }
}



public static void main(String [] args){
	EchoServerSum s = new EchoServerSum(9999);
	s.serve();
}

}
