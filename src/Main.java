public class Main {
    public static void main(String[] args) {

        Author pamuk = new Author("Orhan", "Pamuk");
        Author hemingway = new Author("Ernest", "Hemingway");

        Book snow = new Book("Snow", pamuk, 2015);
        Book forWhomTheBellTolls = new Book("For Whom the Bell Talls", hemingway, 2010);

        System.out.println(pamuk);
        System.out.println(hemingway);
        System.out.println(snow);
        System.out.println(forWhomTheBellTolls);

        forWhomTheBellTolls.setYearOfPublishing(2022);
        System.out.println(forWhomTheBellTolls.getYearOfPublishing());
    }
}