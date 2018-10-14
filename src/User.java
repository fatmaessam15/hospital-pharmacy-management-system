
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W-8.1
 */

public class User {
   Account use_x=new Account (); //obj mn immutable class accnt
   public String name ;
    public String E_mail;
    public String phone;
    public int age ;
    public int ID;
    public int type ;
    
    
    public User (){    
    }
    public User (String name,String E_mail,String phone ,int age,int ID,int type){
        this.E_mail=E_mail;
        this.ID=ID;
        this.age=age;
        this.name=name;
        this.phone=phone;
        this.type=type;
    }
    private String getName(){
        return name;
    }
    private void setName(String name){
        this.name=name;
    }
    private String getEmail(){
        return E_mail;
    }
    private void setEmail(String E_mail){
        this.E_mail=E_mail;
    }
    private String getPhone(){
        return phone;
    }
    private void setPhone(String phone){
        this.phone=phone;
    }
     private int getID(){
        return ID;
    }
      private void setID(int ID){
        this.ID=ID;
    }
      
   private int getAge(){
        return age;
    }
    private void setAGE(int age){
        this.age=age;
    }
 private int getType(){
        return type;
    }
  private void setType(int type){
        this.type=type;
    }
  
    @Override
  public String toString (){
     return getClass().getName()+",name:"+name+",age:"+age+",E_mail:"+E_mail+",ID:"+ID+",phone:"+phone+",type:"+type;
  }
  
  
  /*private boolean LogIn (String Email , String password ){
       boolean acceptedEm= E_mail.equals(E_mail);
       boolean acceptedPass=password.equals(password );
       boolean accepted = true;
       
    if (E_mail!=null && use_x.getPassword()!=null){
        if (acceptedEm &&  acceptedPass){
          //  return true;
          
        return accepted ;
       
        }}
       return false;
    
}*/
  private boolean login(String Email , String password )throws  SQLException{
     int id =this.ID; 
    db d=new db();
    
    boolean login = false;

      
   
    String log_query = "SELECT (id) FROM 'user' WHERE (Email = ? AND Password = ?)";
      d.rs=d.st.executeQuery(log_query);
      System.out.println("loged!");
      while(d.rs.next()){
      id = d.rs.getInt(ID);   
      System.out.print("ID: " + id);

      }
      
      
     /*   D.setString(1, Email);
        D.setString(2, password);
        
            ResultSet res = D.executeQuery();
        
        String checkUserEm = res.getString(1);
        String checkPass = res.getString(2);
     
        
         if((checkUserEm.equals(Email)) && (checkPass.equals(password)))
        {
            login = true;
        }
        else
        {
            login = false;
        }
  }*/
     
     return true;
  }}
  
  
    
      
 
     
    
   
        

  
  

