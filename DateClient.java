import java.net.*;
import java.io.*;
class DateClient{
	public static void main(String [] args) throws Exception{
		Socket sock = new Socket(InetAddress.getLocalHost(),1234);
		BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));
		System.out.println(in.readLine());
		}
}
