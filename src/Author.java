import java.util.Objects;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {//создаю конструктор класса Author
        this.name = name;
        this.surname = surname;
    }

    public String getName() {//создаю геттер для имени
        return name;
    }

    public String getSurname() {//создаю геттер для фамилии
        return surname;
    }

    @Override//переопределила метод toString из класса Object руками
    public String toString() {
        return name + " " + surname;
    }

    @Override//создала автоматически через alt+insert
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Author author = (Author) obj;
        return name.equals(author.name) && surname.equals(author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

}
