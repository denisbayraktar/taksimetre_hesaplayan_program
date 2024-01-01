import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe, kmBasinaTaksimetreTutari, minTutar, taksimetreAcilis, odenecekTutar;
        kmBasinaTaksimetreTutari = 2.20;
        taksimetreAcilis = 10;
        minTutar = 20;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden yazınız: ");
        mesafe = input.nextDouble();
        odenecekTutar = (mesafe < 5) ? minTutar : ((mesafe * kmBasinaTaksimetreTutari) + taksimetreAcilis);
        DecimalFormat df = new DecimalFormat("#.##");
        String formatliTutar = df.format(odenecekTutar);
        System.out.println("Gidilen mesafeye (KM) göre taksimetre tutarı: " + formatliTutar + " TL");

    }
}