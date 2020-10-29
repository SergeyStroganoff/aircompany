package Planes;

import java.util.Comparator;
import java.util.Objects;

public abstract class Plane {
    String model;
    private final int maxSpeed;
    private final int maxFlightDistance;
    private final int maxLoadCapacity;

    public Plane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.maxFlightDistance = maxFlightDistance;
        this.maxLoadCapacity = maxLoadCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeedPlane() {
        return maxSpeed;
    }

    public int getMaxFlightDistance() {
        return maxFlightDistance;
    }

    public int getMaxLoadCapacity() {
        return this.maxLoadCapacity;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", maxFlightDistance=" + maxFlightDistance +
                ", maxLoadCapacity=" + maxLoadCapacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane)) return false;
        Plane plane = (Plane) o;
        return maxSpeed == plane.maxSpeed &&
                maxFlightDistance == plane.maxFlightDistance &&
                maxLoadCapacity == plane.maxLoadCapacity &&
                Objects.equals(model, plane.model);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + maxSpeed;
        result = 31 * result + maxFlightDistance;
        result = 31 * result + maxLoadCapacity;
        return result;
    }


    public static Comparator<Plane> comparatorByMaxSpeed() {
        return (o1, o2) -> o1.getMaxSpeedPlane() - o2.getMaxSpeedPlane();
    }


    public static Comparator<Plane> comparatorByMaxLoadCapacity() {
        return (o1, o2) -> o1.getMaxLoadCapacity() - o2.getMaxLoadCapacity();
    }


    public static Comparator<Plane> comparatorByMaxFlightDistance() {
        return (Plane o1, Plane o2) -> o1.getMaxFlightDistance() - o2.getMaxFlightDistance();
    }


            }








