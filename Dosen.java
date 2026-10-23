public class Dosen extends Orang {
    private String nidn;
    private String mataKuliahDiajar;

    public Dosen(String id, String nama, String tanggalLahir, String nidn, String mataKuliahDiajar) {
        super(id, nama, tanggalLahir);
        this.nidn = nidn;
        this.mataKuliahDiajar = mataKuliahDiajar;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("NIDN          : " + nidn);
        System.out.println("Mata Kuliah   : " + mataKuliahDiajar);
    }
}