public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<Game> juegos = new DoublyLinkedList<>();
        juegos.insertFirst(new Game("Pikmin", "Nintendo"));
        juegos.insertLast(new Game("Astrobot", "Team Asobi"));
        juegos.insertLast(new Game("Cuphead", "Studio MDHR"));

        juegos.traverse();

        juegos.traverseBackward();

        System.out.println("Existe Pikmin: " + juegos.contains(new Game("Pikmin", "Nintendo")));
        juegos.remove(new Game("Pikmin", "Nintendo"));

        juegos.traverse();
        juegos.traverseBackward();
    }
}