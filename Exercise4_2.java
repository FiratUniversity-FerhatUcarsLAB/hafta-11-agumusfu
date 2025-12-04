//250542016 Abdullah Gümüş Exercise4_2

public class Exercise4_2 {

    // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) { // Çalışma Sırası: 1 (main başlar)
        zippo("rattle", 13); // Çalışma Sırası: 2 (zippo çağrılır: quince="rattle", flag=13)
    } // Çalışma Sırası: 18 (main biter, program sonlanır)

    public static void baffle(String blimp) { // Çalışma Sırası: 8 (baffle başlar, blimp="rattle")
        System.out.println(blimp); // Çalışma Sırası: 9 -> EKRANA YAZILAN: rattle
        zippo("ping", -5); // Çalışma Sırası: 10 (zippo çağrılır: quince="ping", flag=-5)
    } // Çalışma Sırası: 15 (baffle biter, zippo'ya döner)

    public static void zippo(String quince, int flag) { // Çalışma Sırası: 3 (zippo başlar, quince="rattle", flag=13)
        if (flag < 0) { // Çalışma Sırası: 4 (flag < 0? -> FALSE)
            System.out.println(quince + " zoop"); // Çalışma Sırası: 13 -> EKRANA YAZILAN: ping zoop
        } else { // Çalışma Sırası: 5 (else bloğuna girilir)
            System.out.println("ik"); // Çalışma Sırası: 6 -> EKRANA YAZILAN: ik
            baffle(quince); // Çalışma Sırası: 7 (baffle çağrılır)
            System.out.println("boo-wa-ha-ha"); // Çalışma Sırası: 16 -> EKRANA YAZILAN: boo-wa-ha-ha
        }
    } // Çalışma Sırası: 14 (zippo 2. biter) / Çalışma Sırası: 17 (zippo 1. biter)
}