package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Grupo {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////// variables ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public String nombre;
    public Categoria categoria;
    public Collection<Contacto> contactos;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////// Constructor //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Grupo(String nombre, Categoria categoria){
        this.nombre=nombre;
        this.categoria=categoria;
        contactos = new LinkedList<>();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////// Metodos //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    /*
     * Metodo que permite agregar un contacto al grupo
     * @param contacto
     */
    public void agregarContacto(Contacto contacto){
        if(contactos.size() < 5){
            if(!verificarContactos(contacto.getNombre(), contacto.getTelefono())){
                contactos.add(contacto);
            }
            else{
                System.out.println("el contacto "+contacto.getNombre()+" no se agrego pues ya existe");
            }
        }
        else{
            System.out.println("no se agrego el contacto "+ contacto.getNombre()+" pues excede el numero de contactos en la lista");
        }
    }

    /*
     * Metodo que permite verificas que contactos existen en el grupo
     * @param nombre, telefono
     * @return bandera
     */
    public boolean verificarContactos(String nombre, String telefono){
        boolean bandera = false;
        for (Contacto contacto : contactos) {
            if(contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)){
                bandera = true;
            }
        }
        return bandera;
    }

    /*
     * Metodo que eliminar un contacto
     * @param contacto
     * @return mensaje
     */
    public void eliminarContacto(Contacto contacto){
        contactos.remove(contacto);
    }

    /*
     * Metodo que permite obtener un contacto
     * @return mensaje
     */
    public String obtenerContactos(){
        String mensaje = "los contactos son: /n";
        for (Contacto contacto : contactos) {
            mensaje += "el nombre "+contacto.getNombre() + " con telefono "+contacto.getTelefono();
        }
        return mensaje;

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////// Getters y setters //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Collection<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Collection<Contacto> contactos) {
        this.contactos = contactos;
    }

    @Override
    public String toString() {
        return "Grupo [nombre=" + nombre + ", categoria=" + categoria + ", contactos=" + contactos + "]";
    }



}
