/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_josehernandez;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jrdjh
 */
public class Bebida {

    private String codigo;
    private String nombre_marca;
    private String nombre_bebida;
    private double cant_azucar;
    private double porcentaje_alcohol;
    private String nacional;
    private ArrayList<Colorante> colorantes = new ArrayList();
    private int num_lote;
    private double precio;
    private int cantidad;
    private Date fecha_vencimiento;

    public Bebida() {
    }

    public Bebida(String codigo, String nombre_marca, String nombre_bebida, double cant_azucar, double porcentaje_alcohol, String nacional, int num_lote, double precio, int cantidad, Date fecha_vencimiento) {
        this.codigo = codigo;
        this.nombre_marca = nombre_marca;
        this.nombre_bebida = nombre_bebida;
        this.cant_azucar = cant_azucar;
        this.porcentaje_alcohol = porcentaje_alcohol;
        this.nacional = nacional;
        this.num_lote = num_lote;
        this.precio = precio;
        this.cantidad = cantidad;
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre_marca() {
        return nombre_marca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombre_marca = nombre_marca;
    }

    public String getNombre_bebida() {
        return nombre_bebida;
    }

    public void setNombre_bebida(String nombre_bebida) {
        this.nombre_bebida = nombre_bebida;
    }

    public double getCant_azucar() {
        return cant_azucar;
    }

    public void setCant_azucar(double cant_azucar) {
        this.cant_azucar = cant_azucar;
    }

    public double getPorcentaje_alcohol() {
        return porcentaje_alcohol;
    }

    public void setPorcentaje_alcohol(double porcentaje_alcohol) {
        if (porcentaje_alcohol > 0 && porcentaje_alcohol < 100) {
            this.porcentaje_alcohol = porcentaje_alcohol;
        }

    }

    public String getNacional() {
        return nacional;
    }

    public void setNacional(String nacional) {
        this.nacional = nacional;
    }

    public ArrayList<Colorante> getColorantes() {
        return colorantes;
    }

    public void setColorantes(ArrayList<Colorante> colorantes) {
        this.colorantes = colorantes;
    }

    public int getNum_lote() {
        return num_lote;
    }

    public void setNum_lote(int num_lote) {
        this.num_lote = num_lote;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(Date fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    @Override
    public String toString() {
        return "Bebida{" + "codigo=" + codigo + ", nombre_marca=" + nombre_marca + ", nombre_bebida=" + nombre_bebida + ", cant_azucar=" + cant_azucar + ", porcentaje_alcohol=" + porcentaje_alcohol + ", nacional=" + nacional + ", colorantes=" + colorantes + ", num_lote=" + num_lote + ", precio=" + precio + ", cantidad=" + cantidad + ", fecha_vencimiento=" + fecha_vencimiento + '}';
    }

}
