package SKILL4;
class FinalKeyword{

    private final int blankFinalVar;
    private final StringBuilder finalRef = new StringBuilder("Hello");

    public FinalKeyword(int value) {
        this.blankFinalVar = value;
    }

    public final void displayFinalValues() {
        System.out.println("Blank final variable value: " + blankFinalVar);
        System.out.println("Content of final reference: " + finalRef);
    }

    public void modifyFinalReference() {
        finalRef.append(" World");
    }

    public static void main(String[] args) {
        FinalKeyword obj = new FinalKeyword(42);
        obj.displayFinalValues();
        obj.modifyFinalReference();
        obj.displayFinalValues();
    }
}
