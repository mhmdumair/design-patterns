package Adapter_Pattern;

public class School {
    public static void main(String args[]){
        Pen pen = new  PenAdapter();
        Assignment assignment = new Assignment();
        assignment.setPen(pen);
        assignment.doAssignment("This is my new Assignment");
    }
}
