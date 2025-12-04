//250542016 Abdullah Gümüş Exercise4_4


public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        // Cevap 1: Derleyici bu duruma izin verir. Metot cagirilir, degeri dondurulur (42),
        // ancak bu deger herhangi bir degiskene atanmadigi veya bir ifade icinde
        // kullanilmadigi icin basitce atilir (discard edilir). Program derlenir ve calisir.
        getNumber(); // Calisir ve sorunsuz derlenir.

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Cevap 2: Derleyici HATASI verir, kod derlenmez. Bir 'void' metot hicbir deger dondurmez.
        // Bu nedenle, metot cagrisinin sonucunu bir ifade (sayHello() + 7) icinde
        // bir deger olarak kullanmaya calismak derleyici hatasina (ornek: "void type
        // not allowed here") neden olur, cunku '+' operatoru calismak icin degerlere
        // ihtiyac duyar.
    }
}