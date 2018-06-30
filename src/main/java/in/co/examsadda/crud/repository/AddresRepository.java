package in.co.examsadda.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.co.examsadda.entity.Address;

@Repository
public interface AddresRepository extends CrudRepository<Address, Integer> {

}
