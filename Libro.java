public class Libro {
    private int id;
    private String titolo;

    public Libro(int id, String titolo) {
        this.id = id;
        this.titolo = titolo;
    }

    public int getId() {
        return id;
    }

    public String getTitolo() {
        return titolo;
    }

    @Override
    public String toString() {
        return "Libro: " + id + " - " + titolo;
    }
}

