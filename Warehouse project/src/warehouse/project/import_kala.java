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
public class import_kala {
   Scanner input=new Scanner(System.in);
     public String Name_kala;
  public int Code_kala;
  public int Tadad_kala;

    public String getName_kala() {
        return Name_kala;
    }

    public void setName_kala(String Name_kala) {
        this.Name_kala = Name_kala;
    }

    public int getCode_kala() {
        return Code_kala;
    }

    public void setCode_kala(int Code_kala) {
        this.Code_kala = Code_kala;
    }

    public int getTadad_kala() {
        return Tadad_kala;
    }

    public void setTadad_kala(int Tadad_kala) {
        this.Tadad_kala = Tadad_kala;
    } 
    
    public void import_kala_Menu(){
        
        System.out.println("نام کالا را وارد کنید");   
        String name_kala=input.next();
        setName_kala(name_kala);
        System.out.println("تعداد کالا را وارد کنید");
        int tadad_kala=input.nextInt();
        setTadad_kala(tadad_kala);
        System.out.println("کد کالا را وارد کنید");
       int code_kala=input.nextInt();
        setCode_kala(code_kala);
        
        
    } 
    
   
    
    
    
    
    
}
