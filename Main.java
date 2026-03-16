// Mendefinisikan interface generik MinMax dengan type parameter T
// T hanya untuk class yang mengimplementasikan Comparable
interface MinMax <T extends Comparable<T>> {
    // Method abstrak untuk mencari nilai maksimum
    T max();
}

// Class MyClass mengimplementasikan interface MinMax
// T juga dibatasi agar bisa dibandingkan dengan compareTo
class MyClass <T extends Comparable<T>> implements MinMax<T> {
    // Array bertipe T untuk menyimpan data
    T[] vals;

    // Constructor menerima array bertipe T
    MyClass(T[] o) {
        vals = o;
    }
    
    // Implementasi method max() dari interface MinMax
    public T max() {
        // Ambil elemen pertama sebagai nilai awal
        T v = vals[0];

        // Looping mulai dari elemen kedua
        for (int i = 1; i < vals.length; i++) {
            //Menggunakan method compareTo dari interface Comparable
            // Jika elemen saat ini lebih besar dari v, maka v diganti dengan elemen tersebut
            if(vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }
        return v;
    }
}

public class Main {
    public static void main(String[] args) {
        // Membuat array Integer dan Character
        Integer[] inums = {3, 6, 2, 8, 6};
        Character[] chs = {'b', 'r', 'p', 'w'};
        
        // Membuat objek MyClass untuk Integer dan Character
        MyClass<Integer> a = new MyClass<>(inums);
        MyClass<Character> b = new MyClass<>(chs);

        System.out.println("Nilai Integer Terbesar: " + a.max());
        System.out.println("Karakter Terbesar: " + b.max());
    }
}