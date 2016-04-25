package edu.ucsd.cs110.temperature;

/**
 * Created by cs110xmatt on 3/11/16.
 */
public class Fahrenheit extends Temperature {
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        //float celsius = (this.value - 32) * (5/9);
        //return new Fahrenheit(celsius);
        return null;
    }

    @Override
    public Temperature toFahrenheit() {
        //return this;
        return null;
    }


    public String toString()
    {
        // TODO: Complete this method
        return "";
    }
}

