/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketingreservationsystem_client.Model;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class SocketController {
    public Socket server;
    public BufferedReader in;
    public DataOutputStream out;
    
    public User userLogin;

    public SocketController(Socket server) {
        try {
            this.server = server;
            this.in = new BufferedReader(new InputStreamReader(server.getInputStream()));
            this.out = new DataOutputStream(server.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(SocketController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
    
    public void SendMessageToServer(String Message){
        try {
            if(Message.contains("\n")){
                out.writeBytes(Message);            
            }
            else{
                out.writeBytes(Message + "\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(SocketController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String[] ListeningFromServer() throws IOException{
        String messageFromServer = in.readLine();
        System.out.println(messageFromServer);
        String[] messages = messageFromServer.split("~");
        return messages;
    }
    
    //login request message = "LOGIN~username~password"
    //login sukses response message = "LOGIN-SUKSES~UserID~Userfullname~Userusername~Useremail~Userdob(dd-mm-yyyy)~Usermembersince(dd-mm-yy)" 
    //login gagal response message  = "LOGIN-GAGAL"
    public boolean UserLogin(String username, String password){
        try {
            String[] messagesToServer = { "LOGIN",username,password};            
            String messageToServer = String.join("~", messagesToServer);            
            SendMessageToServer(messageToServer);
            System.out.println("line55");
            String[] messagesFromServer = ListeningFromServer();
            if(messagesFromServer[0].equals("LOGIN-SUKSES")){
                userLogin = new User(messagesFromServer);
                return true;
            }
        } catch (IOException ex) {
            Logger.getLogger(SocketController.class.getName()).log(Level.SEVERE, null, ex);
        }     
        return false;
    }
    
    
    
    
}
