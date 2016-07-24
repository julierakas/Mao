import java.io.*;
import java.net.Socket;
import java.util.Scanner;
import java.net.*;
public class Client {
	
	static DataInputStream in;
	static Socket cSocket;

	public static void main(String[] args) throws Exception {
		System.out.println("Port Number: ");
		Scanner input = new Scanner(System.in);
		int portNum = input.nextInt();
		cSocket = new Socket("localhost", portNum);
		in = new DataInputStream(cSocket.getInputStream());

	}

}
