class Mobile {
    String brand;
    int price;
    static String name; 

    public void show() {
        System.out.println(brand + ":" + name + ":" + price);
    }
}

public class Demo {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 150000;
        Mobile.name = "Smartphone"; 

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 200000;
        Mobile.name = "Smartphone";  

        obj1.show(); 
        obj2.show();  
    }
}

