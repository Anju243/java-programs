class Product
{
     int pcode;
     String pname;
     double price;
     Product(int a,String b,double c)
    {
       pcode=a;
       pname=b;
       price=c;
    }
    void display()
    {
     System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
   }
 }
class ProductDemo
{
static void findLowest(Product p1,Product p2,Product p3)
{
 if(p1.price<=p2.price&&p1.price<=p3.price)
 { 
    System.out.println("Product 1 has low price");
 }
else if (p2.price<=p1.price && p2.price<=p3.price)
 {
    System.out.println("Product 2 has low price");
 }
else
 {
   System.out.println("Product 3 has low price");
 }
}
public static void main(String args[])
{
    Product obj1 = new Product(1,"prod1",10000);
    Product obj2 = new Product(2,"prod2",15000);
    Product obj3 = new Product(3,"prod3",8000);
    System.out.println("\nProduct_Code\tProduct_Name\tProduct_Price");
   obj1.display();
   obj2.display();
   obj3.display();
   findLowest(obj1, obj2, obj3);
 }
}
