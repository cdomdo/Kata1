import java.time.LocalDate;

public class Kata1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2002, 6, 17);
        Person person = new Person("Carlos", date);
        System.out.println(String.format("%s tiene %d años.", person.getName(), person.getAge()));
    }
}
