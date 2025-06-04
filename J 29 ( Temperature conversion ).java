abstract class Temp {
    public abstract void setTempData(double tem);
    public abstract void changeTemp();
}

class Cel extends Temp {
    double temp;

    public void setTempData(double a) {
        temp = a;
    }

    public void changeTemp() {
        // Fahrenheit to Celsius
        double c = (5.0 / 9.0) * (temp - 32.0);
        System.out.println("Fahrenheit to Celsius: " + c);
    }
}

class Far extends Temp {
    double temp;

    public void setTempData(double a) {
        temp = a;
    }

    public void changeTemp() {
        // Celsius to Fahrenheit
        double f = (9.0 / 5.0) * temp + 32.0;
        System.out.println("Celsius to Fahrenheit: " + f);
    }
}

public class Test {
    public static void main(String[] args) {
        Temp t1 = new Cel();  // converting from Fahrenheit to Celsius
        t1.setTempData(100.0);
        t1.changeTemp();

        Temp t2 = new Far();  // converting from Celsius to Fahrenheit
        t2.setTempData(37.0);
        t2.changeTemp();
    }
}
