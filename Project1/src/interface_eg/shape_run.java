
package interface_eg;


public class shape_run {
    
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4,5,6);
        r1.perimeter();
        r1.area();
        r1.perimeter();
        Sphere r2 = new Sphere(4);
        r2.volume();
        r2.tsa();
        r2.lsa();
    }
    
}
