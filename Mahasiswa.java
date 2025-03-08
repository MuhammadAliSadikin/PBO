public class Mahasiswa {
    private String nama;
    private String nim;
    private String alamat;
    private  int semester;
    private int sks;
    private double ipk;

    public Mahasiswa(String nama, String nim, String alamat, int semester, int sks, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.semester = semester;
        this.sks = sks;
        this.ipk = ipk;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat;
    }

    public int getSemester() {
        return semester;
    }

    public int getSks() {
        return sks;
    }

    public double getIpk() {
        return ipk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                ", alamat='" + alamat + '\'' +
                ", semester=" + semester +
                ", sks=" + sks +
                ", ipk=" + ipk +
                '}';
    }
}


