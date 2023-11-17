
package ConnectSocket;

import java.net.Socket;


public class Clients {
    Socket socket;
    String username;
    boolean isLogin;

    public Clients(Socket socket, String username) {
        this.socket = socket;
        this.username = username;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
     public boolean isLogin() {
        return isLogin;
    }
    
}
