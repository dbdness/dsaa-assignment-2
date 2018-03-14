package dk.da9;

class Node {
    private Question question;
    private Result result;
    private Node[] children;

    Node(Question question, Result result, Node[] children) {
        this.question = question;
        this.result = result;
        this.children = children;
    }

    public Question getQuestion() {
        return question;
    }

    public Result getResult() {
        return result;
    }

    public Node[] getChildren() {
        return children;
    }

}
