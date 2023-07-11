package enumm;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ColorEnum {
    RED(255, 0, 0);
    private final int red;
    private final int green;
    private final int blue;
}
