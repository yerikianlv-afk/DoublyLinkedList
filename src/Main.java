public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Movie> movies = new DoublyLinkedList<>();
        movies.insertLast(new Movie("Inception", "Christopher Nolan", 2010));
        movies.insertLast(new Movie("Coco", "Lee Unkrich", 2017));
        movies.insertFirst(new Movie("Parasite", "Bong Joon-ho", 2019));

        System.out.println("Recorrido normal:");
        movies.traverse();

        System.out.println("Recorrido hacia atrás:");
        movies.traverseBackward();
    }
}