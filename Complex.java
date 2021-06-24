class Complex {
    private double real;
    private double imag;

    // initialize real and imag
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // take a Complex object as argument
    // returns a Complex object
    
    public Complex add(Complex n2) {
        Complex temp = new Complex(0.0, 0.0);

        temp.real = this.real + n2.real;
        temp.imag = this.imag + n2.imag;

        return temp;
    }

    public static void main(String[] args) {
        Complex n1, n2, result;

        // create two Complex objects

        n1 = new Complex(2.9, 4.5);
        n2 = new Complex(4.5, 5.0);

        // add complex numbers

        result = n1.add(n2);

        System.out.println("Sum  = " + result.real + " + " + result.imag + "i");
    }
}