/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTILERIAS;

import forms.Agregar;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;

public class ButtonEditor extends AbstractCellEditor implements TableCellEditor, ActionListener {

    @Override
    public Object getCellEditorValue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
//    private JButton button;
//    private int clickedRow;
//    private JTable table;
//
//    public ButtonEditor(JTable table) {
//        this.table = table;
//        button = new JButton("Clic aquí");
//        button.addActionListener(this);
//    }
//
//    @Override
//    public Object getCellEditorValue() {
//        return null;
//    }
//
//    @Override
//    public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
//        clickedRow = row;
//        return button;
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        // Lógica que se ejecutará al hacer clic en el botón
//        Agregar agregar = new Agregar();
//        agregar.setVisible(true);
//
//        // Aquí puedes agregar tu propia lógica según lo que necesites hacer al hacer clic en el botón
//    }
}
