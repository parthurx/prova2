/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fapan;

/**
 *
 * @author parth
 */
import com.stark.cooporation.FarenheitSensor;
public class TemperatureAdapter implements InterfaceTemperature {

    @Override
    public double parseTemperature() {
        FarenheitSensor fSensor = new FarenheitSensor();
        double parseCelcius = (fSensor.getTemperaturaFarenheit() - 32) * 5 / 9;
        return parseCelcius;
    }

}
