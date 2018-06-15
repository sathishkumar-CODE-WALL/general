package com.tryout.randomstuff;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
//A Java program for a Server
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMacSocket
{
 //initialize socket and input stream
 private Socket          socket   = null;
 private ServerSocket    server   = null;
 private DataInputStream in       =  null;

 // constructor with port
 public ServerMacSocket(int port)
 {
     // starts server and waits for a connection
     try
     {
         server = new ServerSocket(port);
         System.out.println("Server started");

         System.out.println("Waiting for a client ...");

         socket = server.accept();
         System.out.println("Client accepted");

         // takes input from the client socket
         in = new DataInputStream(
             new BufferedInputStream(socket.getInputStream()));

         String line = "";

         // reads message from client until "Over" is sent
         while (!line.equals("Over"))
         {
             try
             {
                 line = in.readUTF();
                 System.out.println(line);

             }
             catch(IOException i)
             {
                 System.out.println(i);
             }
         }
         System.out.println("Closing connection");

         // close connection
         socket.close();
         in.close();
     }
     catch(IOException i)
     {
         System.out.println(i);
     }
 }

 public static void main(String args[])
 {
	 ServerMacSocket server = new ServerMacSocket(5000);
 }
}