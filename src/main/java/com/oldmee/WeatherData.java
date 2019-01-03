package com.oldmee;

import com.oldmee.observer.Observer;
import com.oldmee.subject.Subject;

import java.util.ArrayList;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 16:17 2019/1/3
 */
public class WeatherData implements Subject {
    private ArrayList observer;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observer = new ArrayList();
    }

    public void registerObserver(Observer o) {
        observer.add(o);
    }

    public void removeObserver(Observer o) {
        observer.remove(o);
    }

    public void notifyObservers() {
        for (int i = 0; i < observer.size(); i++) {
            Observer obs = (Observer) observer.get(i);
            obs.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
