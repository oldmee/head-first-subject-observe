package com.oldmee.subject;

import com.oldmee.observer.Observer;

/**
 * @Author: R.oldmee
 * @Description:
 * @Date: Create in 15:53 2019/1/3
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
