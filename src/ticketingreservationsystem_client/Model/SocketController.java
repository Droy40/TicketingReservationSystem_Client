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
import java.util.ArrayList;
import java.util.Date;
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
    
    public boolean UserRegister(String fullname, String username, String email, Date dob, String password){
        try {
            String[] messagesToServer = {"REGISTER",fullname,username,email,dob.getDate() + "/" + dob.getMonth() + "/" + dob.getYear(),password};
            String messageToServer = String.join("~", messagesToServer);
            SendMessageToServer(messageToServer);
            String[] messagesFromServer = ListeningFromServer();
            if(messagesFromServer[0].equals("REGISTER-SUKSES")){
                return true;
            } 
        } catch (Exception e) {
            Logger.getLogger(SocketController.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
    
    //Request tiket pesawat : "CARI-TIKET-PESAWAT~DATE/MONTH/YEAR~FROM~TO~ADULT~CHILDREN~INFANT~SEATCLASS"
    // RESPONSE JIKA TIKET DITEMUKAN : "TIKET-PESAWAT-DITEMUKAN~TIKET1(FLIGHTNUMBER,DATE/MONTH/YEAR,FROM,TO,SEATCLASS,AIRLINE,PRICE)~TIKET2~TIKET SETERUSNYA"
    // RESPONSE JIKA TIKET TIDAK DITEMUKAN : "TIKET-PESAWAT-TIDAK-DITEMUKAN""
    public ArrayList<String> CariTiketPesawat(Date departureDate, String from, String to, int adult, int children, int infant, String seatClass){
        try {
            String[] messagesToServer = {"CARI-TIKET-PESAWAT", departureDate.getDate() + "/" + departureDate.getMonth() + "/" + departureDate.getYear(),from,to,String.valueOf(adult),String.valueOf(children), String.valueOf(infant), seatClass};
            String mesageToServer = String.join("~", messagesToServer);
            SendMessageToServer(mesageToServer);
            String[] messagesFromServer = ListeningFromServer();
            if(messagesFromServer[0].equals("TIKET-PESAWAT-DITEMUKAN")){
                ArrayList<String> tikets = new ArrayList<>();
                for (int i = 1; i < messagesFromServer.length; i++) {
                    tikets.add(messagesFromServer[i]);
                }
                return tikets;
            }
        } catch (IOException ex) {
            Logger.getLogger(SocketController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<String> CariTiketKapal(Date departureDate, String from, String to, int adult, int children, int infant, String seatClass){
        try {
            String[] messagesToServer = {"CARI-TIKET-KAPAL", departureDate.getDate() + "/" + departureDate.getMonth() + "/" + departureDate.getYear(),from,to,String.valueOf(adult),String.valueOf(children), String.valueOf(infant), seatClass};
            String mesageToServer = String.join("~", messagesToServer);
            SendMessageToServer(mesageToServer);
            String[] messagesFromServer = ListeningFromServer();
            if(messagesFromServer[0].equals("TIKET-DITEMUKAN")){
                ArrayList<String> tikets = new ArrayList<>();
                for (int i = 1; i < messagesFromServer.length; i++) {
                    tikets.add(messagesFromServer[i]);
                }
                return tikets;
            }
        } catch (IOException ex) {
            Logger.getLogger(SocketController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<String> CariTiketKereta(Date departureDate, String from, String to, int adult, int children, int infant, String seatClass){
        try {
            String[] messagesToServer = {"CARI-TIKET-KERETA", departureDate.getDate() + "/" + departureDate.getMonth() + "/" + departureDate.getYear(),from,to,String.valueOf(adult),String.valueOf(children), String.valueOf(infant), seatClass};
            String mesageToServer = String.join("~", messagesToServer);
            SendMessageToServer(mesageToServer);
            String[] messagesFromServer = ListeningFromServer();
            if(messagesFromServer[0].equals("TIKET-DITEMUKAN")){
                ArrayList<String> tikets = new ArrayList<>();
                for (int i = 1; i < messagesFromServer.length; i++) {
                    tikets.add(messagesFromServer[i]);
                }
                return tikets;
            }
        } catch (IOException ex) {
            Logger.getLogger(SocketController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public ArrayList<String> CariSewaMobil(Date rentStart, Date rendEnd, String location, String seatClass, boolean is_withDriver){
        try {
            String[] messagesToServer = {"CARI-SEWA-MOBIL", rentStart.getDate() + "/" + rentStart.getMonth() + "/" + rentStart.getYear(),rendEnd.getDate() + "/" + rendEnd.getMonth() + "/" + rendEnd.getYear(),location,seatClass,String.valueOf(is_withDriver)};
            String mesageToServer = String.join("~", messagesToServer);
            SendMessageToServer(mesageToServer);
            String[] messagesFromServer = ListeningFromServer();
            if(messagesFromServer[0].equals("SEWA-MOBIL-DITEMUKAN")){
                ArrayList<String> tikets = new ArrayList<>();
                for (int i = 1; i < messagesFromServer.length; i++) {
                    tikets.add(messagesFromServer[i]);
                }
                return tikets;
            }
        } catch (IOException ex) {
            Logger.getLogger(SocketController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    
    
}
