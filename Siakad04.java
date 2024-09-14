import java.util.Scanner;
public class Siakad04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); //untuk mengimpor objek yang berfungsi untuk membaca input dari variabel?
        String nama, nim, kelas; //untuk memberi tahu bahwa di dalam variabel bentuk string ada variabel nama dan nim
        // char kelas;//untuk memberi tahu bahwa di dalam variabel bentuk char ada variabel kelas
        byte absen;//untuk memberi tahu bahwa di dalam variabel bentuk byte ada variabel absen
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUTS, nilaiUAS, nilaiAkhir;//untuk memberi tahu bahwa di dalam variabel bentuk double ada 
        //variabel nilaiKuis,nilaiTugas,nilaiUjian,nilaiUTS,nilaiUAS,nilaiAkhir
        System.out.println("masukkan nama: "); //untuk memberi tahu ke user bahwa akan memasukkan nama
        nama = sc.nextLine();//untuk memasukkan input nama 
        System.out.println("masukkan nim: ");//untuk memberi tahu ke user bahwa akan memasukkan nim
        nim = sc.nextLine();//untuk memasukkan input nim
        System.out.println("masukkan kelas: ");//untuk memberi tahu ke user bahwa akan memasukkan kelas
        kelas= sc.nextLine(); //charAt(0);//untuk memasukkan input kelas 
        System.out.println("masukkan nomor absen: ");//untuk memberi tahu ke user bahwa akan memasukkan nomor absen
        absen = sc.nextByte();//untuk memasukkan input nomor absen
        System.out.println("masukkan nilai Kuis: ");//untuk memberi tahu ke user bahwa akan memasukkan nilai kuis
        nilaiKuis = sc.nextDouble();//untuk memasukkan input nilai Kuis
        System.out.println("masukkan nilai Tugas: ");//untuk memberi tahu ke user bahwa akan memasukkan nilai tugas
        nilaiTugas = sc.nextDouble();//untuk memasukkan input nilai Tugas
        System.out.println("masukkan nilai Ujian: ");//untuk memberi tahu ke user bahwa akan memasukkan nilai ujian
        nilaiUjian = sc.nextDouble();//untuk memasukkan input nilai Ujian 
        System.out.println("masukkan nilai UTS: ");//untuk memberi tahu ke user bahwa akan memasukkan nilai UTS
        nilaiUTS = sc.nextDouble();//untuk memasukkan input nilai UTS
        System.out.println("masukkan nilai UAS: ");//untuk memberi tahu ke user bahwa akan memasukkan nilai UAS
        nilaiUAS = sc.nextDouble();//untuk memasukkan input nilai UAS        
        System.out.println("masukkan nilai Akhir: ");//untuk memberi tahu ke user bahwa akan memasukkan nilai Akhir
        nilaiAkhir = sc.nextDouble();//untuk memasukkan input nilai Akhir

        nilaiAkhir = (nilaiKuis / 20 * 100 ) + (nilaiTugas / 15 * 100 ) + (nilaiUTS / 30 * 100 ) + (nilaiUAS / 35 * 100 );
        //untuk menghitung nilai akhir dengan format diatas  
        System.out.println("nama  : " + nama); //menampikan nama
        System.out.println("nim   : " + nim);//menampilkan kelas
        System.out.println("absen : " + absen);//menampilkan absen
        System.out.println("kelas : " + kelas);//menampikan kelas
        System.out.println("nilai akhir : "+ nilaiAkhir);//menampikan nilai akhir
    }
}



//+ " absen : " + absen 