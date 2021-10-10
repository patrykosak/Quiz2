package pl.edu.pb.wi;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Question {
    private int QuestionId;
    private boolean trueAnswer;

    public Question(int questionId,boolean trueAnswer){
        this.QuestionId = questionId;
        this.trueAnswer = trueAnswer;
    }
}
