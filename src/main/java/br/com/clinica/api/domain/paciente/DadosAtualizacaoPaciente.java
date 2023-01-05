package br.com.clinica.api.domain.paciente;

import jakarta.validation.constraints.NotNull;
import br.com.clinica.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
