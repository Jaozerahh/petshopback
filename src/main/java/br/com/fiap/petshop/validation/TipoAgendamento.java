package br.com.fiap.petshop.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target(FIELD)
@Constraint(validatedBy = TipoAgendamentoValidator.class)
@Retention(RUNTIME)
public @interface TipoAgendamento {

    String message() default "Tipo inválido. Tipo deve ser ENTRADA ou SAIDA.";

    Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
