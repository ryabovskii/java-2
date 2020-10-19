public class ParserCalculatorException extends Exception {
    private static final long serialVersionUID = 1L;
    private String message;

    public ParserCalculatorException(String m) {
        super();
        this.message = m;
    }

    public String toString() {
        return this.message;
    }
}
