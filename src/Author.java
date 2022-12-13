public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {//создаю конструктор класса Author
        this.name = name;
        this.surname = surname;
    }

    public String getName() {//создаю геттер для имени
        return this.name;
    }

    public String getSurname() {//создаю геттер для фамилии
        return this.surname;
    }

    @Override//переопределила метод toString из класса Object
    public String toString() {
        return this.name + " " + this.surname;
    }
}
