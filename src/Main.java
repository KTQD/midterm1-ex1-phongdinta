public class Main {
    public static void main(String[] args) {
        MP3 mp3 = new MP3("Love story", "This is a song about love", "MP3-001", 100 , 300);

        Book book = new Book("I am gifted, so are you!", "Share about author's experience", "BOOK-001", 50, "Adam Khoo", 400, "Psychology");

        System.out.println("MP3 Information:");
        mp3.showInfo();

        System.out.println("\nBook Information:");
        book.showInfo();
    }
}
