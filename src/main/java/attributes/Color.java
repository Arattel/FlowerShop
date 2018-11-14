package attributes;
import lombok.Getter;


@Getter
public enum Color {
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00"), YELLOw("#FFFF00"), ORANGE("#FF6347");
    private String code;
    Color(String code){
        this.code = code;
    }
}
