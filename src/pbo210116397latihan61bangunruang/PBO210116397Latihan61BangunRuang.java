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
public class PBO210116397Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BolaBasket bola = new BolaBasket();
        bola.setJari(7);
        System.out.println("=========HitungBola=========");
        System.out.println("Jari Jari Bola : "+bola.getJari());
        System.out.println("Volume Bola : "+bola.hitungVolume());
        System.out.println("");
        
        Tabung tabung = new Tabung();
        tabung.setTinggi(21);
        tabung.setJari(10);
        System.out.println("=========HitungTabung==========");
        System.out.println("Tinggi Tabung : "+tabung.getTinggi());
        System.out.println("Jari Jari Tabung : "+tabung.getJari());
        System.out.println("Volume Tabung : "+Math.ceil(tabung.hitungVolume()));
        System.out.println("");
        
        Kerucut kerucut = new Kerucut();
        kerucut.setJari(14);
        kerucut.setTinggi(9);
        System.out.println("=========HitungKerucut===========");
        System.out.println("Volume kerucut " + kerucut.hitungVolume());
    }
    
}
