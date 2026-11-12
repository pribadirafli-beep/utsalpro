public class variabel{
    public static void main(String[] args) {
        // Deklarasi variabel dengan tipe data yang sesuai
        String namaLengkap = "Muhammad Rafli Pribadi";
        String tempatLahir = "Bogor";
        String tanggalLahir = "04 Oktober 2007";
        char jenisKelamin = 'L';
        String alamat = "Bogor, Empang, jl.Muara Lebak";
        String noHp = "085591612022";   // String agar angka 0 di depan tidak hilang
       long penghasilan = 5000000L;   // Penghasilan sebulan (Rupiah)

        // Menampilkan output
        System.out.println("Assalamu’alaikum");
        System.out.println("Izinkan saya memperkenalkan diri");
        System.out.println("Nama Lengkap            : " + namaLengkap);
        System.out.println("Tempat & Tanggal Lahir  : " + tempatLahir + ", " + tanggalLahir);
        System.out.println("Jenis Kelamin           : " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Alamat Lengkap          : " + alamat);
        System.out.println("No Hp                   : " + noHp);
        System.out.println("Penghasilan Sebulan     : Rp " + penghasilan);
    }
}