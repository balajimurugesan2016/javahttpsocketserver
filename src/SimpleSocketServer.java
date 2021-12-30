import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleSocketServer {

    public static void main(String[] args) {
    	
    	ExecutorService es = Executors.newFixedThreadPool(10);
    	SimpleSocketThreadClass sstc = new SimpleSocketThreadClass();
    	es.submit(sstc);
    	
  

    }

}
