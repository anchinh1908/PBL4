/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author ASUS
 */
public class clienttest implements Runnable{
    public Socket socket;
    DataOutputStream output;
    DataInputStream input;

    public clienttest() {
         try {
            socket = new Socket("localhost", 1234);
        } catch (Exception e) {
             System.out.println(e);  
        }
    }
    
    public static void main(String[] args)  {
       new clienttest();
    }

    @Override
    public void run() {
             try {
            input = new DataInputStream(socket.getInputStream());
            while (true){
                if(socket != null){
                    System.out.println("Server thong bao:" + input.readUTF());  
                }
            }
                   
        } catch (Exception e) {
                 System.out.println(e);
        }
    }
}
