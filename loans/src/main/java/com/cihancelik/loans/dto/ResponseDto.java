package com.cihancelik.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;


@Schema(
        name = "Response",
        description = "Schema to hold Successful response information"
)
@Data @AllArgsConstructor
public class ResponseDto {
    @Schema(
            description = "Status Code in the Response"
    )
    private String statusCode;
    @Schema(
        description = "Status Message in the Response"
    )
    private String statusMessage;
}
