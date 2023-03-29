
package test40201;
import java.util.Scanner;
public class Test40201 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /* (a)buat instansi objek bernama balok1 dari Class Balok() →default const.
        
(b)buat instansi objek bernama balok2 dari Class Balok(20,35, 15)→param const.
(c)setter → set nilai l = 5 dari konstruktor Balok()
(d)setter → set nilai p = 25 dari konstruktor Balok()
(e)setter → set nilai t = 10 dari konstruktor Balok(20,35, 15)
(f)panggil method info dari konstruktor Balok ()
(g)panggil method info dari konstruktor Balok(20,35, 15) */
      
 
//class Balok
class Balok extends PersegiPanjang{
int t;
public Balok() {
    super(panjang, lebar);
    this.tinggi = tinggi;
}
public Balok(int p, int l, int t) {
(i) berisi nilai pada saat runtime p p, l=l dari konstruktor superclass
persegi panjang t t;
}
(j) buat getter setter class balok
public int volume(){
    return (panjang *lebar *tinggi);
}

}
public void info(){
    double dr = Math.sqrt((p*p)+(l*l)+(t*t));
 System.out.println()

}
}
// class Persegi Panjang
class PersegiPanjang{
    double panjang;
    double lebar;
int p, l;
public PersegiPanjang() {
this.panjang=panjang;
this.lebar=lebar;
}
public PersegiPanjang(int p, int l) {
return panjang ;
 }
(o) buat getter setter class Persegi Panjang
public int luas(){
double hitungLuas(){
    return (panjang*lebar);
}
 }
public int keliling(){
(r) fungsi untuk menghitung keliling persegi panjang : 2x (p+l)
}
}
    }
class hitung {
    public static void main(String[] args) {
        Balok b2 = new Balok (20,35, 15);
        PersegiPanjang p1 = new PersegiPanjang(30,40);
        System.out.println("Panjang = " +b2.panjang);
         System.out.println("lebar =" +b2.lebar);
         System.out.println("tinggi=" +b2.tinggi);
         System.out.println("luas=" +b2.hitungLuas());
         System.out.println("volum=" +b2.hitungLuas());
        
    }
}