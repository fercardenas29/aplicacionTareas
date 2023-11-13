/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcion;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author diego
 */
public class Funciones {
    
    public static void agregarDato(JTable tabla, Object[] datos) {
        
        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        // Agregar una nueva fila con los datos proporcionados
        modelo.addRow(datos);
    }
    
    public static void eliminarDato(JTable tabla, int fila) {
        
        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        // Verificar si la fila a eliminar es válida
        if (fila >= 0 && fila < modelo.getRowCount()) {
            // Eliminar la fila correspondiente
            modelo.removeRow(fila);
        }
    }
    
    public static void modificarDato(JTable tabla, int fila, Object[] nuevosDatos) {
        
        // Obtener el modelo de la tabla
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        // Verificar si la fila a modificar es válida
        if (fila >= 0 && fila < modelo.getRowCount()) {
            // Modificar los datos de la fila
            for (int i = 0; i < nuevosDatos.length; i++) {
                modelo.setValueAt(nuevosDatos[i], fila, i);
            }
        }
    }
    
}
