package Kuis;

import java.util.*;

public class HitungSiku {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in); //membuat inputan user
        try{
            System.out.print("Masukkan Sisi Alas : ");
            double sisiAlas = input.nextDouble();
            double alas = sisiAlas * sisiAlas;
            
            System.out.print("Masukkan Sisi Tegak : ");
            double sisiTegak = input.nextDouble();
            double tegak = sisiTegak * sisiTegak;
            
            //pengecekan agar sisi tidak boleh negatif
            if(sisiAlas <= 0 || sisiTegak <= 0){
                throw new IllegalArgumentException("Sisi Tidak Boleh Negatif Atau Nol");
            }    
            
            double sisiMiring = Math.sqrt(alas + tegak); //rumus mencari akar kuadrat menggukanan Math.sqrt
            System.out.println("Sisi Miring Segitiga Siku-Siku adalah " + sisiMiring  );
        
        //pesan error jika memasukkan bukan angka
        }catch(InputMismatchException e){
            System.out.println("Terjadi kesalahan. Masukkan tidak valid");
        
        //pesan error jika sisi negatif atau nol    
        }catch(IllegalArgumentException e){
            System.out.println("Terjadi Kesalahan " + e.getMessage());
            
        }catch(Exception e){
            System.out.println("Terjadi Kesalahan " + e);
            
        }finally{
            input.close();
        }
    
    }
    
}
