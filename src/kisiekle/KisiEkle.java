

package kisiekle;

import java.util.ArrayList;
import java.util.Scanner;


public class KisiEkle {

    
    public static void main(String[] args) {
        
        ArrayList dizi = new ArrayList();
        Scanner s= new Scanner (System.in);
     
    for(int i=0; i<2; i++){
        System.out.println("Adi gir:");
        String Adi = s.next();
        dizi.add(Adi);
        System.out.println("Soyadi gir:");
        String Soyadi = s.next();
        dizi.add(Soyadi);
        System.out.println("Tel gir:");
        int Tel = s.nextInt();
        dizi.add(Tel);
        
        System.out.println(dizi);
    }
        
        
        

       
        
       
        
        
        
        
     
    }
    
}
