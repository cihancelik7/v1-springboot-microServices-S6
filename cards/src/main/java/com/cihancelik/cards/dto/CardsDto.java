package com.cihancelik.cards.dto;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(
        name = "Cards",
        description = "Schema to hold Card Information"

)
@Data
public class CardsDto {

    @NotEmpty(message = "Mobile Number can not be a null or empty")
    @Pattern(regexp = "(ˆ$|[0-9]{10})", message = "Mobile Number Must be 10 Digits")
    @Schema(
            description = "Mobile Number of Customer", example = "5335821616"
    )
    private String mobileNumber;

@NotEmpty(message = "Card Number can not be a null or empty")
@Pattern(regexp = "(ˆ$|[0-9]{12})", message = "Card Number Must be 16 Digits")
@Schema(
        description = "Card Number", example = "1234567890123456"
)
    private String cardNumber;

    @NotEmpty(message = "Card Type can not be a null or empty")
    @Schema(
            description = "Type Of The Card", example = "Credit Card"
    )
    private String cardType;

    @Positive(message = "Total Card Limit Should Be Greater Than Zero")
    @Schema(
            description = "Total Amount Limit Available Against A Card",example = "100000"
    )
    private int totalLimit;

    @PositiveOrZero(message = "Total Amount Used Should Be Equal Or Greater Than Zero")
    @Schema(
            description = "Total Amount Used By A Customer", example = "1000"
    )
    private int amountUsed;

    @PositiveOrZero(message = "Total Available Amount Should Be Equal Or Greater Than Zero")
    @Schema(
            description = "Total Amount Available For A Card", example = "90000"
    )
    private int availableAmount;
}
