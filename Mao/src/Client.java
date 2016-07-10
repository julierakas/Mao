import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	static DataInputStream in;
	static Socket cSocket;

	public static void main(String[] args) throws Exception {
		int portNum = Integer.parseInt(args[0]);
		if (args.length > 1) {
			portNum = 7777;
		}
		cSocket = new Socket("localhost", portNum);
		in = new DataInputStream(cSocket.getInputStream());

	}

}
