# Backend do Sistema de Cadastro de Usuários
Este é o repositório do backend para um sistema simples de cadastro de usuários, desenvolvido utilizando Java Spring Boot.

## Tecnologias Utilizadas
- Java Spring Boot: Framework de desenvolvimento de aplicações web em Java.
- MySQL: Sistema de gerenciamento de banco de dados relacional.
Spring Data JPA: Facilita o acesso e a persistência de dados em bancos de dados relacionais no Spring.
Spring Security: Fornece autenticação e autorização para a aplicação.
Spring Web: Facilita o desenvolvimento de aplicativos web usando Spring MVC.
Maven: Gerenciador de dependências para Java.

## Pré-requisitos
- JDK 8 ou superior instalado
- MySQL instalado e configurado
- Configuração do Banco de Dados
Configure as credenciais do banco de dados no arquivo application.properties:
bash
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/cadastro_usuarios
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

Como Executar
- Clone este repositório:
bash
Copy code
git clone https://github.com/seu-usuario/backend-cadastro-usuarios.git
Navegue até o diretório do projeto:
bash
Copy code
cd backend-cadastro-usuarios
Execute o aplicativo utilizando Maven:
arduino
Copy code
./mvnw spring-boot:run
O backend estará disponível em http://localhost:8080.

## Endpoints
/api/usuarios: Retorna a lista de todos os usuários cadastrados.
/api/usuarios/{id}: Retorna as informações de um usuário específico.
/api/usuarios/criar: Cria um novo usuário.
/api/usuarios/{id}/atualizar: Atualiza as informações de um usuário existente.
/api/usuarios/{id}/excluir: Exclui um usuário existente.
Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.
