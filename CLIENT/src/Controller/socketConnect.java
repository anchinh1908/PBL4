
package Controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JOptionPane;


public class socketConnect {

    Socket socket;
    DataOutputStream output;
    DataInputStream input;
    
    public void connectSocket(int port){
        try{
           socket=new Socket("localhost",port);
            JOptionPane.showMessageDialog(null,"Ket noi thanh cong");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
