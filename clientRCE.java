package ntwkLab;
import java.io.*;
import java.net.*;

public class clientRCE {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			String str;
			Socket client=new Socket("Localhost",6555);
			PrintStream ps=new PrintStream(client.getOutputStream());
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("\t\t\t\tClient Window\n\n\n\tEnter The Command:-");
			str=br.readLine();
			ps.println(str);
			
		}
		catch(IOException e) {
			System.out.println("Error "+e);
			
			
		}
		

	}

}
