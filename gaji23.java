import java.util.Scanner;

public class gaji23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // input scanner //

        double totalJamKerja, upahPerJam, totalGaji, totalGajiAkhir, totalPajak, totalBonus, pajak = 5/100f, bonus = 5/100f;
        // tanda bahwa didalam varibael double ada variabel totalJamKerja, upahPerJam, totalGaji, totalGajiAkhir, totalPajak, totalBonus, pajak = 5/100f, bonus = 5/100f //

        System.out.println("Masukkan Jumlah Jam Kerja\t: "); // memberitahu user untuk memasukan jumlah jam kerja //
        totalJamKerja = sc.nextDouble(); // input total jam kerja //
        System.out.println("Masukkan Upah Jam Kerja\t\t: "); // memberitahu user untuk memasukan upah jam kerja //
        upahPerJam = sc.nextDouble(); // input total upah jam kerja //

        totalGaji = totalJamKerja * upahPerJam; // menghitung total gaji //
        totalBonus = totalGaji * bonus; // menghitung total bonus //
        totalPajak = (totalGaji + totalBonus) *pajak; // menghitung total pajak //
        totalGajiAkhir = totalGaji + totalBonus - totalPajak; // menghitung total gaji akhir //

        System.out.printf("\nOutput:\n\nTotal Jam Kerja\t\t\t: %.2f\nUpah Per Jam\t\t\t: Rp.%.2f\nBonus\t\t\t\t: 10%%\nPajak\t\t\t\t: 5%%\nTotal Gaji\t\t\t: Rp.%.2f\nTotal Bonus\t\t\t: Rp.%.2f\nTotal Gaji + Bonus\t\t: Rp.%.2f\nTotal Pajak\t\t\t: Rp.%.2f\nTotal Gaji Akhir\t\t: Rp.%.2f",
        totalJamKerja, upahPerJam, totalGaji, totalBonus, (totalGaji + totalBonus), totalPajak, totalGajiAkhir);
        // menampilkan output dari totalJamKerja, upahPerJam, totalGaji, totalBonus, (totalGaji + totalBonus), totalPajak, totalGajiAkhir //
    }

    
}
