import java.util.ArrayList;
public class nomor6 {
    public static void main(String[] args) {
        //String[] nama = {"H","A","N","I"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("H");
        nama.add("A");
        nama.add("N");
        nama.add("I");
        
        //Soal no 6
        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
        //add(0,e), add(2,f), add(3,g), add(4,h), add(6,h), add(-3,j)
    
        nama.add(0,"e");
        System.out.println("Element setelah menambahkan string e " + nama);
    
        nama.add(2,"f");
        System.out.println("Element setelah menambahkan string f " + nama);
    
        nama.add(3,"g");
        System.out.println("Element setelah menambahkan string g " + nama);
    
        nama.add(4,"h");
        System.out.println("Element setelah menambahkan string h " + nama);
    
        nama.add(6,"h");
        System.out.println("Element setelah menambahkan string h " + nama);
    
        nama.add(-3,"j");
        System.out.println("Element setelah menambahkan string j " + nama);
    
       
    
                
        }
}
