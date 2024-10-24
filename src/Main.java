import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.
        // Ödev : Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

        Scanner input = new Scanner(System.in);
        int mat, fizik, kimya, türkce, tarih, muzik;

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuz: ");
        türkce = input.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();
        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        double ortalama = (mat + fizik + kimya + türkce + tarih + muzik) / 6;
        System.out.println("Ortalama: " + ortalama);

        String sinfiGecmeDurumu = ortalama >= 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(sinfiGecmeDurumu);
    }
}