package Adapter_Pattern;

public class Assignment {
    private Pen pen;
    public void doAssignment(String str){
        pen.write(str);
    }

    public void setPen(Pen pen) {
        this.pen = pen;
    }
}
