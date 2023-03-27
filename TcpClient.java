package ntwkLab;                                                              
import java.net.*; 
import java.io.*; 

public class TcpClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Socket c=null; 
		String line; 
		BufferedReader is;
		BufferedReader is1; 
		PrintStream os; 
		try {
			c=new Socket("localhost",10012); 
		}
		catch(IOException e) {
			System.out.println(e); 
		}
		try {
			os=new PrintStream(c.getOutputStream()); 
			is=new BufferedReader(new InputStreamReader(System.in)); 
			is1=new BufferedReader(new InputStreamReader(c.getInputStream())); 
			do {
				System.out.println("Client:"); 
				line=is.readLine(); 
				os.println(line); 
				System.out.println("Server:" + is1.readLine()); 
			}while(line.equalsIgnoreCase("quit")==false); 
				is1.close(); 
				os.close(); 
		}
		catch(IOException e) {
			System.out.println("Socket Closed!Message Passing is over"); 
		}

	} 
 
}                                                          
