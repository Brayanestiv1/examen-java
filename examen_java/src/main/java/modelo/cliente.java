package modelo;

public class cliente {
   
    private String id;
    private String nombre;
    private String representante;
    private String correo;
    private Bigint telefono;
    private String direccion;
    private Enum sector;

    public cliente() {}

    public cliente( String id, String nombre, String representante, String correo, Bigint telefono, String direccion, Enum sector) {
       
        this.id = id;
        this.nombre = nombre;
        this.representante = representante;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sector = sector;
    }

    public String getid() { return id; }
    public void setid(String id) { this.id = id; }

    public String getnombre() { return nombre; }
    public void setnombre(String nombre) { this.nombre = nombre; }

    public String getrepresentante() { return representante; }
    public void setrepresentante(String representante) { this.representante = representante; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }
    
    public Bigint gettelefono() { return telefono; }
    public void settelefono(Bigint telefono) { this.telefono = telefono; }
    
    public String getdireccion() { return direccion; }
    public void setdireccion(String direccion) { this.direccion = direccion; }
    
    public Enum getsector() { return sector; }
    public void setsector(Enum direccion) { this.sector = sector; }

      @Override
      public String toString() {
            return "Cliente{" +  " id=" + id +
                    ", nombre=" + nombre +
                    ", representante=" + representante +
                    ", correo=" + correo +
                    ", telefono=" + telefono +
                    ", direccion=" + direccion +
                    ", sector=" + sector +'}';
      }

    private static class Bigint {

        public Bigint() {
        }
    }
    
    
}