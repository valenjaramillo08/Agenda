package co.edu.uniquindio.poo;

public class App {
    
    public static void main(String[] args) {
        // Contacto
        Contacto contacto1 = new Contacto("Valentina", "val", "torres del prado", "318282", "valen@");
        Contacto contacto2 = new Contacto("Valentina", "mat", "torres del prado", "318281", "mat@");
        Contacto contacto3 = new Contacto("esteba", "valencia", "villa hermosa", "31845412", "estebanvb@");
        Contacto contacto4 = new Contacto("juan", "arias", "ciudad dorada", "31845282", "juanar@");
        Contacto contacto5 = new Contacto("leonel", "messi", "colinas", "315421282", "lapulga10@");
        Contacto contacto6 = new Contacto("neymar", "jr", "adiela", "318287312", "lloronforever@");
        Contacto contacto7 = new Contacto("roberto", "jla bestia", "adiela", "318241312", "lloronforever@");

        
        // Grupo
        Grupo grupo1 = new Grupo("programacion", Categoria.OFICINA);
        
        grupo1.agregarContacto(contacto1);
        grupo1.agregarContacto(contacto2);
        grupo1.agregarContacto(contacto3);
        grupo1.agregarContacto(contacto4);
        grupo1.agregarContacto(contacto5);

        Reunion reunion1 = new Reunion("reunion para programar", "08/08/2024", "11:00 am");
        reunion1.agregarAsistente(contacto1);
        reunion1.agregarAsistente(contacto2);
        reunion1.agregarAsistente(contacto3);
        reunion1.agregarAsistente(contacto4);
        reunion1.agregarAsistente(contacto5);
        reunion1.agregarAsistente(contacto6);
        reunion1.agregarAsistente(contacto7);

        Reunion reunion2 = new Reunion("reunion para hablar", "08/08/2024", "11:00 am");
        reunion2.agregarAsistente(contacto1);
        reunion2.agregarAsistente(contacto2);
        reunion2.agregarAsistente(contacto3);
        reunion2.agregarAsistente(contacto4);
        reunion2.agregarAsistente(contacto5);
        reunion2.agregarAsistente(contacto6);
        reunion2.agregarAsistente(contacto7);

        // creo la agenda
        Agenda agenda = new Agenda();
        // creo la lista de contactos
        agenda.crearContacto(contacto1);
        agenda.crearContacto(contacto2);
        agenda.crearContacto(contacto3);
        agenda.crearContacto(contacto4);
        agenda.crearContacto(contacto5);
        agenda.crearContacto(contacto6);
        agenda.crearContacto(contacto7);
        //creo la reuinon
        agenda.crearReunion(reunion1);
        agenda.crearReunion(reunion2);
        // creo el grupo
        agenda.crearGrupo(grupo1);
        // elimino reunion
        // antes muestro las reuinones
        
        agenda.eliminarReunion(reunion2);
        // ahora muestro nuevamente la agenda

        System.out.println("La agenda antes de eliminar -> " + agenda.toString());

        agenda.modificarContacto("Valentina", "valen", "zaguanes", "318282", "val@");
        
        System.out.println("La agenda despues de eliminar -> " + agenda.toString());
        
    }
}
