import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(2003);
            System.out.println("Server is listening on port 2003");
            
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");
                
                // Create a new thread for each client
                ClientHandler clientHandler = new ClientHandler(socket);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class ClientHandler implements Runnable {
    private Socket socket;
    private BufferedReader reader;
    private BufferedWriter writer;

    public ClientHandler(Socket socket) {
        this.socket = socket;
        try {
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        String msg;
        try {
            while ((msg = reader.readLine()) != null) {
                System.out.println("Received: " + msg);
                // You can add code to broadcast messages to other clients here
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
