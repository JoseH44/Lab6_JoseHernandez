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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

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
                bw.write(b.getCodigo() + ";");
                bw.write(b.getNombre_marca() + ";");
                bw.write(b.getNombre_bebida() + ";");
                bw.write(b.getCant_azucar() + ";");
                bw.write(b.getPorcentaje_alcohol() + ";");
                bw.write(b.getNacional() + ";");
                bw.write(b.getNum_lote() + ";");
                
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                String fech = df.format(b.getFecha_vencimiento());
                
                for (int i = 0; i < b.getColorantes().size(); i++) {
                    bw.write(b.getColorantes().get(i) + ",");
                    
                }
                bw.write(";");
                bw.write(b.getPrecio() + ";");
                bw.write(b.getCantidad() + ";");
                bw.write(fech + ";");
                
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        bw.close();
        fw.close();
        
    }
    
    public void cargarArchivo() {
        Scanner sc = null;
        bebidas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                
                while (sc.hasNext()) {
                    
                    Bebida b = new Bebida(sc.next(), sc.next(),
                            sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next(), sc.nextInt(), sc.nextDouble(), sc.nextInt(),
                            sdf.parse(sc.next()));
                    String[] colorantes = sc.next().split(",");
                    if (colorantes.length > 1) {
                        for (int i = 0; i < colorantes.length; i++) {
                            b.getColorantes().add(new Colorante(colorantes[i]));
                        }
                    }
                    bebidas.add(b);
                    
                }
                
            } catch (Exception e) {
            }
        }
        
    }
}
