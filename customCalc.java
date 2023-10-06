class invaldInputException extends Exception {
    @Override
    public String toString() {
        return "Error: Enter a valid number 8 & 9 are not accepted";
    }
}

class notDivideZeroException extends Exception {
    @Override
    public String toString() {
        return "Error: Cannot divide by 0";
    }
}

class maxNum extends Exception {
    @Override
    public String toString() {
        return "Error: Max input limit reached(100000)";
    }
}

class maxMulti extends Exception {
    @Override
    public String toString() {
        return "Error: Max multiplication input limit reached(7000)";
    }
}

class customCalculator {
    double addition(double a, double b) throws invaldInputException, maxNum {
        if(a > 100000 || b > 100000) {
            throw new maxNum();
        }
        if (a == 8 || b == 9) {
            throw new invaldInputException();
        }
        return a + b;
    }

    double subtraction(double a, double b) throws maxNum {
        if(a > 100000 || b > 100000) {
            throw new maxNum();
        }
        return a - b;
    }

    double multiplication(double a, double b) throws maxMulti {
        if(a > 7000 || b > 7000) {
            throw new maxMulti();
        }
        return a * b;
    }

    double divison(double a, double b) throws notDivideZeroException, maxNum {
        if(a > 100000 || b > 100000) {
            throw new maxNum();
        }
        if (b == 0) {
            throw new notDivideZeroException();
        }
        return a / b;
    }
}

public class customCalc {
    public static void main(String[] args) throws invaldInputException, notDivideZeroException, maxNum, maxMulti {
        customCalculator c = new customCalculator();

        System.out.println(c.addition(5, 4));
        System.out.println(c.subtraction(5, 4));
        System.out.println(c.multiplication(5, 4));
        System.out.println(c.divison(5, 5));
    }
}