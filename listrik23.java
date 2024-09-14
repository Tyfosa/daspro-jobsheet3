import java.util.Scanner;

public class listrik23 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input scanner //

        int hargaListrik = 1500, jmlListrik, totalHargaListrik; // tanda bahwa variabel int ada variabel hargalistrik = 1500,
        // jumlahlistrik, totalhargalistriik //
        boolean statusListrik; // tanda bahwa variabel boolean ada variabel statuslistrik //

        System.out.println("Masukkan Jumlah Listrik (kwh)\t\t: "); // mengetahui user untuk memasukan jumlah listrik (kwh)//
        jmlListrik = sc.nextInt(); // memasukan jumlahlistrik //

        statusListrik = jmlListrik > 500;// mengetahui bahwa listrik tidak boleh lebih dari 500 //

        totalHargaListrik = jmlListrik * hargaListrik;// menghitung total harga listrik dengan cara jumlahlistrik + hargalistrik //

        System.out.printf("\nOutput:\n\nApakah Listrik Melebihi 500 kWh?\t: %s\nJumlah Listrik\t\t\t\t: %s\nHarga Listrik (kWh)\t\t\t: %s\nTotal Bayar Listrik\t\t\t: %s", statusListrik, jmlListrik, hargaListrik, totalHargaListrik);
        // menampilkan status jumlah listrikk, harga listrik, total harga listrik //
    }
}
