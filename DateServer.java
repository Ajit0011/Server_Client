import java.net.*;
import java.io.*;
import java.util.*;
class DateServer{
	public static void main(String [] args)
		throws Exception{
			ServerSocket serversocket = new ServerSocket(1234);
			while(true){
				System.out.println("Waiting for connection....");
				Socket sock = serversocket.accept();
				DataOutputStream out = new DataOutputStream(sock.getOutputStream());
				out.writeBytes("Server Date: " + (new Date()).toString()+" \n");
				out.close();
				sock.close();
			}
		}
}
