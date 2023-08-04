package Zoom.SerilizationSimpleExamples;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public class Test2 extends Test1 implements Serializable {
    int b = 5;
    int c = 7;
    transient String[] abc = {"dasd", "adsd", "dsas"};
    private void writeObject(ObjectOutputStream oos)
            throws IOException {
        oos.defaultWriteObject();
        oos.writeObject(getName());
    }

    private void readObject(ObjectInputStream ois)
            throws ClassNotFoundException, IOException {
        ois.defaultReadObject();
        setName((String) ois.readObject());

    }

    @Override
    public String toString() {
        return "Test2{" +
                "b=" + b +
                ", c=" + c +
                ", abc=" + Arrays.toString(abc) +
                ", name='" + name + '\'' +
                '}';
    }
}
