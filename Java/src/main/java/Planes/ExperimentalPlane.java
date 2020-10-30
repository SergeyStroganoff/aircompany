package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane {

    private final ExperimentalTypes typeExperimentalPlane;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, ExperimentalTypes typeExperimentalPlane, ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.typeExperimentalPlane = typeExperimentalPlane;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel) {
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ExperimentalPlane that = (ExperimentalPlane) o;

        if (typeExperimentalPlane != that.typeExperimentalPlane) return false;
        return classificationLevel == that.classificationLevel;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (typeExperimentalPlane != null ? typeExperimentalPlane.hashCode() : 0);
        result = 31 * result + (classificationLevel != null ? classificationLevel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "experimentalPlane{" + "model='" + model + '\'' + '}';
    }
}
