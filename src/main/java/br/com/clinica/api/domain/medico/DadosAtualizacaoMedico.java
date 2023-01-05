package br.com.clinica.api.domain.medico;

import jakarta.validation.constraints.NotNull;
import br.com.clinica.api.domain.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
