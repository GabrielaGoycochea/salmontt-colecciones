package Salmontt.CentroDeCultivo.Datos.Model;

public class CentrosDeCultivos {
    /**
     * Clase donde se guardan los datos de nombre, ubicacion y producción de cada centro de cultivo
     * de la empresa Salmott
     */

    //ATRIBUTOS
    private String nombre;
    private String ubicacion;
    private String producto;
    private int produccion;

    //SE GENERA EL CONSTRUCTOR

    public CentrosDeCultivos(String nombre, String ubicacion,String producto,int produccion){
        this.nombre=nombre;
        this.ubicacion=ubicacion;
        this.producto=producto;
        this.produccion=produccion;
    }

    //INICIAN LOS METODOS DE GET Y SET.

    /**
     * Metodos traen y muestran con @return la información.
     * Permite con set realizar modificaciones de ser necesarias.
     */
    public String getNombre(){return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getUbicacion() {return ubicacion;}
    public void setUbicacion(String ubicacion) {this.ubicacion = ubicacion;}

    public String getProducto() {return producto;}
    public void setProducto(String producto) {this.producto = producto;}

    public int getProduccion() {return produccion;}
    public void setProduccion(int produccion) {this.produccion = produccion;}


    //METODO TOSTRING
    /**
     * ToString permite llamar y mostrar los datos al usuario de manera legible.
     */
    @Override
    public String toString() {
        return "Información:"+"\nNombre: "+nombre+
                "\nUbicacion: " +ubicacion+"\nProducto: " +producto+"\nProduccion: "+produccion+" Toneladas \n";

    }
}
