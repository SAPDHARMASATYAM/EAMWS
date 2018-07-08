package in.co.examsadda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.jpa.repository.SectionRepository;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class SectionServiceBean implements SectionService {
	
	@Autowired
	private SectionRepository sectionRepository;
}
