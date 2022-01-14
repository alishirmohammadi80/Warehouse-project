
package warehouse.project;
import java.util.Scanner;
/**
 *
 * @author RASHA
 */
public class login {
    
 Scanner input= new Scanner(System.in); 
 public String User_Name;
public String Password;

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
 
public void enroll(){

        System.out.println("ثبت نام");
        System.out.println("لطفا یک نام کاربری انتخاب کنید");
      String user_name=input.next();
      setUser_Name(user_name);
        System.out.println("لطفا یک کلمه عبور انتخاب کنید");  
      String pssword=input.next();   
    setPassword(pssword);
    
    
    
}
   
public void log(){
     System.out.println("----------------------------------------------------"); 
        System.out.println("نام کاربری");
     String Get_username=input.next();
        System.out.println("کلمه عبور");
     String Get_password=input.next();
  
        boolean equals = Get_username.equalsIgnoreCase(User_Name);
        boolean equals1 = Get_password.equalsIgnoreCase(Password);
        if (equals==true &&equals1==true) {
            System.out.println("شما با موفقیت وارد شدید");  
        }
        else{
            System.out.println("نام کار بری یا کلمه عبور اشتباه است");

    
    
    
    
}
    
    
    
    
    
}}
    
    
    
    
    
    
    
    
