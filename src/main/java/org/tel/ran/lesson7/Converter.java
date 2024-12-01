package org.tel.ran.lesson7;

public class Converter {
    public static double runKelvinConverter(double baseValue){
        return baseValue + 273.15;
    }

    public static double runFahrenheitConverter(double baseValue){
        return (baseValue * 1.8) + 32;
    }
}
