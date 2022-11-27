/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fapan;

/**
 *
 * @author parth
 */
public class Main {
    private InterfaceTemperature temp;

    public InterfaceTemperature getTemperature() {
        return temp;
    }

    public void setTemperature(InterfaceTemperature temp) {
        this.temp = temp;
    }

    public void returnTemperature() {
        System.out.println("Temperatura em Celsius: " + temp.parseTemperature());
    }

    public static void main(String[] args) {

        Main main = new Main();
        main.setTemperature(new TemperatureAdapter());
        main.returnTemperature();
    }
}
