
import java.sql.SQLException;
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
public class vendor extends User {
 private String CompanyName;
 private String CompanyEmail;
 private  int  Company_no;
 User V_user= new User();
 //Account A=new Account ();
 private String passoword;
 private static final DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

 
 public vendor(){}
  public vendor(String CompanyName,String CompanyEmail,int  Company_no){
      this.CompanyName=CompanyName;
      this.CompanyEmail=CompanyEmail;
      this.Company_no=Company_no;
  
  }
 private String getCompanyName(){
      return CompanyName;
  }
  private void setCompanyName(String CompanyName){
      this.CompanyName=CompanyName;
  }
  private String getCompanyEmail(){
      
      return CompanyEmail;
  }
  private void setCompanyEmail(String CompanyEmail){
      this.CompanyEmail= CompanyEmail;
      
  }
  private int getCompany_no(){
      return Company_no;
  }
  private void setCompany_no(int Company_no){
      this.Company_no= Company_no;
  }
  
//functions
  
  
 /* public boolean Register(){
      boolean found =true;

 //register:check passowrd, check email, email found -> accept ,create vendor then save vendor
  if (CompanyEmail!=null ) {      
 
       return found;
   }
       
   if (V_user.use_x.getPassword()!=null){
       
        //create_new_vendor ();
        
   
   }
   //save venor();
  
  }*/
  
  
  public void Registre (String CompanyEmail ,String password )throws SQLException{
               db D=new db();
               
this.CompanyEmail=CompanyEmail;
this.passoword=passoword;

try {
      String RegistertTableSQL = "INSERT INTO `vendor`(CompantEmail,CompanyName,Company_no,Name,age,Email,phone,type,id) +VALUES  (CompantEmail,CompanyName,Company_no,Name,age,Email,phone,type,id)"
               + "to_date('"
				+ getCurrentTimeStamp() + "', 'yyyy/mm/dd hh24:mi:ss'))";
      
      
      		// execute insert SQL stetement
	    D.rs=D.st.executeQuery(RegistertTableSQL);
            
            System.out.println("Record is inserted into OFFER table!");
   
            /*while(D.rs.next()){
               CompanyEmail=D.rs.getString("CompanyEmail");
               passoword=D.rs.getString(" passoword");
               CompanyName=D.rs.getString("  CompanyName");
               Company_no=D.rs.getInt("company_no");
               name =D.rs.getString("Name");
               E_mail=D.rs.getString("Email");
               phone=D.rs.getString("phone");
               type=D.rs.getInt("type");
               ID=D.rs.getInt("id");
               
               
               
               
               //Display values 
                 System.out.print("CompanyEmail: " +CompanyEmail );
                 System.out.print("passoword: " +passoword );
                 System.out.print("CompanyName: " +CompanyName );
                  System.out.print("Company_no: " +Company_no );
                  System.out.print("  Name: " +  name );
                 System.out.print(" Email : " +  E_mail );
                  System.out.print(" phone : " +  phone );
                  System.out.print("  type: " +  type );
                   System.out.print(" id: " +  ID);
                      }
             */   }
                catch(Exception ex)
        {
            System.out.print("yarabbiii");
        }

	}
  
                  
                    
                   
                   
                 
              public static String getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return dateFormat.format(today.getTime());

	}
        
 
    
                 
               
            }


      
   
   
    

