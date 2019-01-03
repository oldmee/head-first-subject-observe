package com.oldmee.station;

import com.oldmee.WeatherData;
import com.oldmee.displayElement.displayImpl.CurrentConditionsDisplay;
import org.junit.Test;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 16:53 2019/1/3
 */
public class WeatherStation {

    @Test
    public void testWeather() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(85, 65, 30.5f);
    }
}
