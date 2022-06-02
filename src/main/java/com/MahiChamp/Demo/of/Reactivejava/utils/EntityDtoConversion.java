package com.MahiChamp.Demo.of.Reactivejava.utils;

import com.MahiChamp.Demo.of.Reactivejava.dto.PatientRecord;
import com.MahiChamp.Demo.of.Reactivejava.entity.PatientEntity;
import org.springframework.beans.BeanUtils;

public class EntityDtoConversion {
    public static PatientRecord entityTodto(PatientEntity patientEntity){
        PatientRecord patientRecord = new PatientRecord();
        BeanUtils.copyProperties(patientEntity,patientRecord);
        return patientRecord;
    }
    public static PatientEntity dtoToEntity(PatientRecord patientRecord){
        PatientEntity patientEntity = new PatientEntity();
        BeanUtils.copyProperties(patientRecord,patientEntity);
        return patientEntity;
    }
}
