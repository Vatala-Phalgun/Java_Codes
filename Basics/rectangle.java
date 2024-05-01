class rect
{   
    int height,width;
    rect()
    {
         height=1;
         width=1;
    }
    rect(int h, int w)
    {
        height=h;
        width=w;
    }
    int Area()
    {
        return height*width;
    }
    int Perimeter()
    {
        return 2*(height+width);
    }
    void display()
    {
        System.out.println("Length= "+height);
        System.out.println("Breadth= "+width);
        System.out.println("Area= "+Area());
        System.out.println("Perimeter= "+Perimeter());
    }
}
public class rectangle
{
    public static void main(String[] args) 
    {
        rect obj1 = new rect();
        rect obj2 = new rect(4,40);
        rect obj3 = new rect(3,35);
        obj1.display();
        obj2.display();
        obj3.display();
    
    }
}
