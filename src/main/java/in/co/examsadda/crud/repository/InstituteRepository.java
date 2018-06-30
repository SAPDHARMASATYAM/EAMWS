package in.co.examsadda.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Institute;

@Repository
public interface InstituteRepository extends CrudRepository<Institute, Integer> {

}
