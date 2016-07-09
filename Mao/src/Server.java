import java.io.*;
import java.net.*;

public class Server {
	
	static ServerSocket serverSocket;
	static Socket sSocket;
	static DataOutputStream out;

	public static void main(String[] args) throws Exception {
		serverSocket = new ServerSocket(7777); // Starts server
		sSocket = serverSocket.accept(); // Client accepts server through this
		out = new DataOutputStream(sSocket.getOutputStream());

	}

}
