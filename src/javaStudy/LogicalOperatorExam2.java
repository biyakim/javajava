package javaStudy;

public class LogicalOperatorExam2 {
	public boolean isAgeTwenties(int age) {
        boolean isTwenties = false;
        //아래 빈칸을 채워 코드를 완성하세요.
        if(age>=20&&age<29) {
            isTwenties = true;
        }
        else {
            isTwenties = false;
        }    
        return isTwenties;
    }

    public static void main(String[] args) {
        LogicalOperatorExam2 exam = new LogicalOperatorExam2();
        exam.isAgeTwenties(19);
        exam.isAgeTwenties(25);
    }
}
