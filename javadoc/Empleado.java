package javadoc;

public class Empleado {
    // Atributos de la clase
    private String nombre;
    private String id;
    private double sueldo;


    /**
     * Constructor de la clase empleado
     * @param String con el valor de variable nombre
     * @param String con el valor de id
     * @param double sueldo con el valor de variable sueldo
     */
    public Empleado(String nombre, String id, double sueldo) {
        this.nombre = nombre;
        this.id = id;
        this.sueldo = sueldo;
    }


    /**
     *
     * @return String con el valor de nombre
     */
    public String getNombre() {
        return nombre;
    }


    /**
     *
     * @param String nombre con valor a asignar por nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    /**
     *
     * @return String con el valor del ID
     */
    public String getId() {
        return id;
    }


    /**
     *
     * @return double con el valor del sueldo
     */
    public double getSueldo() {
        return sueldo;
    }


    /**
     *
     * @param double sueldo con el valor a asignar a sueldo
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }


    /**
     *
     * @param double incremento con el valor a añadir a sueldo
     */
    public void incrementarSueldo(double incremento) {
        this.sueldo += incremento;
    }

    /**
     *
     * @return String con los datos de la clase en formato de String
     */
    @Override
    public String toString() {
        return "javadoc.Empleado{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}
