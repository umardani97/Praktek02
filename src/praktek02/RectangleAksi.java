
package praktek02;
public class RectangleAksi {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.panjang = 9;
        r1.lebar = 3;
        
        r1.cetakInfo();
        System.out.println("Luas rectangle ="+r1.hitungluas());
        r1.cetakLuas();
        
        Rectangle r2 = new Rectangle();
        r2.cetakInfo();
        
        Rectangle r3 =new Rectangle(50,30);
        r3.cetakInfo();
        
    }
}
