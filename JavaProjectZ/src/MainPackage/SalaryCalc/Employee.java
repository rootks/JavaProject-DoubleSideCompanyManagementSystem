/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainPackage.SalaryCalc;

/**
 *
 * @author user
 */

    
public abstract class Employee {
    protected double basicSalary;
    protected double allowance;
    protected double otherAllowance;
    protected double otHours;

    public Employee(double basicSalary, double allowance, double otherAllowance, double otHours) {
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.otherAllowance = otherAllowance;
        this.otHours = otHours;
    }

    public abstract double calculateGrossSalary();
    public abstract double calculateEPF();
    public abstract double calculateETF();
    public abstract double calculateNetSalary(double welfare, double other);
}

