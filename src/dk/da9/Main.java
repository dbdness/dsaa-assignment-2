package dk.da9;

public class Main {

    public static void main(String[] args) {
        DecisionTree decisionTree = new DecisionTree();
        //true for 'yes', false for 'no'.
        boolean[] answers = {false, true, false, true};
        printAnswers(answers);
        System.out.println(String.format("\nResult:\n%s", decisionTree.getResult(answers)));
    }

    private static void printAnswers(boolean[] answers){
        System.out.println("Answers:");
        for(boolean answer: answers){
            if(answer) System.out.println("Yes");
            else{
                System.out.println("No");
            }
        }
    }
}
