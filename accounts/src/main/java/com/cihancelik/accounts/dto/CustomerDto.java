package com.cihancelik.accounts.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account Information"
)
public class CustomerDto {

    @Schema(
            description = "Name of the Customer", example = "Maze Bank"
    )
    @NotEmpty(message = "Name Can Not Be a null or Empty")
    @Size(min = 5, max = 30, message = "The Length Of THe Customer Name Should Be Between 5 and 30")
    private String name;

    @Schema(
            description ="Email address of the Customer",example = "tutor@gmazebank.com"
    )
    @NotEmpty(message = "Email Address Can Not Be a null or Empty")
    @Email(message = "Email Address Should Be Valid Value")
    private String email;

    @Schema(
            description = "Mobile Number of the Customer", example = "5335661122"
    )
    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile Number Must be 10 Digits")
    private String mobileNumber;

    @Schema(
            description = "Account Details of the Customer"
    )
    private AccountsDto accountDto;
}
