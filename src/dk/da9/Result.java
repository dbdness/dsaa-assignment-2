package dk.da9;

public enum Result {
    Pass("You should be able to pass the exam."),
    Fail("You could easily fail the exam");

    private String value;
     Result(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
