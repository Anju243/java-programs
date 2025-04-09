class Persons {
    String name;
    int phone; 
    public void showAddress() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }
}

class Teachers extends Persons {
}

class Students extends Persons {
}

class Staff extends Persons {
}

public class Mainclasss {
    public static void main(String[] args) {
        Teachers t1 = new Teachers();
        t1.name = "John";
        t1.phone = 6789; 
        t1.showAddress();

        Students st1 = new Students();
        st1.name = "Aparna";
        st1.phone = 6789;
        st1.showAddress();

        Staff s1 = new Staff();
        s1.name = "Aswin";
        s1.phone = 799;
        s1.showAddress();
    }
}

