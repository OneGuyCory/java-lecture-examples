package class07;

import class07.books.Book;
import class07.books.UsedBook;
import class07.merchandise.Apparel;
import class07.merchandise.Drinkware;

public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("Pride and Prejudice", "This timeless classic showcases Austen's wit and winsome characters", 12.49, 6, "Jane Austen", "Romantic Fiction", "Paperback");
        Book book2 = new Book("The Fellowship of the Ring", "The first book of the Lord of the Rings trilogy", 18.99, 3, "JRR Tolkien", "Fantasy Fiction", "Hardcover");
        UsedBook usedBook1 = new UsedBook("Fahrenheit 451", "A masterpiece of dystopian storytelling", 6.50, 1, "Ray Bradbury", "Dystopian Fiction", "Hardcover", "Good");
        UsedBook usedBook2 = new UsedBook("A Pocket Full of Rye", "Miss Marple does it again with this twisty murder mystery", 4.75, 1, "Agatha Christie", "Mystery Fiction", "Paperback", "Fair");
        Drinkware mug = new Drinkware("Ahsoka Mug", "Have coffee with Ahsoka every day!", 13.99, 3, "Mugs", "Star Wars", "Ceramic", 15);
        Drinkware tumbler = new Drinkware("The Little Mermaid Tumbler", "Keep cool with one of Ariel's newfangled contraptions", 16.49, 2, "Tumblers", "Disney", "Metal", 24);
        Apparel hat = new Apparel("Captain America Hat", "Feel like a supersoldier in this classic hat with Captain America's shield", 19.99, 5, "Hats", "Marvel", new String[]{"OS"}, new String[]{"navy", "gray"});
        Apparel tShirt = new Apparel("Batman T-shirt", "Don the classic Batman logo with this minimalist design", 24.49, 4, "T-Shirts", "DC", new String[]{"XS", "S", "M", "L", "XL"}, new String[]{"black"});


        // TODO: Create a UsedBook of type Book, try to check its condition, and then cast it to UsedBook to try again



        // TODO: Test both percent discounts and flat discounts on an Apparel object and a UsedBook object

    }

}
