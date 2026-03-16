public class GenericsMethods {
    
    // Java Generic Method
    public static <T> boolean isEqual(GenericsType<T>g1, GenericsType<T>g2) {
        // Membandingkan isi dari g1 dan g2 menggunakan equals()
        return g1.get().equals(g2.get());
    }

    public static void main(String args[]) {
        // Membuat objek GenericsType bertipe String
        GenericsType<String> g1 = new GenericsType<>();
        g1.set("Java");

        GenericsType<String> g2 = new GenericsType<>();
        g2.set("Java");
        
        // Pemanggilan generic method dengan tipe eksplisit <String>
        boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
        
        // Pemanggilan generic method tanpa menuliskan tipe eksplisit, compiler akan menginfer tipe dari argumen yang diberikan
        // above statement can be written simply as
        boolean inferredEqual = GenericsMethods.isEqual(g1, g2);

        /*
        * This feature, known as type inference, allows you to invoke
        * a generic method as an ordinary method, without specifying
        * a type between angle brackets
        */
        
        // Compiler will infer the type that is needed
        System.out.println("Explicit type check: " + isEqual);
        System.out.println("Type inference check: " + inferredEqual);
    }
}

