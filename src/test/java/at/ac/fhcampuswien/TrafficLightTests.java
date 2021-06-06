package at.ac.fhcampuswien;

import org.junit.jupiter.api.Test;
import trafficlight.ctrl.TrafficLightCtrl;



public class TrafficLightTests {

    @Test
    public void checkYellowToGreen(){
    TrafficLightCtrl tlctrl = TrafficLightCtrl.getController();
    }

    @Test
    public void checkYellowToRed(){
        TrafficLightCtrl tlctrl = TrafficLightCtrl.getController();
    }

    @Test
    public void checkRedToYellow(){
        TrafficLightCtrl tlctrl = TrafficLightCtrl.getController();
    }
}