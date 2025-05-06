package Adapter_Pattern;

public class PenAdapter implements Pen {
    Pencil pencil = new Pencil();

    @Override
    public void write(String str) {
        pencil.draw(str);
    }
}
