import java.util.List;

public interface InterfacciaLibri {
    void aggiungiLibro(Libro libro);
    void rimuoviLibro(int id);
    Libro trovaLibro(int id);
    List<Libro> getTuttiLibri();
}


