import java.util.Scanner;
/**
* Gaji24
 */
public class Gaji04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//untuk mengimpor objek yang berfungsi untuk membaca input dari variabel

        double totalJamKerja, upahPerJam, totalGaji, totalGajiAkhir, totalPajak, totalBonus, pajak = 5/100f , bonus = 10/100f;
        //untuk memberi tahu bahwa di dalam variabel bentuk double ada variabel totaljamkerja,upahperjam,totalgaji,totalgajiakhir,
        //totalpajak,totalbonus,pajak,bonus

        System.out.println("Masukkan Jumlah Jam Kerja\t: ");//untuk memberi tahu ke user bahwa akan memasukkan jumlah jam kerja
        totalJamKerja = sc.nextDouble();//untuk memasukkan total jam kerja
        System.out.println("Masukkan Upah Jam Kerja\t\t: ");//untuk memberi tahu ke user bahwa akan memasukkan upah jam kerja
        upahPerJam = sc.nextDouble();//untuk memasukkan input upah jam kerja
        
        // System.out.println("Masukkan Jumlah bonus");
        // bonus = sc.nextDouble();
        // System.out.println("masukkan jumlah pajak");
        // pajak = sc.nextDouble();

        totalGaji = totalJamKerja * upahPerJam;//untuk menghitung otomatis tentang total gaji dengan printah total jam kerja x upah per jam
        totalBonus = totalGaji * bonus;//untuk menggitung otomatis tentang total bonus dengan perintah total gaji x bonus
        totalPajak = (totalGaji + totalBonus) *pajak;//untuk menggitung otomatis tentang total pajak dengan perintah total gaji + bonus x pajak
        totalGajiAkhir = totalGaji + totalBonus - totalPajak;//untuk menggitung otomatis tentang total gaji akhir dengan perintah 
        //total gaji x total bonus - total pajak

        // System.out.printf("\nOutput:\n\nTotal Jam Kerja\t\t\t: %.2f\nUpah Per Jam\t\t\t: Rp.%.2f\nBonus\t\t\t\t: 10%%\nPajak\t\t\t\t: 5%%\nTotal Gaji\t\t\t: Rp.%.2f\nTotal Bonus\t\t\t: Rp.%.2f\nTotal Gaji + Bonus\t\t: Rp.%.2f\nTotal Pajak\t\t\t: Rp.%.2f\nTotal Gaji Akhir\t\t: Rp.%.2f",
        // totalJamKerja, upahPerJam, totalGaji, totalBonus, (totalGaji + totalBonus), totalPajak, totalGajiAkhir);
        System.out.println("Total Jam Kerja     : " + totalJamKerja); //menampikan output total jam kerja
        System.out.println("Upah Per Jam        : " + upahPerJam);//menampilkan output upah per jam
        System.out.println("Bonus               : " + "10%");//menampilkan output banus
        System.out.println("Pajak               : " + "5%");//menampilkan output pajak
        System.out.println("Total Gaji          : " + totalGaji);//menampikan output total gaji
        System.out.println("Total Bonus         : " + totalBonus);//menampikan output total bonus
        System.out.println("Total Gaji + Bonus  : " + (totalGaji + totalBonus)); //menampikan output total gaji + bonus
        System.out.println("Total Pajak         : " + totalPajak);//menampilkan output total pajak
        System.out.println("Total Gaji Akhir    : " + totalGajiAkhir);//menampilkan output total gaji akhir
    }
}
