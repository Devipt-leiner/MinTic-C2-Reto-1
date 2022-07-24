public class BecaUniversitaria {
    // ATRIBUTOS
    private int pTiempo;
    private double pMonto;
    private double pInteres;

    // CONSTRUCTORES
    public BecaUniversitaria(int pTiempo, double pMonto, double pInteres) {
        this.pTiempo = pTiempo;
        this.pMonto = pMonto;
        this.pInteres = pInteres;
    }

    public BecaUniversitaria() {
        this.pTiempo = 0;
        this.pMonto = 0.0;
        this.pInteres = 0.0;
    }

    // ACCIONES / MÉTODOS
    public String compararInversion(int pTiempo, double pMonto, double pInteres) {
        return "";
    }

    public String compararInversion() {
        return "";
    }

    public double calcularInteresSimple() {
        double interesSimple = pMonto * (pInteres/100) * pTiempo;
        return interesSimple;
    }

    public double calcularInteresCompuesto() {
        return 0.0;
    }
}
