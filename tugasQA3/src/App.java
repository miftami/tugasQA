public class App {
    public static void main(String[] args) throws Exception {
        
        int tinggi = 20;
                int i, j, k;
                
                // Membuat loop untuk setiap baris membentuk segitiga
                for (i = 0; i < tinggi; i++) {
                   
                    // Membuat loop untuk mencetak karakter *
                    
                   if (i < tinggi/2){
                   for ( j = 0 ; j <= i; j++){
                    
                     System.out.print(" *");
                    
                    }
                     // Mencetak baris baru
                     System.out.println();
        
                    }else{
                    for ( k = 0 ; k < tinggi - i; k++){
                    
                     System.out.print(" *");
                    }
                     System.out.println();
                    }
                }
                
              
            
        
    }
}
