package com.oldmee.observer;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 15:55 2019/1/3
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
