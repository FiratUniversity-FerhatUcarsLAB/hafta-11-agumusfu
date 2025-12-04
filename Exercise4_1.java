//250542016 Abdullah Gümüş Exercise4_1

public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + date + " " + month + " " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(day + " " + month + " " + date + " " + year);
    }

    public static void main(String[] args) {
        String gun = "Monday";
        int tarih = 5;
        String ay = "December";
        int yil = 2005;
        System.out.println("--Tarih Metotlari Yazdirma Testi--");
        System.out.println("Test Verisi: "+gun+","+tarih+" "+ay+","+yil);
        System.out.println("-----------------------------------");
        //Amerikan Formatı
        System.out.println("Amerikan Formati");
        printAmerican(gun, tarih, ay, yil);
        System.out.println("---------------------------------");
        System.out.println("Avrupa Formati");
        printEuropean(gun, tarih, ay, yil);
    }
}
