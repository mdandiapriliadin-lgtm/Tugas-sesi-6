public class Orang {
    // Atribut protected agar bisa diakses oleh subclass
    protected String id;
    protected String nama;
    protected String tanggalLahir;

    // Constructor Parent
    public Orang(String id, String nama, String tanggalLahir) {
        this.id = id;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    // Method untuk menampilkan informasi umum
    public void tampilkanInfo() {
        System.out.println("ID            : " + id);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
    }
}