package com.cihancelik.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(
        name = "Loans",
        description = "Schema to hold Loan Information"
)
@Data
public class LoansDto {
    @NotEmpty(message = "Loan Number Can Not be a Null or Empty")
    @Pattern(regexp = "(ˆ$|[0-9]{10})", message = "Mobile Number Must Be 10 Digits")
    @Schema(
            description = "Mobile Number of Customer", example = "5335661122"
    )
    private String mobileNumber;

    @NotEmpty(message = "Loan Number Can not be a Null or Empty")
    @Pattern(regexp = "ˆ$|[0-9]{12}", message = "LoanNumber must be 12 digits")
    @Schema(
            description = "", example = "100110021003"
    )
    private String loanNumber;

    @NotEmpty(message = "LoanType can not be a null or empty")
    @Schema(
            description = "Type of the Loan", example = "Home Loan"
    )
    private String loanType;

    @Positive(message = "Total Loan Amount should be greater than 'ZERO'")
    @Schema(
            description = "Total Loan Amount", example = "100000"
    )
    private int totalLoan;

    @PositiveOrZero(message = "Total Loan Amount paid should be equal or greater than 'ZERO'")
    @Schema(
            description = "Total Loan amount paid", example = "1000"
    )
    private int amountPaid;

    @PositiveOrZero(message = "Total Outstanding Amount should be equal or greater than 'ZERO'")
    @Schema(
            description = "Total Outstanding Amount Against a Loan", example = "99000"
    )
    private int outstandingAmount;
}
