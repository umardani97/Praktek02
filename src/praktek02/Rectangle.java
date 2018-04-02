
package praktek02;
public class Rectangle {
    double panjang;
    double lebar;
    
    void cetakInfo(){
        System.out.println("==================");
        System.out.println("Panjang :"+panjang);
        System.out.println("Lebar   :"+lebar);
        System.out.println("==================");
    }
    
    double hitungluas(){
        double luas;
        luas=panjang*lebar;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya adalah :"+hitungluas());
    }

    public Rectangle() {
        panjang=5;
        lebar=2;
    }

    public Rectangle(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
}
