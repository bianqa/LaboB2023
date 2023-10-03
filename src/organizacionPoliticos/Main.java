package organizacionPoliticos;

import Intercambio.Color;
import Intercambio.Fecha;
import curling.Dia;
import curling.Horario;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Paloma ave1 = new Paloma("fwefw", Color.ROJO, "pio", true, true);
        Paloma ave2 = new Paloma();
        TelefonoMovil telefono1 = new TelefonoMovil(123456, "manzana", "s20", CompaniaTelefonica.CLARO, 1124568789, true, 100.0);
        TelefonoMovil telefono2 = new TelefonoMovil();
        HashMap<Dia, Horario> mapa = new HashMap<>();
        mapa.put(Dia.LUNES, Horario.MANANA);
        mapa.put(Dia.MARTES, Horario.MANANA);
        mapa.put(Dia.MIERCOLES, Horario.TARDE);
        mapa.put(Dia.JUEVES, Horario.NOCHE);
        mapa.put(Dia.VIERNES, Horario.MANANA);
        Trabajador trabajador1 = new Trabajador("sofia", "toledo", new Fecha(24, 11, 2005), 17, "hciregra 5555", 46000000, "27460000007", 200.0, mapa);
        Trabajador trabajador2 = new Trabajador();
        trabajador2.agregarHorario(Dia.DOMINGO, Horario.MANANA);
        HashSet<Mensajero> mensajeros = new HashSet<>();
        mensajeros.add(ave1);
        mensajeros.add(ave2);
        mensajeros.add(telefono1);
        mensajeros.add(telefono2);
        mensajeros.add(trabajador1);
        mensajeros.add(trabajador2);
        Partido partido = new Partido("qwqwf", "cac 1234", 23, mensajeros);
        partido.hacerCampania();
    }
}
