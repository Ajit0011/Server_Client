import java.net.*;
import java.io.*;
import java.util.*;
public class UpperEchoServer{
		Date d = new Date();
	private ServerSocket Server;
		public UpperEchoServer(int port){
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
			w.println("Hello! Type 'exit' to close");
			String line;
		do{
			line = r.readLine();
			if(line!=null){
				w.println("Got: "+line.toUpperCase());
				System.out.println(line.toUpperCase()+" Date and Time: "+d );
				
			}
		  }while(!line.toLowerCase().trim().equals("exit"));
		client.close();
		Server.close();
          }
}
	catch(Exception ex1){
		System.out.println(ex1);
	  }
}



public static void main(String [] args){
	UpperEchoServer s = new UpperEchoServer(9999);
	s.serve();
}

}
