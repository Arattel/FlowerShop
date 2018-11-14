package attributes;
import lombok.Getter;

@Getter
public enum Odor {
    NO_ODOR("no odor"), WEAK(" weak"), STRONG("strong"), INTOLERABLE("intolerable");
    private String smell;
    Odor(String smell){
        this.smell = smell;
    }
}
