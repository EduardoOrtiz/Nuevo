/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Otras;

import Beans.BeanProducto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jesuseduardo
 */
public class LlenarListas {
    
    public ArrayList<Object> listaProductos(List<Beans.BeanProducto> listaAux){
    ArrayList<Object> lista=new ArrayList();
        for (BeanProducto lista1 : listaAux) {
            lista.add(""+lista1.getNombre());
        }
    return lista;
    }
    
    public ArrayList<Object> listaProductosDescripcion(List<Beans.BeanProducto> listaAux){
    ArrayList<Object> lista=new ArrayList();
        for (BeanProducto lista1 : listaAux) {
            lista.add(""+lista1.getDescripcion());
        }
    return lista;
    }
    
    public void crearAutocompletador(){
    
    }
}
