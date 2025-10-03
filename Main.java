//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Meta-Ebene
        NotebookTyp t16s = new NotebookTyp("ThinkPad T16s");
        NotebookTyp macbook = new NotebookTyp("MacBook Pro");

        AusstattungsteilTyp dockingLenovo = new AusstattungsteilTyp("Lenovo Dockingstation");
        AusstattungsteilTyp ram8gb = new AusstattungsteilTyp("8GB RAM Erweiterung");
        AusstattungsteilTyp dockingMac = new AusstattungsteilTyp("MacBook Dockingstation");

        t16s.addKompatibleAusstattung(dockingLenovo);
        t16s.addKompatibleAusstattung(ram8gb);
        macbook.addKompatibleAusstattung(dockingMac);
        macbook.addKompatibleAusstattung(ram8gb);


        //Instanz
        Notebook nb1 = new Notebook("NB1", t16s);
        Notebook nb2 = new Notebook("NB2", macbook);

        Ausstattungsteil dock1 = new Ausstattungsteil("Dockingstation1", dockingLenovo);
        Ausstattungsteil ram1 = new Ausstattungsteil("RAM1", ram8gb);
        Ausstattungsteil dock2 = new Ausstattungsteil("Dockingstation2", dockingMac);

        nb1.addAusstattung(dock1);
        nb1.addAusstattung(ram1);
        nb1.addAusstattung(dock2); // Fehler

        nb2.addAusstattung(dock2);
        nb2.addAusstattung(ram1);

        // Kunde bestellt Notebooks direkt
        Kunde kunde1 = new Kunde("Max Mustermann");
        kunde1.addNotebook(nb1);
        kunde1.addNotebook(nb2);

        // Ausgabe
        System.out.println(kunde1);
    }
}