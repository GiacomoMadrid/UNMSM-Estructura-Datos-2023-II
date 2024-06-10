/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Employee;
import model.List;
import view.MainFrame;

/**
 *
 * @author Luis
 */
public class MainController {
    MainFrame view;
    List lista;
    public MainController(List list) {
        view = new MainFrame();
        view.setTitle("Ejercicio 2");
        this.lista = list;
        fillTable();
        view.btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lista.append(createEmployee());
                fillTable();
                cls();
            }
        });
        view.btnConsult.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String code = view.codeField.getText();
                Employee emp = lista.find(code);
                if (emp!=null) {
                    JOptionPane.showMessageDialog(null, emp);
                    view.codeField.setText(code); 
                    view.nameField.setText(emp.getName());
                    view.salaryField.setText(emp.getSalary()+"");
                    view.movementField.setText(emp.getTransportAmount()+"");
                    view.arrivalField.setText(emp.getLateMinutes()+"");
                }
            }
        });
        view.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Employee emp = createEmployee();
                lista.replace(emp);
                fillTable();
                cls();
            }
        });
        view.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String code = view.codeField.getText();
                lista.delete(code);
                cls();
                fillTable();
            }
        });
        view.btnConsult2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch  (view.consultCb.getSelectedIndex()) {
                    case 0 -> {
                        int cont = 0;
                        for (int i = 0; i < lista.length(); i++) {
                            if (lista.get(i).getLateMinutes()>15) {
                                cont++;
                            }
                        }
                        view.result.setText(cont+"");
                    }
                    case 1 -> {
                        int mayor = 0;
                        int index = 0;
                        for (int i = 0; i < lista.length(); i++) {
                            Employee emp = lista.get(i);
                            if (emp.getLateMinutes() > mayor && emp.getTypeContract().equals("Services")) {
                                mayor = emp.getLateMinutes();
                                index = i;
                            }
                        }
                        view.result.setText(lista.get(index).getName());
                    }
                    default -> {
                        double mayor = 0;
                        for (int i = 0; i < lista.length(); i++) {
                            Employee emp = lista.get(i);
                            if (emp.getTransportAmount() > mayor && emp.getTypeContract().equals("Plazo Fijo") && emp.getSalary()<1500) {
                                mayor = emp.getTransportAmount();
                            }
                        }
                        view.result.setText(mayor+"");

                    }
                }
                
            }
        });
    }
    
    private Employee createEmployee() {
        String code = view.codeField.getText();
        String name = view.nameField.getText();
        String contract = view.contractCb.getSelectedItem().toString();
        double salary = Double.parseDouble(view.salaryField.getText());
        double transport = Double.parseDouble(view.movementField.getText());
        int minutes = Integer.parseInt(view.arrivalField.getText());
        return new Employee(code, name, contract, salary, transport, minutes);
    }
    
    public void run() {
        view.setVisible(true);
    }
    private void cls() {
        view.codeField.setText("");
        view.nameField.setText("");
        view.salaryField.setText("");
        view.movementField.setText("");
        view.arrivalField.setText("");
        view.result.setText("");
    }
    
    private void fillTable() {
        DefaultTableModel md = new DefaultTableModel();
        md.addColumn("Codigo");
        md.addColumn("Nombre");
        md.addColumn("Contrato");
        md.addColumn("Sueldo");
        md.addColumn("Movilidad");
        md.addColumn("Tardanza");
        for (int i = 0; i < lista.length(); i++) {
            Employee e = lista.get(i);
            md.addRow(new Object[]{e.getCode(), e.getName(), e.getTypeContract(), e.getSalary(), e.getTransportAmount(), e.getLateMinutes()});
        }
        this.view.table.setModel(md);
    }
}
