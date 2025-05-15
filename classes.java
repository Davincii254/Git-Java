// Implicit Casting
public class implicitCasting  {
    public static void main(String [] args) {
        int a = 42;
        double b = a; 
        System.out.println("IMplicint Casting :" + b);
    }
}

// Explicit Casting
public class ExplicitCasting  {
    public static void main(String [] args) {
        double pi = 3.142357; 
        int roundedPi = (int) pi;
        System.out.println("EXplicit Casting Casting :" + roundedPi);
    }
}

// EXplicit casting in strings
public class ExplicitCasting  {
    public static void main(String [] args) {
        String ageStr = "25"; 
        int age = Integer.parseInt(ageStr);

        String priceStr = "12.90";
        double price = Double.parseDouble(priceStr);


        System.out.println("Age + 5 =" + (age + 5));
        System.out.println("TotalPrice with Tax :" + (price * 1.15));
    }
}

// Increament and Decreament
public class incrementDecreament  {
    public static void main(String [] args) {
        int a = 10;
        int b = a++;
        int c = ++a;


        System.out.println("A :" + a);
        System.out.println("B :" + b);
        System.out.println("C :" + c);

    }
}

// sHORT CIRCUIT Using AND
public class ShortCircuitAnd {
    public static void main(String[] args) {
        int x = 2;
        if (x < 3 && x / 0 == 1) { 
            System.out.println("True");
        } else {
            System.out.println("False (no crash)");
        }
    }
}


// Using OR
public class ShortCircuitOr {
    public static void main(String[] args) {
        String name = null;
        if (name == null || name.length() > 0) { // doesn't call name.length()
            System.out.println("Name is null or has no content");
        }
    }
}

// Type Promotion
public class promotion {
    public static void main(String[] args) {
        int x = 100;
        double y = 3.5;

// convert x into a double before the expression 
        double result = x * y;
        System.out.println("result :" + result);

    }
}
