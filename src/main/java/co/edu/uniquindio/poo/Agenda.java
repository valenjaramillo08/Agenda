package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;


public class Agenda {
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////// variables ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public Collection<Contacto> contactos;
    public Collection<Grupo> grupos;
    public Collection<Reunion> reuniones;

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////// Constructor //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    
    public Agenda(){
        contactos = new LinkedList<>();
        grupos = new LinkedList<>();
        reuniones = new LinkedList<>();
    }

     ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////// Metodos //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    /*
     * Metodo que permite crear un contacto
     * @param Contacto
     */
    public void crearContacto(Contacto contacto){
        if(!verificarContactos(contacto.getNombre(), contacto.getTelefono())){
            contactos.add(contacto);
        }
        else{
            System.out.println("El contacto ya existe");
        }
    }

    /**
     * Metodo que verifica si el contacto ya existe
     * @param nombre
     * @param telefono
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

    /**
     * Metodo que verifica si el grupo ya existe
     * @param nombre
     * @param categoria
     * @return bandera
     */
    public boolean verificarGrupos(String nombre, Categoria categoria){
        boolean bandera = false;
        for (Grupo grupo : grupos) {
            if(grupo.getNombre().equals(nombre) && grupo.getCategoria().equals(categoria)){
                bandera = true;
            }
        }
        return bandera;
    }

    /**
     * Metodo que verifica si la reunion
     * @param descripcion
     * @param fecha
     * @return bandera
     */
    public boolean verificarReuniones(String descripcion, String fecha){
        boolean bandera= false;
        for (Reunion reunion : reuniones) {
            if (reunion.getDescripcion().equals(descripcion) && reunion.getFecha().equals(fecha)) {
                bandera= true;
                
            }
        }
        return bandera;
    }
    /*
     * Metodo que permite modificar un contacto
     * @param nombre
     * @alias 
     * @direccion 
     * @telefono 
     * @email
     * 
     */
    public void modificarContacto(String nombre, String alias, String direccion, String telefono, String email){
        if(verificarContactos(nombre, telefono)){
            for (Contacto contacto : contactos) {
                if(contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)){
                    contacto.setNombre(nombre);
                    contacto.setAlias(alias);
                    contacto.setDireccion(direccion);
                    contacto.setTelefono(telefono);
                    contacto.setEmail(email);
                }
            }
        }
        else{
            System.out.println("El contacto no existe para modificarlo");
        }
    }

    
    /*
     * Metodo que permite modificar un grupo
     * @param nombre, categoria
     */
    public void modificarGrupo(String nombre, Categoria categoria){
        if(verificarGrupos(nombre, categoria)){
            for (Grupo grupo : grupos) {
                if(grupo.getNombre().equals(nombre) && grupo.getCategoria().equals(categoria)){
                    grupo.setNombre(nombre);
                    grupo.setCategoria(categoria);
                
                }
            }
        }
        else{
            System.out.println("El grupo no existe para modificarlo");
        }
    }

    /*
     * Metodo que permite modificar una reunion
     * @param descripcion 
     * @categoria
     */
    public void modificarReunion(String descripcion, String fecha){
        if(verificarReuniones(descripcion, fecha)){
            for (Reunion reunion : reuniones) {
                if(reunion.getDescripcion().equals(descripcion) && reunion.getFecha().equals(fecha)){
                    reunion.setDescripcion(descripcion);
                    reunion.setFecha(fecha);
                
                }
            }
        }
        else{
            System.out.println("La reunion no existe para modificarlo");
        }
    }


    /*
     * Metodo que permite eliminar un contacto
     */
    public void eliminarContacto(Contacto contacto) {
        contactos.remove(contacto);
    }

    /*
     * Metodo que permite crear un grupo
     */
    public void crearGrupo(Grupo grupo){
        grupos.add(grupo);
    }

    /*
     * Metodo que permite eliminar un grupo
     * @param grupo
     */
    public void eliminarGrupo(Grupo grupo) {
        grupos.remove(grupo);
    }

    /*
     * Metodo que permite crear una reunion
     * @param reunion
     */
    public void crearReunion(Reunion reunion){
        reuniones.add(reunion);
    }

    /*
     * Metodo que permite eliminar una reunion
     * @param reunion
     */
    public void eliminarReunion(Reunion reunion){
        reuniones.remove(reunion);
    }


    public Collection<Contacto> getContactos() {
        return contactos;
    }

    public void setContactos(Collection<Contacto> contactos) {
        this.contactos = contactos;
    }

    public Collection<Grupo> getGrupos() {
        return grupos;
    }

    public void setGrupos(Collection<Grupo> grupos) {
        this.grupos = grupos;
    }

    public Collection<Reunion> getReuniones() {
        return reuniones;
    }

    public void setReuniones(Collection<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    @Override
    public String toString() {
        return "Agenda [contactos=" + contactos + ", grupos=" + grupos + ", reuniones=" + reuniones + "]";
    }


}

