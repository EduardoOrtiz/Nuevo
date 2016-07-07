package Otras;

import Beans.BeanProducto;
import Beans.BeanVenta;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class LlenarTablas {

    public void llenarTablaVentaNueva(List<BeanProducto> lista, JTable tabla) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
        for (int i = 0; i < lista.size(); i++) {
            Beans.BeanProducto b = lista.get(i);
            String[] fila = new String[3];
            fila[0] = lista.get(i).getNombre();
            fila[1] = lista.get(i).getDescripcion();
            fila[2] = "$" + lista.get(i).getPrecio_venta();

            modelo.addRow(fila);
        }
    }

    public void llenarInventarioVentas(List<BeanProducto> lista, JTable tabla) {
        DefaultTableModel modelo2 = (DefaultTableModel) tabla.getModel();
        for (int i = modelo2.getRowCount() - 1; i >= 0; i--) {
            modelo2.removeRow(i);
        }
        for (int i = 0; i < lista.size(); i++) {
            BeanProducto bean = lista.get(i);
            String[] fila = new String[4];
            fila[0] = bean.getCodigo();
            fila[1] = bean.getNombre();
            fila[2] = "$" + Float.toString(bean.getPrecio_compra());
            fila[3] = "$" + Float.toString(bean.getPrecio_venta());
            modelo2.addRow(fila);
        }
    }

    public void llenarTablaVentas(List<BeanVenta> lista, JTable tabla) {
        DefaultTableModel ventas = (DefaultTableModel) tabla.getModel();
        for (int i = ventas.getRowCount() - 1; i >= 0; i--) {
            ventas.removeRow(i);
        }
        for (int i = 0; i < lista.size(); i++) {
            BeanVenta bean = lista.get(i);
            String[] fila = new String[5];

            fila[0] = bean.getFecha();
            fila[1] = bean.getNombre();
            fila[2] = "" + bean.getUnidades();
            fila[3] = "$" + bean.getPrecio_venta();
            fila[4] = "$" + bean.getTotal();

            ventas.addRow(fila);
        }
    }

    public String obtenerFecha() {
        Calendar c = new GregorianCalendar();
        int dia;
        int mes;
        int anio;
        dia = c.get(Calendar.DAY_OF_MONTH);
        mes = 1 + (c.get(Calendar.MONTH));
        anio = c.get(Calendar.YEAR);
        String fecha = anio + "/" + mes + "/" + dia;
        return fecha;
    }
}
