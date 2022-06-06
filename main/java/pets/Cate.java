package pets;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Cate extends  Pet implements Comparable{
    public Cate(String name, int age) {
        super(name, age);
    }
    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
