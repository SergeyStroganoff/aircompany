import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;
import models.MilitaryType;

import java.util.ArrayList;
import java.util.List;

public class Airport {

    private final List<? extends Plane> planes;


    public <T> List<T> getListBySubPlane(Class<T> tClass) {   /////////////////////////////////////////////////// new ////
        List<T> listSubPlane = new ArrayList<>();
        for (Plane plane : planes) {
            if (plane.getClass().equals(tClass)) {
                listSubPlane.add((T) plane);
            }
        }
        return listSubPlane;
    }


    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        List<PassengerPlane> passengerPlanes = getListBySubPlane(PassengerPlane.class);
        PassengerPlane planeWithMaxCapacity = passengerPlanes.get(0);
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity()) {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
        }
        return planeWithMaxCapacity;
    }

    public List<MilitaryPlane> getTransportMilitaryPlanes() {
        List<MilitaryPlane> transportMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getListBySubPlane(MilitaryPlane.class);

        for (MilitaryPlane militaryPlan : militaryPlanes) {
            if (militaryPlan.getTypeOfMilitaryPlane() == MilitaryType.TRANSPORT) {
                transportMilitaryPlanes.add(militaryPlan);
            }
        }
        return transportMilitaryPlanes;
    }

    public List<MilitaryPlane> getBomberMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<>();
        List<MilitaryPlane> militaryPlanes = getListBySubPlane(MilitaryPlane.class);

        for (MilitaryPlane militaryPlan : militaryPlanes) {

            if (militaryPlan.getTypeOfMilitaryPlane() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(militaryPlan);
            }
        }
        return bomberMilitaryPlanes;
    }


    public Airport sortByMaxDistance() {
        planes.sort(Plane.comparatorByMaxFlightDistance());
        return this;
    }

    public Airport sortByMaxSpeed() {
        planes.sort(Plane.comparatorByMaxSpeed());
        return this;
    }

    public Airport sortByMaxLoadCapacity() {
        planes.sort(Plane.comparatorByMaxLoadCapacity());
        return this;
    }

    public List<? extends Plane> getPlanes() {
        return planes;
    }

    public void print(List<Plane> collectionOfPlanes) {      // I changed the access parameter otherwise the method is useless
        for (Plane currentObjectOfPlane : collectionOfPlanes) {
            System.out.println(currentObjectOfPlane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }

    public Airport(List<? extends Plane> planes) {
        this.planes = planes;
    }

}
