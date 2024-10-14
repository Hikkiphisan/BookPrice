//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new Book(12121,"Life of Pi",120.000,"Yann Martel");
        books[1] = new Book(2424,"The Alchemist",230.000,"Paulo Coelho");
        books[2] = new Book(122423121,"Harry Potter ",223.000,"J. K. Rowling");
        books[3] = new Book(12242121,"The Godfather",320.000,"Mario Puzo");
        books[4] = new Book(24,"To Kill A Mockingbird",410.000,"Harper Lee");
        books[5] = new Book(234,"Wonder",280.000,"R. J. Palacio");
        double sum = 0;
        for (Book book : books) {
            sum += book.getPrice();
        }
        System.out.printf("Tổng tiền: %.3f dong\n ", sum);
        System.out.println("May quyen co gia tren 200.000 dong: ");
        for (Book book : books) {
            if (book.getPrice() > 200.000) {
                System.out.println(book.getName());
            }
        }

    }
}