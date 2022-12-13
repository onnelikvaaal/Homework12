public class Book {

    private String bookName;
    private Author author;
    int yearOfPublishing;

    public Book(String bookName, Author author, int yearOfPublishing) {//создаю конструктор для класса Book
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getBookName() {//создаю геттер для названия книги
        return this.bookName;
    }

    public Author author() {//создаю геттер для автора
        return this.author;
    }

    public int getYearOfPublishing() {//создаю геттер для года публикации
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {//создаю сеттер для года публикации
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override//переопределила метод toString из класса Object
    public String toString() {
        return this.bookName + " written by " + this.author.toString() + " year of publishing " + this.yearOfPublishing;
    }
}
