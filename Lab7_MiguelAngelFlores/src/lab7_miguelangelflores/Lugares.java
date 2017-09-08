/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_miguelangelflores;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miguel Flores
 */
public class Lugares extends Thread {

    Principal principal = new Principal();
    public String nombre;
    public String clima;
    public int extencionTerritorial;
    public int CantidadPersonas;
    public String TipoZona;
    public String AnoFundacion;
    public Mostracion Integrantes = new Mostracion();
    public ArrayList<Personas> ListPersonas = new ArrayList();

    public Lugares(String nombre, String clima, int extencionTerritorial, int CantidadPersonas, String TipoZona, String AnoFundacion, ArrayList<Personas> lista) {
        this.nombre = nombre;
        this.clima = clima;
        this.extencionTerritorial = extencionTerritorial;
        this.CantidadPersonas = CantidadPersonas;
        this.TipoZona = TipoZona;
        this.AnoFundacion = AnoFundacion;
        this.ListPersonas = lista;
    }

    public Lugares() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getExtencionTerritorial() {
        return extencionTerritorial;
    }

    public void setExtencionTerritorial(int extencionTerritorial) {
        this.extencionTerritorial = extencionTerritorial;
    }

    public int getCantidadPersonas() {
        return CantidadPersonas;
    }

    public void setCantidadPersonas(int CantidadPersonas) {
        this.CantidadPersonas = CantidadPersonas;
    }

    public String getTipoZona() {
        return TipoZona;
    }

    public void setTipoZona(String TipoZona) {
        this.TipoZona = TipoZona;
    }

    public String getAnoFundacion() {
        return AnoFundacion;
    }

    public void setAnoFundacion(String AnoFundacion) {
        this.AnoFundacion = AnoFundacion;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public void run() {
        Integrantes.setVisible(true);
        Integrantes.xxxxxxx.setText(nombre);
        JTable tablaTemporal = new JTable();
        Mostracion mostracion = new Mostracion();
        DefaultTableModel modelo = (DefaultTableModel) mostracion.Jt_TablaIntegrantes.getModel();
        DefaultTableModel borrar = (DefaultTableModel) mostracion.Jt_TablaIntegrantes.getModel();
        while (true) {
            while (mostracion.Jt_TablaIntegrantes.getRowCount() > 0) {
                modelo.removeRow(0);
            }
            Integrantes.Jt_TablaIntegrantes.setModel(modelo);
            for (Personas t1 : ListPersonas) {
                if (t1.getLugar().equalsIgnoreCase(nombre)) {
                    Object[] fila = {t1.nombre, t1.id, t1.lugar, t1.edad, t1.estatura, t1.profesion};
                    modelo.addRow(fila);
                }
            }
            Integrantes.Jt_TablaIntegrantes.setModel(modelo);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }

    }

}
