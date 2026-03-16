// Mendefinisikan class GenericsType dengan parameter tipe T
// T adalah type parameter yang akan ditentukan saat membuat objek
public class GenericsType<T> {
    
    // Variabel t bertipe T, tipe ini fleksibel sesuai yang ditentukan
    private T t;
    
    // Method getter untuk mengambil nilai t
    // Mengembalikan nilai dengan tipe T
    public T get() {
        return this.t;
    }
    
    // Method setter untuk menyimpan nilai ke variabel t
    // Parameter bertipe T jadi aman sesuai tipe yang sudah ditentukan
    public void set (T t1) {
        this.t = t1;
    }
    
    public static void main (String args[]) {
        
        // Membuat objek GenericsType bertipe String
        // Maka variabel t hanya bisa menyimpan data String
        GenericsType<String> type = new GenericsType<>();
        type.set("Java"); //valid (karena tipe nya String)
        System.out.println("Isi type: " + type.get()); // cetak hasilnya
       
        // Membuat objek GenericsType bertipe Object
        // Object adalah induk dari semua class jadi bisa menyimpan berbagai tipe
        GenericsType<Object> type1 = new GenericsType<>();
        type1.set("Java"); //valid (karena String adalah subclass dari Object)
        System.out.println("Isi type1: " + type1.get()); // cetak hasil pertama
        
        type1.set(10); //valid and autoboxingsupport (karena Integer adalah subclass dari Object)
        System.out.println("Isi type1: " + type1.get()); // cetak hasil kedua
    }
}
