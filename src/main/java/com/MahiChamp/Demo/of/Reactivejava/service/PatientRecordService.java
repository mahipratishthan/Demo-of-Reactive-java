package com.MahiChamp.Demo.of.Reactivejava.service;

import com.MahiChamp.Demo.of.Reactivejava.dto.PatientRecord;
import com.MahiChamp.Demo.of.Reactivejava.entity.PatientEntity;
import com.MahiChamp.Demo.of.Reactivejava.repository.PatientRepository;
import com.MahiChamp.Demo.of.Reactivejava.utils.EntityDtoConversion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PatientRecordService {
    @Autowired
    PatientRepository patientRepository;
    public Flux<PatientRecord> getAllPatientRecords() {
        return patientRepository.findAll().map(EntityDtoConversion :: entityTodto);
    }

    public Mono<PatientRecord> getPatientRecordById(Integer id) {
        return patientRepository.findById(id).map(EntityDtoConversion :: entityTodto);
    }

    public Mono<PatientRecord> addPatientRecord(PatientRecord patientRecord) {
        PatientEntity Ans= EntityDtoConversion.dtoToEntity(patientRecord);
        return patientRepository.insert(Ans).map(EntityDtoConversion::entityTodto);

        //return patientRecord1.map(EntityDtoConversion :: dtoToEntity).flatMap(patientRepository::insert).map(EntityDtoConversion::entityTodto);
    }

    public Mono<PatientRecord> updatePatientRecord(PatientRecord patientRecord, Integer id) {
        Mono<PatientRecord> Ans = Mono.just(patientRecord);
        return patientRepository.findById(id).flatMap(
                patientEntity -> Ans.map(EntityDtoConversion::dtoToEntity).doOnNext(e ->e.setId(id)).flatMap(patientRepository::save).map(EntityDtoConversion::entityTodto)
        );
    }

    public Mono<Void> deletePatientRecord(Integer id) {
        return patientRepository.deleteById(id);
    }
}
