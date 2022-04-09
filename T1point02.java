



public class T1point02 {

   
    public static void main(String[] args) {
       String [][]data= new String[][]{
           {"Adi",  "127647", "Teknik Informatika"},
           {"Mika", "129883", "Sistem Komputer"},
           {"Budi", "120495",  "Teknik Informatika"},
           {"Bunga","123489",  "Sistem Komputer"},
       };       
      
       for (int b=0; b<data.length; b++){
            for (int k=0; k<data[b].length; k++){
               
                System.out.print(data[k][b]+"\t ");
            }
           
            System.out.println(""); 
             
       }
    }
}

               


    
    
    

