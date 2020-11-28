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
public class BolaBasket extends BangunRuang{
    
    private double jari;

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public double hitungVolume() {
        return 4 * jari * jari * jari * 3.14 / 3;

    }
    
}
