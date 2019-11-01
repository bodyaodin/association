package com.projects.drones;

import com.projects.interfaces.Scannable;

public interface Drone  extends Scannable {

    void flyUp();

    void scanning();

    void flyDown();

    boolean isTarget();
}
