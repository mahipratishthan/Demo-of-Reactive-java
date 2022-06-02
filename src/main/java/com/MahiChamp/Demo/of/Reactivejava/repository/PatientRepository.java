package com.MahiChamp.Demo.of.Reactivejava.repository;
import com.MahiChamp.Demo.of.Reactivejava.entity.PatientEntity;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends ReactiveMongoRepository<PatientEntity, Integer> {


}
