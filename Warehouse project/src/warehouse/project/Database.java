/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse.project;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author RASHA
 */
public class Database {
       private static String sql;
    public static void main(String[] args) throws SQLException {
        try {
            
             Class.forName("org.sqlite.JDBC");

Connection a = DriverManager.getConnection("jdbc:sqlite:Database.db"); 
  Statement statment=a.createStatement();
//   table User_Table
//     String sql="create table User_Table("
//                    + "user_name varchar(60),"
//                    + "Password varchar(60));";
//           statment.executeUpdate(sql);
//====================================
////teble Kala
// String sql2="CREATE TABLE Kala_Table("
//                    + "NAME varchar(60),"
//                    + "TADAD_KALA int,"
//                    + "CODE_KALA int);";
//        statment.executeUpdate(sql2);
//=========================================
Scanner input=new Scanner(System.in);
boolean run_Menu=true;
            do {                
                show_menu();
                int Result=input.nextInt();
                switch(Result){
                  case 1:
                      import_kala object=new import_kala();
object.import_kala_Menu();
String NAME=object.getName_kala();
int TADAD=object.getTadad_kala();
int CODE=object.getCode_kala();
String sql5="INSERT INTO Kala_Table(NAME,TADAD_KALA,CODE_KALA) VALUES('%s','%d','%d') ";
sql5=String.format(sql5, NAME,TADAD,CODE);
statment.execute(sql5);
break;
                 case 2:
                     
                 case 3:
                     String sql23 = "select * from  Kala_Table;";
            ResultSet rs = statment.executeQuery(sql23);
                     System.out.println("name"+"\t"+"tadad"+"\t"+"code");
            while (rs.next()) {
                
                String name_kala = rs.getString("NAME");
               int tadad_kala=rs.getInt("TADAD_KALA");
               int code_kala=rs.getInt("CODE_KALA");
                System.out.println(name_kala + "\t" + tadad_kala + "\t"+code_kala );
            }
            break;
                 case 4:
                  search Object=new search();
                  Object.search_for_kala_name();
                  String search_natige=Object.getKala_nam();
   String sql7="SELECT * FROM Kala_Table WHERE NAME='%s';";
                    sql7=String.format(sql7,search_natige);
            ResultSet rs1 = statment.executeQuery(sql7);
                     System.out.println("name"+"\t"+"tadad"+"\t"+"code");
            while (rs1.next()) {
                
                String name_kala = rs1.getString("NAME");
               int tadad_kala=rs1.getInt("TADAD_KALA");
               int code_kala=rs1.getInt("CODE_KALA");
                System.out.println(name_kala + "\t" + tadad_kala + "\t"+code_kala );

            }
                  
                    break;
                     
                case 5:
                    System.out.println("نام کالا را وارد کنید");
                    String Delete_name=input.next();
                    String sql6="DELETE FROM Kala_Table WHERE Name='%s';";
                    sql6=String.format(sql6,Delete_name);
                    statment.executeUpdate(sql6);
                    break;
                 case 6:
                  run_Menu=false;   
                    break;
                    
                }
                
                
            } while (run_Menu);












//            login object=new login();
//            object.enroll();
//            String user_name=object.getUser_Name();
//            String password =object.getPassword();
//String sql="INSERT INTO User_Table(user_name,Password) VALUES('%s','%s')";
//    sql=String.format(sql ,user_name,password);
//    statment.execute(sql); 

//-----------------------------------------------------------
//  String sql23 = "select * from  User_Table;";
//            ResultSet rs = statment.executeQuery(sql23);
//            while (rs.next()) {
//                String user_name = rs.getString("user_name");
//                String password = rs.getString("Password");
//               
//                System.out.println(user_name + "\t" + password + "\t" );
//            }

//------------------------------------------
//object.log();
//------------------------------
  
//import_kala object=new import_kala();
//object.import_kala_Menu();
//String NAME=object.getName_kala();
//int TADAD=object.getTadad_kala();
//int CODE=object.getCode_kala();
//String sql5="INSERT INTO Kala_Table(NAME,TADAD_KALA,CODE_KALA) VALUES('%s','%d','%d') ";
//sql5=String.format(sql5, NAME,TADAD,CODE);
//statment.execute(sql5);

//-----------------------------------------

//search object=new search();
// object.search_for_kala_name();
//String kala_name=object.getKala_nam();
//String sql4="SELECT * FROM Kala_Table";
//sql4=String.format(sql4,kala_name );
//statment.execute(sql4);
//            System.out.println();         

//--------------------------------------------------------









  
  
        } catch (Exception e) {
            System.out.println(e);
        }
        
      
        
        
        
        
        
        
        
        
    }
   
    public static void show_menu(){
      
       System.out.println("1)ثبت کالا");   
       System.out.println("2)خارج کردن کالا");
       System.out.println("3)نمایش کلا های موجود");
       System.out.println("4)جستوجوی کالا");
        System.out.println("5)حذف کالا");
       System.out.println("6)خروج از برنامه");
       System.out.print(":"+"لطفا یک گزینه را انتخاب کنید");
       
       
   }
    
    
    
}
