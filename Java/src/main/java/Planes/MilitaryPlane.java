package Planes;

import models.MilitaryType;

public class MilitaryPlane extends Plane {

    private final MilitaryType typeOfMilitaryPlane;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, MilitaryType typeOfMilitaryPlane) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.typeOfMilitaryPlane = typeOfMilitaryPlane;
    }

    public MilitaryType getTypeOfMilitaryPlane() {

        return typeOfMilitaryPlane;
    }

    @Override
    public String toString() {
        return super.toString().replace("}",
                ", type=" + typeOfMilitaryPlane + '}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MilitaryPlane that = (MilitaryPlane) o;

        return typeOfMilitaryPlane == that.typeOfMilitaryPlane;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + typeOfMilitaryPlane.hashCode();
        return result;
    }
}
