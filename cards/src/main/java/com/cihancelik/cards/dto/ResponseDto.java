package com.cihancelik.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

@Schema(
        name = "Response",
        description = "Scheme To Hold Successful Response Information"
)
@Data
@AllArgsConstructor
public class ResponseDto {

    @Schema(
            description = "Status Code In The Response"
    )
    private String statusCode;

    @Schema(
            description = "Status Message In The Response"
    )
    private String statusMsg;


}
