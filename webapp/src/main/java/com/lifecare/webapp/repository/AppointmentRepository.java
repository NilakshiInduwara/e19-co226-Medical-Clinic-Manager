package com.lifecare.webapp.repository;
import com.lifecare.webapp.entity.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    public List<Appointment> findByPatientPatientId(Long patientId);

    public void deleteByMedicalProfessionalProfessionalId(Long professionalId);

}
