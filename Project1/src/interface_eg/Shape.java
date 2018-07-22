package interface_eg;

public interface Shape
{
    float pi = 3.14F;
}
interface two_Shape extends Shape
{
    void area();
    void perimeter();
}

interface three_Shape extends Shape
{
    void tsa();
    void lsa();
    void volume();
}
