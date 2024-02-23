package javadoc;

import java.util.ArrayList;
import java.util.List;


public class GestorPersonal {


    private List<Empleado> empleados;

    /**
     * Constructor de la clase gestorPersonal, crea una arrayList de empleados al iniciarse
     */
    public GestorPersonal() {
        empleados = new ArrayList<>();
    }

    /**
     *
     * @param empleado a añadir a la arrayList de empleados
     */
    public void contratar(Empleado empleado) {
        empleados.add(empleado);
    }

    /**
     *
     * @param String id con el valor del identificador del empleado a despedir
     * @return boolean especificando si se pudo despedir o no(segun si estaba en el array)
     */
    public boolean despedir(String id) {
        return empleados.removeIf(e -> e.getId().equals(id));
    }

    /**
     *
     * @param String id con el valor del identificador del empleado a aumentar el sueldo
     * @param double nuevoSueldo valor a actualizar el sueldo del empleado
     * @return boolean especificando si se pudo cambiar dicho sueldo a dicho empleado
     */
    public boolean cambiarSueldo(String id, double nuevoSueldo) {
        for (Empleado empleado : empleados) {
            if (empleado.getId().equals(id)) {
                empleado.setSueldo(nuevoSueldo);
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @return ArrayList<Empleado> con los empleados de la empresa en cuestion
     */
    public List<Empleado> getEmpleados() {
        return new ArrayList<>(empleados);
    }
}
