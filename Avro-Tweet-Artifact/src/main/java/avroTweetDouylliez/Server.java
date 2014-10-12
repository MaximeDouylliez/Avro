package avroTweetDouylliez;

import java.io.IOException;
import java.net.InetSocketAddress;
/*
import org.apache.avro.ipc.SocketServer;
import org.apache.avro.ipc.SocketTransceiver;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.apache.avro.ipc.specific.SpecificResponder;
import org.apache.avro.util.Utf8;
import org.apache.avro.ipc.NettyServer;
import org.apache.avro.ipc.NettyTransceiver;
import org.apache.avro.ipc.Server;
import org.apache.avro.ipc.specific.SpecificRequestor;
import org.apache.avro.ipc.specific.SpecificResponder;
import org.apache.avro.util.Utf8;*/
import java.io.*;
import java.net.*;

import java.io.IOException;
import java.net.InetSocketAddress;

public class Server 
{
	   public static void main(String argv[]) throws Exception
	      {
	         String clientSentence;
	         String capitalizedSentence;
	         ServerSocket welcomeSocket = new ServerSocket(5005);

	         while(true)
	         {
	            Socket client = welcomeSocket.accept();
	            BufferedReader inFromClient =
	               new BufferedReader(new InputStreamReader(client.getInputStream()));
	           
	            PrintWriter out = new PrintWriter(client.getOutputStream(),true);
	            clientSentence = inFromClient.readLine();
	            System.out.println("Received: " + clientSentence);
	            capitalizedSentence = clientSentence.toUpperCase() + '\n';
	           out.println(capitalizedSentence);
	           
	         }
	      }
	} 
       

