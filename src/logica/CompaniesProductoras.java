package logica;

public class CompaniesProductoras {
    private String nombre = "";
    private String numeroRFC;
    private String telefono;

    public CompaniesProductoras(String nombre, String numeroRFC, String telefono ) {

        //Esta seria la validacion de nombre unico
        //validarNombreUnico(nombre);
        this.nombre = nombre;
        this.numeroRFC = numeroRFC;
        this.telefono = telefono;
    }

    /*public  boolean validarNombreUnico(String nombre ) {
        if (this.nombre.equals(nombre)) {
            System.out.println("E R R O R \n NO SE PERMITEN NOMBRES IGUALES EN LAS COMPANIES PRODUCTORAS");
            System.out.println(nombre);
            return true;
        } else {
            return false;
        }
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroRFC() {
        return numeroRFC;
    }

    public void setNumeroRFC(String numeroRFC) {
        this.numeroRFC = numeroRFC;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "CompaniesProductoras{" +
                "nombre='" + nombre + '\'' +
                ", numeroRFC='" + numeroRFC + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
