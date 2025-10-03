import java.util.ArrayList;


public class Notebook {
    private String name;
    private NotebookTyp typ;
    private ArrayList<Ausstattungsteil> ausstattung;

    public Notebook(String name, NotebookTyp typ) {
        this.name = name;
        this.typ = typ;
        this.ausstattung = new ArrayList<>();
    }

    public void addAusstattung(Ausstattungsteil teil) {
        if (typ.isKompatibel(teil.getTyp())) {
            ausstattung.add(teil);
            System.out.println("Erfolg hinzugefuegt!");
        } else {
            System.out.println("Fehler beim Hinzufuegen");
        }
    }

    public void removeAusstattung(Ausstattungsteil teil) {
        if (ausstattung.remove(teil)) {
            System.out.println("Erfolg entfernt!");
        } else {
            System.out.println("Fehler beim Loeschen");
        }
    }

    @Override
    public String toString() {
        ArrayList<String> names = new ArrayList<>();
        for (Ausstattungsteil a : ausstattung) {
            names.add(a.getName());
        }
        return "Notebook(" + name + ", Typ=" + typ.getName() + ", Ausstattung=" + names + ")";
    }

}

