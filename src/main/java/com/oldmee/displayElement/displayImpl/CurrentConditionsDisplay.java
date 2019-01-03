package com.oldmee.displayElement.displayImpl;

import com.oldmee.displayElement.DisplayElement;
import com.oldmee.observer.Observer;
import com.oldmee.subject.Subject;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 16:37 2019/1/3
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void display() {
        System.out.println("tem:" + temperature + " , humi : " + humidity + " , pressure :" + pressure);
    }

    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
