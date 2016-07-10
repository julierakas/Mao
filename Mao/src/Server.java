import java.io.*;
import java.net.Socket;
import java.net.ServerSocket;
import java.util.Scanner; 

public class Server {
	
	static ServerSocket serverSocket;
	static Socket sSocket;
	static DataOutputStream out;

	public static void main(String[] args) throws Exception {
		System.out.println("Port Number: ");
		Scanner input = new Scanner(System.in);
		int portNum = input.nextInt(); // User specifies port # used
		// System.out.println("your port Number is: " + portNum);
		serverSocket = new ServerSocket(portNum); // Starts server
		sSocket = serverSocket.accept(); // Client accepts server through this
		out = new DataOutputStream(sSocket.getOutputStream());

	}

}
