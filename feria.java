import java.util.ArrayList;
package gestiondeferiadessevilla;

public class feria {
    private String nombre;
    private ArrayList<caseta> caseArrayList= new ArrayList<>();

    public feria(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //metodos
    public void añadirCaseta(caseta caseta){
        int numeroCaseta;
        String calleCaseta;
        String nombreCaseta;
        int tamanoCaseta;
        String categoriaCaseta;

        SYSTEM.out.println("Introduce el número de la caseta:");
        numeroCaseta = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        SYSTEM.out.println("Introduce la calle de la caseta:");
        calleCaseta = scanner.nextLine();
        SYSTEM.out.println("Introduce el nombre de la caseta:");
        nombreCaseta = scanner.nextLine();
        SYSTEM.out.println("Introduce el tamaño de la caseta:");
        tamanoCaseta = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        SYSTEM.out.println("Introduce la categoría de la caseta (pública o privada):");
        categoriaCaseta = scanner.nextLine();
        caseta caseta = new caseta(numeroCaseta, calleCaseta, nombreCaseta, tamanoCaseta, categoriaCaseta);
        
        
        caseArrayList.add(caseta);
    }
    public void mostrarCasetas(){
        for (caseta c: caseArrayList) {
            System.out.println(c);
        }
    }
    public ArrayList<caseta> buscarPorCategoria(String categoria){
        ArrayList<caseta> resultado = new ArrayList<>();
        for (caseta c: caseArrayList) {
            if (c.getCategoria().equalsIgnoreCase(categoria)) {
                resultado.add(c);
            }
        }
        return resultado;
    }
    public void mostrarPorCapacidad(int capacidad) {
        for (caseta c : caseArrayList) {
            if (c.getTamano() > capacidad) {
                System.out.println(c);
            }
        }
    } 
    public void eliminarCaseta(int numero, String calle) {
        caseta casetaAEliminar = null;
        for (caseta c : caseArrayList) {
            if (c.getNumero() == numero && c.getCalle().equalsIgnoreCase(calle)) {
                casetaAEliminar = c;
                break;
            }
        }
        if (casetaAEliminar != null) {
            caseArrayList.remove(casetaAEliminar);
            System.out.println("Caseta eliminada: " + casetaAEliminar);
        } else {
            System.out.println("No se encontró la caseta con número " + numero + " y calle " + calle);
        }
    }
}

