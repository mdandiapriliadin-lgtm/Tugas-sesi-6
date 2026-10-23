public class Mahasiswa extends Orang {
    private String nim;
    private String prodi;
    private double ipk;

    public Mahasiswa(String id, String nama, String tanggalLahir, String nim, String prodi, double ipk) {
        super(id, nama, tanggalLahir);
        this.nim = nim;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIM           : " + nim);
        System.out.println("Prodi         : " + prodi);
        System.out.println("IPK           : " + ipk);
    }
}