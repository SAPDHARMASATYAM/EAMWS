package in.co.examsadda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.co.examsadda.model.ExamPaper;
import in.co.examsadda.service.ExamPaperService;

@RestController
@RequestMapping("exam")
public class ExamController {

	@Autowired
	private ExamPaperService examPaperService;

	/* This method is for single practice paper based on practice paper id */
	@RequestMapping(value = "/getExamPaperByExamPaperId/{examPaperId}", method = RequestMethod.GET, produces = "application/json")
	public ExamPaper getExamPaperByExamPaperId(@PathVariable(name = "examPaperId") Integer examPaperId)
			throws Exception {
//		return examPaperService.findExamPaperByExamPaperId(examPaperId);
		return null;// new in.co.examsadda.util.ExamController().getExamPaperByExamPaperId(examPaperId);
	}

	@RequestMapping(value = "/getExamPapersByCourseId", method = RequestMethod.GET, produces = "application/json")
	public List<ExamPaper> getExamPapersByCourseId(@RequestParam(name = "examId") Integer examId) {
		return examPaperService.findExamPapersByCourseId(examId);
	}

	@RequestMapping(value = "/saveExamPaper", method = RequestMethod.POST, produces = "application/json")
	public String saveExamPaper(@RequestBody ExamPaper examPaper) {
		return examPaperService.saveExamPaper(examPaper);
	}

	@RequestMapping(value = "/saveExamPapers", method = RequestMethod.POST, produces = "application/json")
	public String saveExamPapers(@RequestBody List<ExamPaper> examPapers) {
		return examPaperService.saveExamPapers(examPapers);
	}

	@RequestMapping(value = "/updateExamPaperByExamPaperId", method = RequestMethod.PUT, produces = "application/json")
	public String updateExamPaperByExamPaperId(@RequestBody ExamPaper examPaper) {
		return examPaperService.updateExamPaperByExamId(examPaper);
	}

	@RequestMapping(value = "/deleteExamPaperByExamPaperId", method = RequestMethod.DELETE, produces = "application/json")
	public String deleteExamPaperByExamPaperId(@RequestBody Integer examPaperId) {
		return examPaperService.deactivateExamPaperByExamPaperId(examPaperId);
	}

	@RequestMapping(value = "/deleteExamPapersByExamId", method = RequestMethod.DELETE, produces = "application/json")
	public String deleteExamPapersByExamId(@RequestBody Integer examId) {
		return examPaperService.deactivateExamPapersByExamId(examId);
	}

	@RequestMapping(value = "/activateExamPaperByExamPaperId", method = RequestMethod.PUT, produces = "application/json")
	public String activateExamPaperByExamPaperId(@RequestBody Integer examPaperId) {
		return examPaperService.activateExamPaperByExamPaperId(examPaperId);
	}

	@RequestMapping(value = "/deactivateExamPaperByExamPaperId", method = RequestMethod.PUT, produces = "application/json")
	public String deactivateExamPaperByExamPaperId(@RequestBody Integer examPaperId) {
		return examPaperService.deactivateExamPaperByExamPaperId(examPaperId);
	}

	@RequestMapping(value = "/activateExamPapersByExamId", method = RequestMethod.PUT, produces = "application/json")
	public String activateExamPapersByExamId(@RequestBody Integer examId) {
		return examPaperService.activateExamPapersByExamId(examId);
	}

	@RequestMapping(value = "/deactivateExamPapersByExamId", method = RequestMethod.PUT, produces = "application/json")
	public String deactivateExamPapersByExamId(Integer examId) {
		return examPaperService.deactivateExamPapersByExamId(examId);
	}
}
