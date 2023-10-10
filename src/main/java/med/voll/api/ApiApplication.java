package med.voll.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

}

///
// Caso ocorra erro no código da migration estiver inválido,
// contendo algum trecho de SQL digitado de maneira incorreta.
//Para resolver esse problema será necessário acessar o banco
// de dados da aplicação e executar o seguinte comando sql:
// delete from flyway_schema_history where success = 0;
///
