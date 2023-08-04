package Zoom.SerilizationSimpleExamples;

import java.io.*;

public class CustomObject implements Externalizable {
    @Serial
    private static final long serialVersionUID = 1;
    int a = 5;
    int bb = 12;

    public int getBb() {
        return bb;
    }

    public void setBb(int bb) {
        this.bb = bb;
    }

    @Override
    public String toString() {
        return "CustomObject{" +
                "a=" + a +
                ", bb=" + bb +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(bb);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.bb = in.readInt();
    }

}
