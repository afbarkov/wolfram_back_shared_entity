package ru.lexnasoft.wolfram.backend.shared.model.trainings.enums;

public enum MeasurementType {
    WEIGHT(MeasurementUnitType.WEIGHT)
            ,
    HEIGHT(MeasurementUnitType.LENGTH),
    WAIST(MeasurementUnitType.LENGTH),
    ARM(MeasurementUnitType.LENGTH),
    FOREARM(MeasurementUnitType.LENGTH),
    THIGH(MeasurementUnitType.LENGTH),
    CHEST(MeasurementUnitType.LENGTH),
    BACK(MeasurementUnitType.LENGTH),
    CALF(MeasurementUnitType.LENGTH),
    NECK(MeasurementUnitType.LENGTH),
    HIPS(MeasurementUnitType.LENGTH);


    MeasurementType(MeasurementUnitType unitType) {
        this.unitType = unitType;
    }

    public final MeasurementUnitType unitType;


}
