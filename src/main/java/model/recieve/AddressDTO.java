package model.recieve;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@Setter
@ToString
public class AddressDTO {
    private UUID id;

    @NotBlank
    private String name;
    private Double latitude;
    private Double longitude;
    @JsonProperty("parent_id")
    private UUID parentId;

    @NotNull
    private Integer level;
}

