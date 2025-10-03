public class Ausstattungsteil {
    private String name;
    private AusstattungsteilTyp typ;

    public Ausstattungsteil(String name, AusstattungsteilTyp typ) {
        this.name = name;
        this.typ = typ;
    }

    public AusstattungsteilTyp getTyp() {
        return typ;
    }

    public String getName() {
        return name;
    }
}
