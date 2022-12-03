package com.bankapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WithdrawDto {
	private Integer id;
	private Double amount;
}
