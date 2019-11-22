/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josehernandez;

/**
 *
 * @author jrdjh
 */
public class Colorante {

    private String colorante;

    public Colorante() {
    }

    public Colorante(String colorante) {
        this.setColorante(colorante);
    }

    public String getColorante() {
        return colorante;
    }

    public void setColorante(String colorante) {
        if (colorante.equals("Azul-4")) {
            this.colorante = colorante;
        }
        if (colorante.equals("Rojo-69")) {
            this.colorante = colorante;
        }
        if (colorante.equals("Verde-420")) {
            this.colorante = colorante;
        }
        if (colorante.equals("Amarillo-77")) {
            this.colorante = colorante;
        }
        if (colorante.equals("Blanco-07")) {
            this.colorante = colorante;
        }
    }

    @Override
    public String toString() {
        return colorante;
    }

}
