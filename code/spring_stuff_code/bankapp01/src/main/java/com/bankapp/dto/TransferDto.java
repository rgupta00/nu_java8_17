package com.bankapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TransferDto {
	private Integer fromAccId;
	private Integer toAccId;
	private Double amount;
}
