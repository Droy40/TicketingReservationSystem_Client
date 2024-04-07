/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticketingreservationsystem_client.Model;

import java.util.Date;
/**
 *
 * @author Lenovo
 */
public class User {
    private int id;
    private String fullname;
    private String username;    
    private String Email;
    private Date dob;
    private Date member_since;

    public User(int id, String fullname, String username ,String Email, Date dob, Date member_since) {
        this.id = id;
        this.fullname = fullname;
        this.username = username;        
        this.Email = Email;
        this.dob = dob;
        this.member_since = member_since;   
       
    }
    
    public User(){
        this.id = 0;
        this.fullname = "";
        this.username = "";        
        this.Email = "";
        this.dob = new Date();
        this.member_since = new Date();  
    }
    //login sukses response message = "LOGIN-SUKSES~UserID~Userfullname~Userusername~Useremail~Userdob(dd-mm-yyyy)~Usermembersince(dd-mm-yy)" 
    public User(String[] messagesFromServer){
        String dobString = messagesFromServer[5];
        String[] dobSplit = dobString.split("/");
        int dobDate = Integer.parseInt(dobSplit[0]);
        int dobMonth = Integer.parseInt(dobSplit[1]);
        int dobYear = Integer.parseInt(dobSplit[2]);                                
        Date birthdate = new Date(dobYear, dobMonth, dobDate);

        String memberSinceString = messagesFromServer[6];
        String[] memberSinceSplit = memberSinceString.split("/");
        int memberSinceDate = Integer.parseInt(memberSinceSplit[0]);
        int memberSinceMonth = Integer.parseInt(memberSinceSplit[1]);
        int memberSinceYear = Integer.parseInt(memberSinceSplit[2]);                                
        Date memberSince = new Date(memberSinceYear, memberSinceMonth, memberSinceDate);
        
        this.id = Integer.parseInt(messagesFromServer[1]);
        this.fullname = messagesFromServer[2];
        this.username = messagesFromServer[3];        
        this.Email = messagesFromServer[4];
        this.dob = birthdate;
        this.member_since = memberSince; 
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getMember_since() {
        return member_since;
    }

    public void setMember_since(Date member_since) {
        this.member_since = member_since;
    }
  
    @Override
    public String toString(){
        return "Fullname : " + this.getFullname() + 
               "\nUsername : " + this.getUsername() + 
               "\nEmail : " + this.getEmail() + 
               "\nDate of Birth : " + this.getDob() + 
               "\nMember Since : " + this.getMember_since() + 
               "\n";
    }

   

}
