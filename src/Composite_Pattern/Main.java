package Composite_Pattern;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("lap.png");
        File file2 = new File("Assignment.txt");

        Folder personal = new Folder("personal");
        personal.add(file1);
        personal.add(file2);

        File file3 = new File("readme.md");

        Folder outer = new Folder("Outer");
        outer.add(personal);
        outer.add(file3);

        outer.showDetails();
    }
}
