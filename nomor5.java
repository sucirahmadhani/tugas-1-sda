import java.util.ArrayList;
public class nomor5 {
    public static void main(String[] args) {
        //String[] nama = {"H","A","N","I"};
        ArrayList<String> nama = new ArrayList<String>();
        nama.add("H");
        nama.add("A");
        nama.add("N");
        nama.add("I");
        
    
        System.out.println("ArrayList sebelum remove:");
        for(String var: nama){
             System.out.println(var);
        }
    
        //Soal no 4
        //Tentukan hasil yang didapatkan ketika dilakukan perintah berikut ini:
        //remove(0), remove(3), remove(2)
    
        // System.out.println(nama.remove(0));
        // System.out.println(nama.remove(3));
        // System.out.println(nama.remove(2));
    
        //nama.remove(0);
        nama.remove(3);
        //nama.remove(2);
        System.out.println("ArrayList setelah remove:");
           for(String var2: nama){
                 System.out.println(var2);
    
                }
        }
}
