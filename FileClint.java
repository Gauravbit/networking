package ntwkLab;
import java.net.*; 
import java.io.*; 
public class FileClint {

	public static void main(String[] args) throws IOException {
		int filesize=6022386; // filesize temporary hardcoded 
		long start = System.currentTimeMillis(); 
		int bytesRead; 
		int current = 0; 
		Socket sock = new Socket("LocalHost",58100); 
		System.out.println("Connecting..."); 
		byte [] mybytearray = new byte [filesize]; 
		InputStream is = sock.getInputStream(); 
		FileOutputStream fos = new FileOutputStream("C:\\lab4\\hilo.text"); 
		BufferedOutputStream bos = new BufferedOutputStream(fos); 
		bytesRead = is.read(mybytearray,0,mybytearray.length); 
		current = bytesRead; 
		do {
			bytesRead = is.read(mybytearray, current, (mybytearray.length-current)); 
			if(bytesRead >= 0) current += bytesRead; 
		} while(bytesRead > -1); 
		bos.write(mybytearray, 0 , current); 
		bos.flush(); 
		long end = System.currentTimeMillis(); 
		System.out.println(end-start); 
		bos.close(); 
		sock.close(); 
		
		
		

	}

}
