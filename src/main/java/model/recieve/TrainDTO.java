package model.recieve;

import lombok.Getter;
import javax.validation.constraints.NotBlank;

@Getter
public class TrainDTO {
    @NotBlank
    private String name;
}
