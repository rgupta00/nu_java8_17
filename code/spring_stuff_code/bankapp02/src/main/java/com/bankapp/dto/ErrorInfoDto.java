package com.bankapp.dto;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorInfoDto {
	private LocalDateTime timestamp;
	private String status;
	private String error;
	private String toContact;
}
