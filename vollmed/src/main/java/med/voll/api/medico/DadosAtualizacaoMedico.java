package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
                                     @NotNull
                                     Long Id,
                                     String nome,
                                     String telefone,
                                     DadosEndereco endereco) {
}
