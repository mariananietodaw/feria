
public class caseta {
     private int numero;
    private String calle;               
    private String nombre;
    private int tamano;     
    private String categoria;

    // Constructor
    public caseta(int numero, String calle, String nombre, int tamano, String categoria) {
        this.numero = numero;
        this.calle = calle;
        this.nombre = nombre;
        this.tamano = tamano;
        this.categoria = categoria;
    }

    // Getters
    public int getNumero() {
        return numero;
    }

    public String getCalle() {
        return calle;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public String getCategoria() {
        return categoria;
    }

    // Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    // toString method
    @Override
    public String toString() {
        return "Caseta{" +
                "numero=" + numero +
                ", calle='" + calle + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tamano=" + tamano +
                ", categoria='" + categoria + '\'' +
                '}';
    }

}
