import java.util.HashSet;
import java.util.Set;

public class NotebookTyp {
    private String name;
    private Set<AusstattungsteilTyp> kompatibleAusstattung;

    public NotebookTyp(String name) {
        this.name = name;
        this.kompatibleAusstattung = new HashSet<>();
    }

    public void addKompatibleAusstattung(AusstattungsteilTyp typ) {
        kompatibleAusstattung.add(typ);
    }

    public void removeKompatibleAusstattung(AusstattungsteilTyp typ) {
        kompatibleAusstattung.remove(typ);
    }

    public boolean isKompatibel(AusstattungsteilTyp typ) {
        return kompatibleAusstattung.contains(typ);
    }

    public String getName() {
        return name;
    }
}
