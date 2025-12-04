//250542016 Abdullah Gümüş Exercise4_6


public class Exercise4_6_Multadd {

    /**
     * Multadd metodunu uygular: a * b + c
     *  a Carpma isleminin ilk carpani
     *  b Carpma isleminin ikinci carpani
     *  c Toplama isleminin toplanani
     * @return a * b + c isleminin sonucunu dondurur.
     */
    public static double multadd(double a, double b, double c) {
        // Görev 1: multadd(a, b, c) metodunu yazın -> a * b + c
        return a * b + c;
    }

    /**
     * expSum metodunu uygular: x * Math.exp(-x) + (1 - Math.exp(-x))
     * x Hesaplamada kullanilacak double deger
     * @return Formule gore hesaplanan sonucu dondurur.
     */
    public static double expSum(double x) {
        // Görev 2: expSum(x) metodunu yazın
        double expMinusX = Math.exp(-x);
        return x * expMinusX + (1.0 - expMinusX);
    }

    public static void main(String[] args) {
        // Görev 3: main içinde istenen ifadeleri test edin.

        System.out.println("--- Exercise 4.6 Metot Testleri ---");

        // * multadd(1.0, 2.0, 3.0) ifadesinin testi
        double test1 = multadd(1.0, 2.0, 3.0); // Beklenen: 1*2 + 3 = 5.0
        System.out.println("1. multadd(1.0, 2.0, 3.0) = " + test1);

        // * sin(pi/4) + cos(pi/4) / 2 ifadesinin multadd ile testi
        // İfadeyi multadd formatına (a*b + c) uydurmak için:
        // sin(pi/4) + (1/2) * cos(pi/4)  ->  c + a * b
        double piOver4 = Math.PI / 4.0;
        double a2 = Math.cos(piOver4);
        double b2 = 0.5; // 1/2
        double c2 = Math.sin(piOver4);
        double test2 = multadd(a2, b2, c2);
        System.out.println("2. sin(pi/4) + cos(pi/4) / 2 = " + test2);

        // * log(10) + log(20) ifadesinin multadd ile testi
        // İfadeyi multadd formatına (a*b + c) uydurmak için:
        // 1 * log(20) + log(10)  ->  a * b + c
        double a3 = 1.0;
        double b3 = Math.log(20.0);
        double c3 = Math.log(10.0);
        double test3 = multadd(a3, b3, c3);
        System.out.println("3. log(10) + log(20) = " + test3);
        // Kontrol (logaritma kuralı: log(10)+log(20) = log(200)):
        // System.out.println("Kontrol (log(200)): " + Math.log(200.0));

        // * expSum metodunun testi
        double x_test = 1.0;
        double test4 = expSum(x_test);
        System.out.println("4. expSum(" + x_test + ") = " + test4);
    }
}
