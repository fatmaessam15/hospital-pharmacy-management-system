public class Account {
    //immutable on variable
    private String username;
    private String password ;
   
    
    private Account ( String  username ,   String password){
        this.username=username;
        this.password=password;
    }
   /* public static Account getInstance (final String username,final String password){
      return new Account (username,password);  
    }*/

    Account() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*Account() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
    public void setPass(String password ){
        this.password= password;
    }
    
    public String getName(){
        return username;
    }
    public String getPassword (){
        return password;
    }
}