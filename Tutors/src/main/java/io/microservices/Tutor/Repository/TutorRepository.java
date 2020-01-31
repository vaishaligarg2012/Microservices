package io.microservices.Tutor.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.microservices.Tutor.Model.Tutor;

@Repository
public interface TutorRepository extends JpaRepository<Tutor,Long> {

}
