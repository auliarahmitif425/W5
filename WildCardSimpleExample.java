import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

/** 
 * Wildcard Arguments With An Unknown Type
 * @ author javaguides.net
 **/

public class WildCardSimpleExample {

    // Method generic dengan wildcard
    // Parameter bertipe Collection<?> bisa menerima Collection dengan tipe apapun
    public static void printCollection(Collection<?> c) {
        // Looping setiap elemen dalam collection
        for (Object e : c) {
            // Cetak elemen, tipe nya Object karena kita tidak tahu tipe sebenarnya dari elemen dalam collection
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        // Membuat Collection bertipe ArrayList dengan elemen String
        Collection<String> collection = new ArrayList<>();
        collection.add("ArrayList Collection");
        // Memanggil method printCollection dengan ArrayList sebagai argumen
        printCollection(collection);

        // Membuat Collection bertipe LinkedList dengan elemen String
        Collection<String> collection2 = new LinkedList<>();
        collection2.add("LinkedList Collection");
        // Memanggil method printCollection dengan LinkedList sebagai argumen
        printCollection(collection2);

        // Membuat Collection bertipe HashSet dengan elemen String
        Collection<String> collection3 = new HashSet<>();
        collection3.add("HashSet Collection");
        // Memanggil method printCollection dengan HashSet
        printCollection(collection3);
    }
}