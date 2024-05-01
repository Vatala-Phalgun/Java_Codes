public class this5
{  
    A obj;  
    this5(A obj)
    {  
      this.obj=obj;  
    }  
    void display(){  
      System.out.println(obj.data); 
    }  
  }  
    
  class A
  {  
    int data=10;  
    A()
    {  
     this5 b=new this5(this);  
     b.display();  
    }  
    public static void main(String args[])
    {  
     A obj=new A();  
    }  
  }  