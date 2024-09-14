import java.util.Scanner;
/**
  * Listrik24
  */
 public class Listrik04{
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//untuk mengimpor objek yang berfungsi untuk membaca input dari variabel

        int hargaListrik = 1500, jmlListrik, totalHargaListrik;//untuk memberi tahu didalam variabel benruk integer ada variabel hargalistrik,
        //jumlahlistrik,totalhargalistrik
        boolean statusListrik;//untuk memberi tahu di dalam variabel bentuk boolean ada variabel statuslistrik

        System.out.println("Masukkan Jumlah Listrik (kwh)\t : ");//untuk memberi tahu kepada user bahwa akan memasukkan jumlah listrik(KWH)
        jmlListrik = sc.nextInt();//untuk memasukkan jumlah listrik

        statusListrik = jmlListrik > 500;//untuk mengetahui bahwa listrik tidak boleh lebih dari 500

        totalHargaListrik = jmlListrik * hargaListrik;//untuk menghitung total hargalistrik dengan cara jumlah lisrik x harga istrik

       
        System.out.println("Apakah listrik melebihi 500 KWH  : " + statusListrik); //menampikan status listrik
        System.out.println("Jumlah Listrik                   : " + jmlListrik);//menampilkan jumlah listrik
        System.out.println("Harga Listrik(KWH)               : " + hargaListrik);//menampilkan harga listrik
        System.out.println("Total Bayar Listrik              : " + totalHargaListrik);//menampikan total harga listrik
        



    }
 }