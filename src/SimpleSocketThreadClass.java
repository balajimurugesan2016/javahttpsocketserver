import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSocketThreadClass implements  Runnable {

	@Override
	public void run() {
		
		   while(true) {
	      try {
	            ServerSocket ss = new ServerSocket(6666);
	            Socket s = ss.accept();
	            DataInputStream dis = new DataInputStream(s.getInputStream());
	            String str = dis.readUTF();
	            System.out.println("message=" + str);
	            ss.close();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	      
		   }
		
	}

}
