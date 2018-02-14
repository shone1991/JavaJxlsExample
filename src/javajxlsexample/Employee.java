/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javajxlsexample;

/**
 *
 * @author LapasovFG.VCRP
 */
public class Employee {
    
    private String name;

    private int age;

    private int payment;

    public Employee(String name, int age, int payment) {
        this.name = name;
        this.age = age;
        this.payment = payment;
    }

    /**
     * Get the value of payment
     *
     * @return the value of payment
     */
    public int getPayment() {
        return payment;
    }

    /**
     * Set the value of payment
     *
     * @param payment new value of payment
     */
    public void setPayment(int payment) {
        this.payment = payment;
    }

    /**
     * Get the value of age
     *
     * @return the value of age
     */
    public int getAge() {
        return age;
    }

    /**
     * Set the value of age
     *
     * @param age new value of age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

}
