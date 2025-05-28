import java.util.ArrayList;
import java.util.List;

public class LibroDAO implements InterfacciaLibri {
    private List<Libro> listaLibri = new ArrayList<>();

    @Override
    public void aggiungiLibro(Libro libro) {
        listaLibri.add(libro);
    }

    @Override
    public void rimuoviLibro(int id) {
        // Ciclo classico per trovare e rimuovere
        for (int i = 0; i < listaLibri.size(); i++) {
            if (listaLibri.get(i).getId() == id) {
                listaLibri.remove(i);
                break;
            }
        }
    }

    @Override
    public Libro trovaLibro(int id) {
        for (int i = 0; i < listaLibri.size(); i++) {
            if (listaLibri.get(i).getId() == id) {
                return listaLibri.get(i);
            }
        }
        return null;
    }

    @Override
    public List<Libro> getTuttiLibri() {
        return listaLibri;
    }
}


