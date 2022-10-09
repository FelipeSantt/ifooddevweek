
package me.dio.sacola.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@AllArgsConstructor // Criando todos os construtores
@Builder // Vacilitar na hora de criar um objeto
@Data // Criar getter, setter, equals() and hashCode(), etc...
@Embeddable // Que a classe endereço nao crie uma tabela
@NoArgsConstructor //
public class Endereco {
    private String cep;
    private String complemento;
}

