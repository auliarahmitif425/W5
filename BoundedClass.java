// Class generik Bound dengan type parameter T
// T dibatasi hanya untuk class A atau turunannya
class Bound<T extends A> {
    
    // Menyimpan referensi objek bertipe T
    private T objRef;
    
    // Constructor menerima objek bertipe T
    public Bound(T obj) {
        this.objRef = obj;
    }
    
    // Method untuk menjalankan test
    // Memanggil method displayClass() dari objek yang disimpan
    public void doRunTest() {
        this.objRef.displayClass();
    }
}

// Superclass A
class A {
    // Method displayClass() milik superclass 
    public void displayClass() {
        System.out.println("Inside sub class A");
    }
}

class B extends A {
    // Override method displayClass()
    public void displayClass() {
        System.out.println("Inside sub class B");
    }
}

class C extends A {
    // Override method displayClass()
    public void displayClass() {
        System.out.println("Inside sub class C");
    }
}

public class BoundedClass {

    public static void main(String a[]) {

        // Creating object of sub class C and
        // passing it to Bound as a type parameter.
        Bound<C> bec = new Bound<C>(new C());
        bec.doRunTest();

        // Creating object of sub class B and
        // passing it to Bound as a type parameter.
        Bound<B> beb = new Bound<B>(new B());
        beb.doRunTest();

        // similarly passing super class A
        Bound<A> bea = new Bound<A>(new A());
        bea.doRunTest();
    }
}