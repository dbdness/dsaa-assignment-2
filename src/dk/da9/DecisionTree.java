package dk.da9;

public class DecisionTree {
    private Node getRootNode() {
        Node r1 = new Node(null, Result.Pass, null);
        Node r2 = new Node(null, Result.Fail, null);

        Node q4_3 = new Node(Question.MakeExercises, null, new Node[]{r1, r1});
        Node q4_2 = new Node(Question.MakeExercises, null, new Node[]{r1, r2});
        Node q4_1 = new Node(Question.MakeExercises, null, new Node[]{r1, r1});

        Node q3_2 = new Node(Question.AttendLectures, null, new Node[]{q4_3, r2});
        Node q3_1 = new Node(Question.AttendLectures, null, new Node[]{q4_1, q4_2});

        Node q2_2 = new Node(Question.HandInsMadeInTime, null, new Node[]{q3_2, r2});
        Node q2_1 = new Node(Question.HandInsMadeInTime, null, new Node[]{q3_1, r2});

        Node q1 = new Node(Question.ReadTextbook, null, new Node[]{q2_1, q2_2});

        return q1;
    }

    public String getResult(boolean[] answers) {
        Node lastNote = getRootNode();
        for (int i = 0; i < 4; i++) {
            boolean answer = answers[i];

            //If answer is yes
            if (answer) {
                //Moves to the left on the tree (Yes)
                Node yesNode = lastNote.getChildren()[0];
                if (yesNode.getResult() != null) return yesNode.getResult().getValue();
                lastNote = yesNode;
            }
            //If answer is no
            else {
                //Moves to the right on the tree (No)
                Node noNode = lastNote.getChildren()[1];
                if (noNode.getResult() != null) return noNode.getResult().getValue();
                lastNote = noNode;
            }
        }

        return lastNote.getResult().getValue();
    }
}
