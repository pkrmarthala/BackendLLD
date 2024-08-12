package IntroToOOP.V4_CopyConstructors;

public class Exam {
    public int examID;
    public int examScore;
    ReattemptExam reattemptUnitTest;

    public Exam(int examID, int examScore) {
        this.examID = examID;
        this.examScore = examScore;
        this.reattemptUnitTest = new ReattemptExam(1, "UnitTest1", 80);
    }

    // Copy Constructor
    public Exam(Exam other) {
        this.examID = other.examID;
        this.examScore = other.examScore;
        // Shallow Copy this.reattemptUnitTest = other.reattemptUnitTest;
        // Deep Copy:
        this.reattemptUnitTest = new ReattemptExam(other.reattemptUnitTest);
    }
}
