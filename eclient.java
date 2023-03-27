//clientt
package ntwkLab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class eclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket c=null;
		String line;
		BufferedReader br,br1;
		PrintStream os;
		try {
			c=new Socket("localhost",808);
		}catch(IOException e) {
			System.out.println(e);
		}
		try {
			os=new PrintStream(c.getOutputStream());
			br=new BufferedReader(new InputStreamReader(System.in));
			br1=new BufferedReader(new InputStreamReader(c.getInputStream()));
			do {
				System.out.println("Client message :");
				line=br.readLine();
				os.println(line);
				if(!line.equals("Exit successful")) {
					System.out.println("Server reply:"+br1.readLine());
				}
			
			}while(!line.equals("exit"));
					
		
		}catch(IOException e) {
			System.out.println("Socket close successfully");
		}

	} 
 
}
