package Composite_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem{
    private String name;
    List<FileSystemItem> files = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        files.add(item);
    }
    public void remove(FileSystemItem item) {
        files.remove(item);
    }
    @Override
    public void showDetails() {
        System.out.println(name);
        for (FileSystemItem item:files){
            item.showDetails();
        }
        System.out.println();
    }
}
