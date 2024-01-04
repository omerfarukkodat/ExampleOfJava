package GenericMatrix;

import java.util.Objects;

public class Rational extends Number implements Comparable<Rational> {
    private long numerator;
    private long denomitor;

    public Rational(){
        this(0,1);
    }
    public Rational(long numerator , long denomitor){
        long gcd = gcd(numerator,denomitor);
        this.numerator = (denomitor>0 ? 1 : -1) * numerator / gcd;
        this.denomitor = Math.abs(denomitor) / gcd;
    }

    private static long gcd (long n , long d){
        long n1 = Math.abs(n);
        long n2 = Math.abs(d);
        int gcd = 1;

        for (int k=1; k<=n1 && k<=n2;k++){
            if (n1 % k ==0 && n2 % k ==0){
                gcd = k;
            }
        }
        return gcd;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenomitor() {
        return denomitor;
    }

    public Rational add(Rational secondRational){
        long n = numerator * secondRational.getDenomitor() + denomitor * secondRational.getNumerator();
        long d = denomitor * secondRational.getDenomitor();

        return new Rational(n,d);
    }

    public Rational subtract(Rational secondRational){
        long n = numerator * secondRational.getDenomitor() - denomitor * secondRational.getNumerator();
        long d = denomitor * secondRational.getDenomitor();

        return new Rational(n,d);
    }

    public Rational multiply(Rational secondRational){
        long n = numerator * secondRational.getNumerator();
        long d = denomitor * secondRational.getDenomitor();

        return new Rational(n,d);
    }
    public Rational divide(Rational secondRational){
        long n = numerator * secondRational.getDenomitor() ;
        long d = denomitor * secondRational.getNumerator();

        return new Rational(n,d);
    }

    @Override
    public String toString() {
        if (numerator == 0 || denomitor == 1) {
            return numerator + " ";
        }
        else {
            return numerator + "/" + denomitor;
        }

    }

    @Override
    public boolean equals(Object o) {
        if ((this.subtract((Rational)o)).getNumerator() ==0){
            return true;
        }
        else {
            return false;
        }

    }
    @Override
    public int hashCode() {
        return Objects.hash(numerator, denomitor);
    }

    @Override
    public int intValue() {
        return (int)doubleValue();
    }

    @Override
    public long longValue() {
        return (long)doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denomitor ;
    }

    @Override
    public int compareTo(Rational o) {
        if(this.subtract(o).getNumerator()>0){
            return 1;
        }
        else if(this.subtract(o).getNumerator()<0){
            return -1;
        }
        else{
            return 0;
        }

    }
}
