package LeTranTrungHieu_2793.Assignment8.Ex3;

public class Report implements Printable {

    private String title;

    public Report(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Report title: " + title);
    }
}
