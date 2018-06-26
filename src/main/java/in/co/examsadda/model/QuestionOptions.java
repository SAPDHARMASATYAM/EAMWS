package in.co.examsadda.model;

import java.util.ArrayList;
import java.util.List;

import in.co.examsadda.entity.Option;
import in.co.examsadda.entity.Question;

public class QuestionOptions {

    private Question question;
    private List<Option> options;

    /**
     *
     */
    public QuestionOptions() {
        question = new Question();
        options = new ArrayList<Option>();
    }

    /**
     * @param question
     * @param options
     */
    public QuestionOptions(Question question, List<Option> options) {
        this.question = question;
        this.options = options;
    }

    /**
     * @return the question
     */
    public Question getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(Question question) {
        this.question = question;
    }

    /**
     * @return the options
     */
    public List<Option> getOptions() {
        return options;
    }

    /**
     * @param options the options to set
     */
    public void setOptions(List<Option> options) {
        this.options = options;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "QuestionOption [question=" + question + ", options=" + options + "]";
    }

}
