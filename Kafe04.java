import java.util.Scanner;

public class Kafe04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //untuk mengimpor objek yang berfungsi untuk membaca input dari variabel

        boolean kelanggotaan;//untuk memberi tahu bahwa di dalam variabel bentuk boolean ada variabel keanggotaan
    int jumlahKopi, JumlahTeh, JumlahRoti;//untuk memberi tahu bahwa di dalam variabel bentuk integer ada variabel jumlahkopo, jumlahteh,jumlahroti
    double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 2000.0;////untuk memberi tahu bahwa di dalam variabel bentuk double ada variabel harga
        float diskon = 10 / 100f;//untuk memberi tahu bahwa di dalam variabel bentuk float ada variabel diskon
        double totalHarga, nominalBayar;//untuk memberi tahu bahwa di dalam variabel bentuk double ada variabel total harga dan nominal

        System.out.println("masukkan keanggotan (true/false) : ");//untuk memberi tahu ke user bahwa akan memasukkan true/false
        kelanggotaan = input.nextBoolean();//untuk memasukkan input true/false
        System.out.println("masukkan jumlah pembelian kopi : ");//untuk memberi tahu ke user bahwa akan memasukkan jml pembelian kopi
        jumlahKopi = input.nextInt();//untuk memasukkan input jumlah kopi yang di beli
        System.out.println("masukkan jumlah pembelian teh : ");//untuk memberi tahu ke user bahwa akan memasukkan jml pembelian teh
        JumlahTeh = input.nextInt();//untuk memasukkan input jumlah pembelian teh
        System.out.println("masukkan jumlah pembelian roti : ");//untuk memberi tahu ke user bahwa akan memasukkan jml pembelian roti
        JumlahRoti = input.nextInt();//untuk memasukkan input jumlah pembelian teh

        totalHarga = (jumlahKopi * hargaKopi) + (JumlahTeh * hargaTeh) + (JumlahRoti * hargaRoti);
        //untuk memberi tahu bahwa harga yang di dapat dari keseluruhan pembelian di kalikan harga perbijinya
        nominalBayar = totalHarga-(diskon + totalHarga);//untuk memberi tahu bahwa hasil output yang telah di hitung dari keseluruhan yang di beli
        //menggunakan rumus yang telah di tentukan yaitu total harga-(diskon  + total harga)

        System.out.println("keanggotaan pelanggan " + kelanggotaan);// untuk mengkonfirmasi bahwa pelanggan sudah benar/salah
        System.out.println("item pembelian : " + jumlahKopi + "kopi, " + JumlahTeh + "teh, " + JumlahRoti + "roti");
        //untuk mengkonfirmasi jumlah pembelian
        System.out.println("nominal bayar " + nominalBayar);//untuk mengetahui pembayaran dari semua pembelian 
    }
}
