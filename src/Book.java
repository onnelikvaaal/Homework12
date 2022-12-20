import java.util.Objects;

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
        return bookName;
    }

    public Author author() {//создаю геттер для автора
        return author;
    }

    public int getYearOfPublishing() {//создаю геттер для года публикации
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {//создаю сеттер для года публикации
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override//переопределила метод toString из класса Object руками
    public String toString() {
        return bookName + " written by " + author.toString() + " year of publishing " + yearOfPublishing;
    }

    @Override//создала автоматически через alt+insert
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookName.equals(book.bookName) && author.equals(book.author) && yearOfPublishing == book.yearOfPublishing;
    }

    @Override//создала автоматически через alt+insert
    public int hashCode() {
        return Objects.hash(bookName, author, yearOfPublishing);
    }
}

