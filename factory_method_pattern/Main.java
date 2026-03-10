package factory_method_pattern;

public class Main {
    public static void main(String[] args) {
        Creator parser = new ExcellCreator();
        System.out.println( parser.parsefile("ata.xls"));
    }
}