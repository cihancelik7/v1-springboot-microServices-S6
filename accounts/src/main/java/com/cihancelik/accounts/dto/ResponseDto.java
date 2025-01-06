package com.cihancelik.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Response",
        description = "Schema To Hold Successful Response Information"
)
@Data
@AllArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Status Code in the Response"
    )
    // donus kodu 404 error, 200 success
    private String statusCode;

    @Schema(
            description = "Status Code in the Response"
    )
    private String statusMessage;


}
