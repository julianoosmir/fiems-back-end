package prova.dto;

import java.time.LocalDate;

public record ResgistroDTO(Long id,String nome, String telefone, String email, LocalDate data,String casaNome,String EspecializacaoNome) {}
