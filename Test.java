interface InterfaceOne {
    public void show(); 
}

interface InterfaceTwo {
    public void display();  
}

class A implements InterfaceOne, InterfaceTwo {
    @Override
    public void show() {
        System.out.println("show something");
    }

    @Override
    public void display() {
        System.out.println("display something");
    }
}

public class Test {
    public static void main(String[] args) {
        A a = new A(); 
        a.show();       
        a.display();   	
    }
}

