public class Main {
    public static void main(String[] args) {
        LibroDAO dao = new LibroDAO();

        dao.aggiungiLibro(new Libro(1, "Il Signore degli Anelli"));
        dao.aggiungiLibro(new Libro(2, "Harry Potter"));

        System.out.println("Tutti i libri:");
        List<Libro> lista = dao.getTuttiLibri();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("\nCerco il libro con ID 2:");
        Libro trovato = dao.trovaLibro(2);
        if (trovato != null) {
            System.out.println(trovato);
        } else {
            System.out.println("Libro non trovato");
        }

        dao.rimuoviLibro(1);
        System.out.println("\nDopo la rimozione:");
        lista = dao.getTuttiLibri();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }
}
