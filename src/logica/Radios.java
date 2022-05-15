package logica;

import java.util.ArrayList;

public class Radios {
    private String nombre;
    private String frecuenciaTransmision;
    private TipoTransmision tipoTransmision;
    private Emisiones emisiones;

    public Radios(String nombre, String frecuenciaTransmision, TipoTransmision tipoTransmision, Emisiones emisiones) {
        this.nombre = nombre;
        this.frecuenciaTransmision = frecuenciaTransmision;
        this.tipoTransmision = tipoTransmision;
        this.emisiones = emisiones;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFrecuenciaTransmision() {
        return frecuenciaTransmision;
    }

    public void setFrecuenciaTransmision(String frecuenciaTransmision) {
        this.frecuenciaTransmision = frecuenciaTransmision;
    }

    public TipoTransmision getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(TipoTransmision tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    @Override
    public String toString() {
        return "Radios{" +
                "nombre='" + nombre + '\'' +
                ", frecuenciaTransmision='" + frecuenciaTransmision + '\'' +
                ", tipoTransmision=" + tipoTransmision +
                ",\n Emision =" + emisiones +
                '}';
    }
}
