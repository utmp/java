class Student{
    String name;
    int midTerm;
    int finalExam;
    int calcScore(){
        return (int)(midTerm*0.4f+finalExam*0.6f);
    }
    void printResult(){
        int score = calcScore();
        System.out.printf("Student name: %s, score: %d",name,score);
        if(score >= 60){
            System.out.printf("%n Student passed successfully! %n");
        }
        else{System.out.printf("%n Student fails, try again! %n");}
    }
}