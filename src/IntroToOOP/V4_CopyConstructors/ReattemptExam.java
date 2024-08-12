package IntroToOOP.V4_CopyConstructors;

public class ReattemptExam {
    public int reattemptExamID;
    public String reattemptExamName;
    public int reattemptExamScore;

    public ReattemptExam(int reattemptExamID, String reattemptExamName, int reattemptExamScore) {
        this.reattemptExamID = reattemptExamID;
        this.reattemptExamName = reattemptExamName;
        this.reattemptExamScore = reattemptExamScore;
    }

    public ReattemptExam(ReattemptExam other) {
        this.reattemptExamID = other.reattemptExamID;
        this.reattemptExamName = other.reattemptExamName;
        this.reattemptExamScore = other.reattemptExamScore;
    }
}
