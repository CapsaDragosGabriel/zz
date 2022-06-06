import java.util.Objects;

public class Rational implements Comparable {
    int numarator;
    int numitor;

   public Rational( int numarator,int numit)
   {
       if (numit==0) throw new ArithmeticException();
       this.numarator=numarator;
       this.numitor=numit;
   }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rational)) return false;
        Rational rational = (Rational) o;
        return (numarator/numitor)==(rational.numarator/rational.numitor);
    }

}
