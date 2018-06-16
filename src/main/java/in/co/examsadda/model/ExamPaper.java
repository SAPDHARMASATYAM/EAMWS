package in.co.examsadda.model;

import java.util.ArrayList;
import java.util.List;

import in.co.examsadda.entity.PracticePaper;

public class ExamPaper {
	
	private PracticePaper examPaper;
	private List<ExamSection> sections;
	/**
	 * 
	 */
	public ExamPaper() {
		examPaper = new PracticePaper();
		sections = new ArrayList<ExamSection>();
	}
	/**
	 * @param examPaper
	 * @param sections
	 */
	public ExamPaper(PracticePaper examPaper, List<ExamSection> sections) {
		this.examPaper = examPaper;
		this.sections = sections;
	}
	/**
	 * @return the examPaper
	 */
	public PracticePaper getExamPaper() {
		return examPaper;
	}
	/**
	 * @param examPaper the examPaper to set
	 */
	public void setExamPaper(PracticePaper examPaper) {
		this.examPaper = examPaper;
	}
	/**
	 * @return the sections
	 */
	public List<ExamSection> getSections() {
		return sections;
	}
	/**
	 * @param sections the sections to set
	 */
	public void setSections(List<ExamSection> sections) {
		this.sections = sections;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExamPaper [examPaper=" + examPaper + ", sections=" + sections + "]";
	}
	
	
}
