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
		serverSocket = new ServerSocket(portNum); // Starts server
		serverSocket.runServer(portNum);
	}
		
	public void runServer(int portNum) throws Exception {
		try {
			while (true) {
			sSocket = serverSocket.accept(); // Client accepts server through this
			out = new DataOutputStream(sSocket.getOutputStream());
			}
		}
	}
	
	public void closeServer() {
	
	}
		
			

	}

}
