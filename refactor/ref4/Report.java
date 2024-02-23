package refactor.ref4;

/*
Extraer la impresión del título y conclusión en sus propios métodos.
 */
class Report {

    void printReport() {
        // imprimir título
        imprimirTitulo();

        // contenido del reporte
        contenido();
        // más contenido...
        masContenido();
        // imprimir conclusión
        conclusion();
    }

    public void imprimirTitulo() {
        System.out.println("Título del Reporte");
    }

    public void contenido() {
        System.out.println("Contenido 1...");
    }

    public void masContenido() {
        System.out.println("Contenido 2...");
    }

    public void conclusion() {
        System.out.println("Conclusión del Reporte");
    }
}
