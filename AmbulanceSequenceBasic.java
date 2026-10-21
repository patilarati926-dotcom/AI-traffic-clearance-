// Experiment 8: Implementation of UML in Java (Basic)
// Sequence Diagram - AI-Based Ambulance Traffic Clearance System

class AIEngine {
    String calculateOptimalRoute() {
        System.out.println("AI Engine: calculateOptimalRoute()");
        return "Route-101";
    }
    boolean analyzeTrafficCongestion() {
        System.out.println("AI Engine: analyzeTrafficCongestion()");
        return true;
    }
}

class TrafficControlAuthority {
    void sendClearanceInstructions() {
        System.out.println("Traffic Authority: sendClearanceInstructions()");
        System.out.println("Traffic Authority: signalsCleared()");
    }
}

class Hospital {
    void sendETAAlert() {
        System.out.println("Hospital: sendETAAlert()");
        System.out.println("Hospital: acknowledgeAlert()");
    }
}

class AmbulanceDriver {
    void receiveRouteInstructions(String route) {
        System.out.println("Driver: received route -> " + route);
    }
    void shareLiveGPSLocation() {
        System.out.println("Driver: shareLiveGPSLocation()");
    }
}

class SystemHandler {
    AIEngine aiEngine = new AIEngine();
    TrafficControlAuthority authority = new TrafficControlAuthority();
    Hospital hospital = new Hospital();

    void handleRequest(AmbulanceDriver driver) {
        System.out.println("System: validateRequest()");

        String route = aiEngine.calculateOptimalRoute();
        driver.receiveRouteInstructions(route);
        driver.shareLiveGPSLocation();

        boolean congested = aiEngine.analyzeTrafficCongestion();
        if (congested) {
            authority.sendClearanceInstructions();
        }

        hospital.sendETAAlert();
    }
}

public class AmbulanceSequenceBasic {
    public static void main(String[] args) {
        AmbulanceDriver driver = new AmbulanceDriver();
        SystemHandler system = new SystemHandler();

        System.out.println("Driver: raiseEmergencyRequest()");
        system.handleRequest(driver);
    }
}
