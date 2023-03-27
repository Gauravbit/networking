package ntwkLab;
import java.net.*; 
import java.io.*; 
public class TcpServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket s=null;
		String line;
		BufferedReader is =null;
		BufferedReader is1=null;
		PrintStream os=null;
		Socket c=null;
		try { 
			s=new ServerSocket(10012); 
		}
		catch(IOException e) {
			System.out.println(e);
		}
		try {
			c=s.accept();
			is=new BufferedReader(new InputStreamReader(c.getInputStream()));
			is1=new BufferedReader(new InputStreamReader(System.in));
			os= new PrintStream(c.getOutputStream());
			do {
				line=is.readLine(); 
				System.out.println("Client:"+line); 
				System.out.println("Server:"); 
				line=is1.readLine(); 
				os.println(line);
			}while(line.equalsIgnoreCase("quit")==false); 
				is.close(); 
				os.close(); 
			
		}
		catch(IOException e) {
			System.out.println(e); 
		}

	} 

}  
