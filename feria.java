import java.util.ArrayList;

public class feria {

    ArrayList<caseta> caseArrayList= new ArrayList<>();

    //metodos
    public void añadirCaseta(caseta caseta){
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

