package com.cihancelik.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account Information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber Can Not Be a null or Empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    @Schema(
            description = "Account Number of Maze Bank Account", example = "1231231231"
    )
    private Long accountNumber;

    @NotEmpty(message = "AccountType Can Not Be a null or Empty")
    @Schema(
            description = "Account Type of Maze Bank Account", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "BranchAddress Can Not Be a null or Empty")
    @Schema(
            description = "Maze Bank branch address", example = "Bomonti-Sisli 34380, Istanbul"
    )
    private String branchAddress;
}
