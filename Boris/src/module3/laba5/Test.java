package module3.laba5;


public class Test {
    public static void main(String[] args) {
        WorkWithDB workWithDB = new WorkWithDB();
        workWithDB.addRecording("2011-05-11", 3, 55200);
        System.out.println(workWithDB.seeTable());
        workWithDB.deleteLastRecording();
    }
}
