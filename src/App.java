public class App {
    public static void main(String[] args) throws Exception {
        BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
        System.out.println(becaUniversitaria.calcularInteresSimple());
        System.out.println(becaUniversitaria.calcularInteresCompuesto());
        System.out.println(becaUniversitaria.compararInversion(60,13000,1.4));
	
        BecaUniversitaria becaUniversitaria2 = new BecaUniversitaria(48,10000,2.0);
        System.out.println(becaUniversitaria2.calcularInteresSimple());
        System.out.println(becaUniversitaria2.calcularInteresCompuesto());
        System.out.println(becaUniversitaria2.compararInversion());

        BecaUniversitaria becaUniversitaria2b = new BecaUniversitaria();
        System.out.println(becaUniversitaria2b.calcularInteresSimple());
        System.out.println(becaUniversitaria2b.calcularInteresCompuesto());
        System.out.println(becaUniversitaria2b.compararInversion());
    }
}