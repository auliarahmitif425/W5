// Mendefinisikan class GenericsTypeOld tanpa menggunakan generics
public class GenericsTypeOld { 
  
    // Variabel t bertipe Object, bisa menampung semua tipe data
    private Object t;
  
    // Method getter untuk mengambil nilai t
    public Object get() {
      return t;
    }
    
    // Method setter untuk menyimpan nilai ke variabel t
    public void set(Object t) {
      this.t = t;
    }

    public static void main(String args[]) {
      
      // Membuat objek dari class GenericsTypeOld
      GenericsTypeOld type = new GenericsTypeOld();
      // Menyimpan String "Java" ke dalam variabel t
      type.set("Java");
      // Mengambil nilai dari t, lalu melakukan casting ke String
      // Casting ini rawan error jika tipe data tidak sesuai
      // Bisa menyebabkan ClassCastException saat runtime
      String str = (String) type.get(); // type casting, error prone and can cause ClassCastException
      
       // Menambahkan print agar variabel str dipakai dan terlihat hasilnya
      System.out.println("Isi variabel str:" + str);
    }
}