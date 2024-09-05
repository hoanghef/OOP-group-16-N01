public class NameNumber {
    private String name;
    private int number;

    public NameNumber(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String toString() {
        return "NameNumber{" + "name='" + name + '\'' + ", number=" + number + '}';
    }

    public static void main(String[] args) {
        NameNumber nn = new NameNumber("Park Eun Bin", 19920904);

        System.out.println(nn.toString());
    }
}
