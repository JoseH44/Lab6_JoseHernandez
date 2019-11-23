/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josehernandez;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author jrdjh
 */
public class Fact {

    private ArrayList<Bebida> temp = new ArrayList();
    private File archivo = null;

    public Fact(String path) {
        archivo = new File(path);
    }

    public ArrayList<Bebida> getTemp() {
        return temp;
    }

    public void setTemp(ArrayList<Bebida> temp) {
        this.temp = temp;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public void escribirFact() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            bw.write("            Supermercado el Barrio");
            bw.newLine();
            bw.write("Factura#              ");
            bw.newLine();
            bw.write("Produc.                    Cant.            Precio");
            bw.newLine();
            double total = 0;
            for (Bebida t : temp) {

                bw.write(t.getNombre_bebida() + "                    ");
                bw.write(t.getCantidad() + "            ");
                bw.write("" + t.getPrecio());
                bw.newLine();
                total += t.getCantidad() * t.getPrecio();

            }
            bw.write("                                                        Total:");
            bw.newLine();
            bw.write("                                                         L." + total);
            bw.flush();
        } catch (Exception e) {
        }

        bw.close();
        fw.close();
    }
}
