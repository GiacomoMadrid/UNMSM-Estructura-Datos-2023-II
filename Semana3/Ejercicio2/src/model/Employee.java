/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Luis
 */
public class Employee {
    private final String code;
    private String name;
    private String typeContract;
    private double salary;
    private double transportAmount;
    private int lateMinutes;
    public Employee next;

    public Employee(String codigo, String name, String typeContract, double salary, double transportAmount, int lateMinutes){
        this.code = codigo;
        this.name = name;
        this.typeContract = typeContract;
        this.salary = salary;
        this.transportAmount = transportAmount;
        this.lateMinutes = lateMinutes;
    }
    
    public String getCode() {
        return code;
    }

    public int getLateMinutes() {
        return this.lateMinutes;
    }

    public String getName() {
        return this.name;
    }

    public String getTypeContract() {
        return this.typeContract;
    }

    public double getTransportAmount() {
        return this.transportAmount;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeContract(String typeContract) {
        this.typeContract = typeContract;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setTransportAmount(float transportAmount) {
        this.transportAmount = transportAmount;
    }

    public void setLateMinutes(int lateMinutes) {
        this.lateMinutes = lateMinutes;
    }

    @Override
    public String toString() {
        String txt = "Codigo: " + code + "\n"; 
        txt += "Nombre: " + name + "\n";
        txt += "Tipo de contrato: " + typeContract + "\n";
        txt += "Salario: " + salary+ "\n";
        txt += "Monto de movilidad: " + transportAmount + "\n";
        txt += "Minutos de tardanza: " + lateMinutes + "\n";
        return txt;
    }
    
}
