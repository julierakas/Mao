import java.io.*;
import java.net.*;

public class Client {
	
	static DataInputStream in;
	static Socket cSocket;

	public static void main(String[] args) throws Exception {
		cSocket = new Socket("localhost", 7777);
		in = new DataInputStream(cSocket.getInputStream());

	}

}
