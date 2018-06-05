package ejercicioTienda;

public class Tienda {

    String nombre;
    String direccion;
    String marca;
    String codigo;
    String tipo;
    Double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public Tienda(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Tienda(String marca, String codigo, String tipo, Double precio) {
        this.marca = marca;
        this.codigo = codigo;
        this.tipo = tipo;
        this.precio = precio;
    }
}
