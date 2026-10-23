public class MainAkademik {
    public static void main(String[] args) {
        Dosen d1 = new Dosen(
            "D01", "Dr. Budi Santoso", "12 Mei 1980", "0012058001", "Pemrograman Berbasis Objek"
        );

        Mahasiswa m1 = new Mahasiswa(
            "M01", "Siti Aminah", "20 Agustus 2003", "220101001", "Informatika", 3.85
        );

        System.out.println("=== Data Dosen ===");
        d1.tampilkanInfo();

        System.out.println();

        System.out.println("=== Data Mahasiswa ===");
        m1.tampilkanInfo();
    }
}