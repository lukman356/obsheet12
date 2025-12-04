public class Kubus13 {

    // Fungsi menghitung volume kubus
    static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    // Fungsi menghitung luas permukaan kubus
    static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {

        int sisi = 5; // 

        int volume = hitungVolume(sisi);
        int luasPermukaan = hitungLuasPermukaan(sisi);

        System.out.println("Sisi kubus              : " + sisi);
        System.out.println("Volume kubus            : " + volume);
        System.out.println("Luas permukaan kubus    : " + luasPermukaan);
    }
}
