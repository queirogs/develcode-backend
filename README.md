# Backend do Sistema de Cadastro de Usuários
Este é o repositório do backend para um sistema simples de cadastro de usuários, desenvolvido utilizando Java Spring Boot.

## Tecnologias Utilizadas
- Java Spring Boot: Framework de desenvolvimento de aplicações web em Java.
- MySQL: Sistema de gerenciamento de banco de dados relacional.
- Spring Data JPA: Facilita o acesso e a persistência de dados em bancos de dados relacionais no Spring.
- Spring Web: Facilita o desenvolvimento de aplicativos web usando Spring MVC.
- Maven: Gerenciador de dependências para Java.

## Pré-requisitos
- JDK 8 ou superior instalado
- MySQL instalado e configurado
- Configuração do Banco de Dados
Configure as credenciais do banco de dados no arquivo application.properties:
bash
Copy code
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/develcode?createDatabaseIfNotExist=true
spring.datasource.username=seu usuario
spring.datasource.password=sua senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

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
- (GET) /user Retorna a lista de todos os usuários cadastrados.
- (GET) /user/{id} Retorna o usuário cadastrado correspondente ao id da URL
- (POST) /user Insere um nvo usuário
- (PUT) /user/{id} Atualiza o usuário com id correspondente ao da URL
- (DELETE) /user/{id} Remove o usuário com o id correspondente ao da URL
