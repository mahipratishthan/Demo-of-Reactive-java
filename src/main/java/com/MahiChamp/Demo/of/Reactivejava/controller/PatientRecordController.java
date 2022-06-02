package com.MahiChamp.Demo.of.Reactivejava.controller;

import com.MahiChamp.Demo.of.Reactivejava.dto.PatientRecord;
import com.MahiChamp.Demo.of.Reactivejava.service.PatientRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/PatientRecord")
public class PatientRecordController {
    @Autowired
    PatientRecordService patientRecordService;

    @GetMapping("/All")
    public Flux<PatientRecord> getAllPatientRecords(){
        return patientRecordService.getAllPatientRecords();
    }

    @GetMapping("/Id/{id}")
    public Mono<PatientRecord> getPatientRecordById(@PathVariable Integer id){
        return patientRecordService.getPatientRecordById(id);
    }

    @PostMapping("/AddPatient")
    public Mono<PatientRecord> addPatientRecord(@RequestBody PatientRecord patientRecord){
        return patientRecordService.addPatientRecord(patientRecord);
    }

    @PutMapping("/UpateRecordById/{id}")
    public Mono<PatientRecord> updatePatientRecord(@RequestBody PatientRecord patientRecord, @PathVariable  Integer id){
        return patientRecordService.updatePatientRecord(patientRecord,id);
    }

    @DeleteMapping("/DeletePatientById/{id}")
    public Mono<Void> deletePatientRecord(@PathVariable Integer id){
        return patientRecordService.deletePatientRecord(id);
    }
}
