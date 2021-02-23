package wstepoop.zajecia.adnotations.maxlengthstring;

public class TextParser {

    @MaxLength(maxLength = 20)
    private String text;

    public TextParser(String text) {
        this.text = text;
    }

    public void setText() {
        this.text = StringReader.readStringFromConsole();
        try {
            if (!TextValidator.validate(this)) {
                throw new IllegalArgumentException("Illegal text length!");
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
