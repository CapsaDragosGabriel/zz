package pets;

public class Doggo extends  Pet implements Comparable{
    public Doggo(String spark, int i) {
        super(spark,i);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
