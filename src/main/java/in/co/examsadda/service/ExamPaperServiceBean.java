package in.co.examsadda.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import in.co.examsadda.entity.PracticePaper;
import in.co.examsadda.model.ExamPaper;
import in.co.examsadda.model.ExamSection;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ExamPaperServiceBean implements ExamPaperService{

	@Autowired
	private PracticePaperService practicePaperService;
	@Autowired
	private ExamSectionsService examSectionsService;

	@Override
	public ExamPaper getExamPaperByExamPaperId(Integer examPaperId) throws Exception {
		ExamPaper examPaper = new ExamPaper();
		PracticePaper practicePaperByPracticePaperIdResponse = practicePaperService.getPracticePaperByPracticePaperId(examPaperId);
		examPaper.setPracticePaper(practicePaperByPracticePaperIdResponse);
		List<ExamSection> allExamSectionsByPracticepaperIdResponse = examSectionsService.getAllExamSectionsByPracticepaperId(practicePaperByPracticePaperIdResponse.getPracticePaperId());
		examPaper.setSections(allExamSectionsByPracticepaperIdResponse);
		return examPaper;
	}

	@Override
	public List<ExamPaper> getExamPapersByExamIds(List<Integer> examPaperIds ) throws Exception {
		List<ExamPaper> examPapers = new ArrayList<ExamPaper>();
		for (Integer examPaperId : examPaperIds) {
			ExamPaper examPaperByExamPaperId = getExamPaperByExamPaperId(examPaperId);
			examPapers.add(examPaperByExamPaperId);
		}
		return examPapers;
	}

	@Override
	public ExamPaper saveExamPaper(ExamPaper examPaper) throws Exception {
		ExamPaper saveExamPaperResponse = new ExamPaper();

		PracticePaper savePracticePaperResponse = practicePaperService.savePracticePaper(examPaper.getPracticePaper());
		saveExamPaperResponse.setPracticePaper(savePracticePaperResponse);
		if(savePracticePaperResponse != null) {
			saveExamPaperResponse.setPracticePaper(savePracticePaperResponse);
			List<ExamSection> examSectionsList = populatePracticepaperIdInSections(examPaper.getSections(),savePracticePaperResponse);
			List<ExamSection> saveAllExamSectionsResponse = examSectionsService.saveAllExamSections(examSectionsList);
			if(!saveAllExamSectionsResponse.isEmpty()) {
				saveExamPaperResponse.setSections(saveAllExamSectionsResponse);
			}
		}
		return saveExamPaperResponse;
	}
	
	@Override
	public List<ExamPaper> saveExamPapers(List<ExamPaper> examPapers) throws Exception {
		List<ExamPaper> examPapersResonse = new ArrayList<ExamPaper>();
		for(ExamPaper examPaper : examPapers) {
			examPapersResonse.add(saveExamPaper(examPaper));
		}
		return examPapersResonse;
	}

	private List<ExamSection> populatePracticepaperIdInSections(List<ExamSection> examSections, PracticePaper practicePaper){
		for(int i=0;i<examSections.size();i++) {
			examSections.get(i).getSection().setPracticePaper(practicePaper);
		}
		return examSections;
	}
}
