package model.recieve;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

@Getter
@ToString
public class UserDTO {
    @NotBlank
    private String name;

    @NotBlank
    private String email;

    @NotBlank
    @JsonProperty(value = "phone_number")
    private String phoneNumber;

//    @NotNull
//    @Enumerated(EnumType.STRING)
//    @JsonProperty(value = "user_role")
//    private UserRole userRole;

    @NotNull
    private List<UUID> userRoles;

    @NotNull
    private String password;
}
