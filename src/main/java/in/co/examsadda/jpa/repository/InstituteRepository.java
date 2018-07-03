package in.co.examsadda.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Institute;

@Repository
public interface InstituteRepository extends JpaRepository<Institute, Integer> {

}
