import java.util.ArrayList;

public class Kunde {
    private String name;
    private ArrayList<Notebook> notebooks;

    public Kunde(String name) {
        this.name = name;
        this.notebooks = new ArrayList<>();
    }

    public void addNotebook(Notebook nb) {
        notebooks.add(nb);
    }

    public void removeNotebook(Notebook nb) {
        notebooks.remove(nb);
    }

    @Override
    public String toString() {
        ArrayList<String> names = new ArrayList<>();
        for (Notebook nb : notebooks) {
            names.add(nb.toString());
        }
        return "Kunde: " + name + ", Notebooks=" + names + ")";
    }
}

