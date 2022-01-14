/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warehouse.project;
import java.util.Scanner;
/**
 *
 * @author RASHA
 */
public class search {
    Scanner input=new Scanner(System.in);
   String kala_nam;
   int code_kala;

    public String getKala_nam() {
        return kala_nam;
    }

    public void setKala_nam(String kala_nam) {
        this.kala_nam = kala_nam;
    }

    public int getCode_kala() {
        return code_kala;
    }

    public void setCode_kala(int code_kala) {
        this.code_kala = code_kala;
    }
   
   
    public void search_for_kala_name(){
        
        System.out.println("نام کالای را وارد کنید"); 
        String namekala=input.next();
        setKala_nam(namekala);
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
}
