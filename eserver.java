//server
package ntwkLab;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
public class eserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket s=null;
		Socket c;
		String line;
		BufferedReader br;
		PrintStream ps;
		try {
			s=new ServerSocket(808);
			
		
		}catch(IOException e) {
			System.out.println(e);
		}
		try {
			c=s.accept();
			br=new BufferedReader(new InputStreamReader(c.getInputStream()));
			ps=new PrintStream(c.getOutputStream());
			while(true) {
				line=br.readLine();
				System.out.println("Message recieve and sent back to client");
				ps.println(line);
				
			}
		}catch(IOException e) {
			System.out.println(e);
		}

	}   

}
