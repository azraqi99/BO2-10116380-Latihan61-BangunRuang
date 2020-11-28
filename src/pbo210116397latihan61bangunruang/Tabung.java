/*
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Bangun Ruang
 */
package pbo210116397latihan61bangunruang;

/**
 *
 * @author Zetro
 */
public class Tabung extends BangunRuang{
    
     private double tinggi;
    private double jari;

    public double getTinggi() {
        return tinggi;
    }

    public double getJari() {
        return jari;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double hitungVolume() {
        return 3.14 * (jari * jari) * tinggi;
    }

    
}
