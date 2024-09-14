import java.util.Scanner;

public class siakad23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input scanner //
        String nama, nim; // tanda bahwa variabel string ada variabel nama dan nim //
        char kelas; //  tanda bahwa variabel char ada variabel kelas //
        byte absen; //  tanda bahwa variabel byte ada variabel absen //
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiUTS, nilaiUAS, nilaiAkhir; //  tanda bahwa variabel double ada
        // nilaiKuis, nilaiTugas, nilaiUjian, nilaiUTS, nilaiUAS, nilaiAkhir//
        
        System.out.println("Masukkan nama\t\t: "); // memberitahu user akan memasukan nama //
        nama = sc.nextLine(); // input nama //
        System.out.println("Masukkan NIM\t\t: "); // memberitahu user akan memasukan Nim //
        nim = sc.nextLine(); // input nim //
        System.out.println("Masukkan kelas\t\t: "); // memberitahu user akan memasukan kelas //
        kelas = sc.nextLine().charAt(0); // input kelas //
        System.out.println("Masukkan nomor absen\t: "); // memberitahu user akan memasukan nomor absen //
        absen = sc.nextByte(); // input nomor absen //
        System.out.println("Masukkan nilai kuis\t: "); // memberitahu user akan memasukan nilai kuis //
        nilaiKuis = sc.nextDouble(); // input nilai kuis //
        System.out.println("Masukkan nilai tugas\t: "); // memberitahu user akan memasukan nilai tugas //
        nilaiTugas = sc.nextDouble(); // input nilai tugas //
        System.out.println("Masukkan nilai ujian\t: "); // memberitahu user akan memasukan nilai ujian //
        nilaiUjian = sc.nextDouble(); // input nilai ujian //
        System.out.println("Masukkan nilai UTS\t: "); // memberitahu user akan memasukan nilai UTS //
        nilaiUTS = sc.nextDouble(); // input nilai UTS //
        System.out.println("Masukkan nilai UAS\t: "); // memberitahu user akan memasukan nilai UAS //
        nilaiUAS = sc.nextDouble(); // input nilai UAS //
        System.out.println("Masukkan nilai akhir\t: "); // memberitahu user akan memasukan nilai akhir //
        nilaiAkhir = sc.nextDouble(); // input nilai akhir //
       
        nilaiAkhir = (nilaiKuis / 100 * 20) + (nilaiTugas / 100 * 15) + (nilaiUTS / 100 * 30) + (nilaiUAS / 100 * 35); // menghitung nilai //
       
        System.out.printf("Output:\nNAma\t: %s\nNIM\t: %s\nKelas\t: %s\nAbsen\t: %s\nNilai Akhir\t: %s", nama, nim, kelas, absen, nilaiAkhir);
        // menampilkan nama, nim, kelas, absen, nilai akhir //

    }
    
}
