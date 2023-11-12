/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Date;
import java.util.logging.Logger;

public class M_Client {
    private int ID;
    private String Username, Password,Block,Status; 

    public M_Client() {
    }

    public M_Client(String Username, String Password, String Block, String Status) {
        this.Username = Username;
        this.Password = Password;
        this.Block = Block;
        this.Status = Status;
    }

    public M_Client(int ID, String Username, String Password, String Block, String Status) {
        this.ID = ID;
        this.Username = Username;
        this.Password = Password;
        this.Block = Block;
        this.Status = Status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getBlock() {
        return Block;
    }

    public void setBlock(String Block) {
        this.Block = Block;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    
   

    
}
