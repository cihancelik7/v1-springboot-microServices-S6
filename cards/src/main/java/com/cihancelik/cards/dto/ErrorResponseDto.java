package com.cihancelik.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Schema(
        name = "ErrorResponse",
        description = "Schema To Hold Error Response Information"
)
public class ErrorResponseDto {
    @Schema(
            description = "API Path Invoked By Client"
    )
    private String apiPath;

    @Schema(
            description = "Error Code Representing The Error Happened"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error Message Representing The Error Happened"
    )
    private String errorMessage;

    @Schema(
            description = "Time Representing When The Error Happened"
    )
    private LocalDateTime errorTime;
}
