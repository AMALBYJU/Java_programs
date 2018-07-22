
package interface_eg;

class example       
{
    static
    {
        System.out.println("Entered example class");
    }
}

class Rectangle extends example implements two_Shape
{
   int len;
   int brd;
   int hgt;
   Rectangle(int l,int b,int h)
   {
       len = l;
       brd = b;
       hgt = h;
   }
   
   public void perimeter()
   {
       System.out.println("Perimeter = "+2*(len+brd));
   }
   public void area()
   {
       System.out.println("Total surface area = "+len*brd);
   }
}

class Sphere extends example implements three_Shape
{
   int rad;
   Sphere(int r)
   {
       rad = r;
   }
           
   public void volume()
   {
       System.out.println("Volume = "+(float)(4/3*3.14*Math.pow(rad,3)));
   }
   
   public void tsa()
   {
       System.out.println("Total surface area = "+4*3.14*Math.pow(rad,2));
   }
   
   public void lsa()
   {
       System.out.println("Sphere has no lateral surface area");
   }
}