package at.ac.fhcampuswien;
import org.junit.jupiter.api.Test;
import trafficlight.ctrl.TrafficLightCtrl;

import static org.junit.jupiter.api.Assertions.*;


public class TrafficLightTests {

        @Test
        public void checkGreenToYellow() {
            TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
            trafficLight.nextState();
            assertNotEquals(trafficLight.getCurrentState(),trafficLight.getRedState());
        }

        @Test
        public void checkGreenToYellow2() {
            TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
            trafficLight.nextState();
            assertNotEquals(trafficLight.getCurrentState(),trafficLight.getGreenState());
        }


        @Test

        public void checkGreenToYellow3() {
            TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
            trafficLight.nextState();
            assertEquals(trafficLight.getCurrentState(),trafficLight.getYellowState());
        }
        @Test
        public void checkYellowToRed2() {
            TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
            trafficLight.nextState();
            trafficLight.nextState();
            assertNotEquals(trafficLight.getCurrentState(),trafficLight.getYellowState());
        }

        @Test

        public void checkYellowToRed3() {
            TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
            trafficLight.nextState();
            assertNotEquals(trafficLight.getCurrentState(),trafficLight.getGreenState());

        }

        @Test
        public void checkYellowToRed() {
            TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
            trafficLight.nextState();
            trafficLight.nextState();
            assertEquals(trafficLight.getCurrentState(),trafficLight.getRedState());
        }



        @Test
        public void checkRedToYellow() {
            TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
            trafficLight.nextState();
            assertEquals(trafficLight.getCurrentState(),trafficLight.getYellowState());
        }

        @Test
        public void checkRedToYellow2() {
            TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
            trafficLight.nextState();
            assertNotEquals(trafficLight.getCurrentState(),trafficLight.getGreenState());
        }

        @Test

        public void checkRedToYellow3() {
            TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
            trafficLight.nextState();
            assertNotEquals(trafficLight.getCurrentState(),trafficLight.getRedState());
        }

        @Test
        public void checkYellowToGreen() {
            TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
            trafficLight.nextState();
            trafficLight.nextState();
            assertNotEquals(trafficLight.getCurrentState(),trafficLight.getYellowState());
        }

        @Test
        public void checkYellowToGreen2() {
            TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
            trafficLight.nextState();
            assertNotEquals(trafficLight.getCurrentState(),trafficLight.getRedState());
        }


        @Test
        public void checkYellowToGreen3() {
            TrafficLightCtrl trafficLight = TrafficLightCtrl.getController();
            trafficLight.nextState();
            assertNotEquals(trafficLight.getCurrentState(),trafficLight.getGreenState());
        }



    }