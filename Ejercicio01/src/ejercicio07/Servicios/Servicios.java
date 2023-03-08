package ejercicio07.Servicios;

import ejercicio07.Entidades.Persona;

public class Servicios {

    public boolean esMayorDeEdad(Persona per1) {
        return per1.getEdad() > 17; // esto retorna un V o F directamente.
    }

}
