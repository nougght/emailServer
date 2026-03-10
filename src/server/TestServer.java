package server;

import java.net.*;
import java.io.*;


public class TestServer {
    private ServerSocket ssock = null;
    private Socket sock = null;
    private DataInputStream in = null;

    public TestServer(int port)
    {
        try
        {
            ssock = new ServerSocket(port);

            while (true)
            {
                System.out.println("Waiting...");
                sock = ssock.accept();
                System.out.print("New Connection: ");
                System.out.println(sock.getInetAddress());
                in = new DataInputStream(new BufferedInputStream(sock.getInputStream()));

                String message = "";
                while (!message.equals("END"))
                {
                    message = in.readUTF();
                    System.out.println(message);
                }
                
                sock.close();
            }
            
        }
        catch(IOException i)
        {
            System.out.println(i);
        }
    }
}
