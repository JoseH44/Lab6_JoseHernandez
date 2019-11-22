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
public class AdministradorInventario {

    private ArrayList<Bebida> bebidas = new ArrayList();
    private File archivo = null;

    public AdministradorInventario(String path) {
        archivo = new File(path);
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdministradorInventario{" + "bebidas=" + bebidas + ", archivo=" + archivo + '}';
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Bebida b : bebidas) {
                bw.write("Codigo:" + b.getCodigo() + ",");
                bw.write("Nombre Marca: " + b.getNombre_marca() + ",");
                bw.write("Nombre Bebida: " + b.getNombre_bebida() + ",");
                bw.write("Azucar OZ: " + b.getCant_azucar() + ",");
                bw.write("Porcentaje de Alcohol: " + b.getPorcentaje_alcohol() + ",");
                bw.write("Nacional/No Nacional:" + b.getNacional() + ",");
                bw.write("N°Lote: " + b.getNum_lote() + ",");
                for (int i = 0; i < b.getColorantes().size(); i++) {
                    bw.write("Colorantes: " + b.getColorantes().get(i));

                }
                bw.write(",");
                bw.write("Precio: " + b.getPrecio() + ",");
                bw.write("Cantidad: " + b.getCantidad() + ",");
                bw.write("Fecha Vencimiento: " + b.getFecha_vencimiento() + ",");
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
    }
}
