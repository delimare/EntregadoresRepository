package com.dianome.Entregadores.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record EntregadorDto( @NotBlank String nome, 
		@NotNull Integer cpf, 
		@NotNull Double capacidade) {
}
