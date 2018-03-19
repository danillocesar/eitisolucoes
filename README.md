# Eiti Soluções - Lista de Usuários

Primeiramente, para rodar o projeto na sua maquina, é necessário ter instalado o Java 1.8 e um servidor de MySql na maquina local.

Feito isso, é preciso rodar o arquivo eiti.sql em seu servidor de banco de dados. Em seguida, execute o arquivo .war em sua linha de comando da seguinte maneira: java -jar UsersList.war

Após todo o procedimento, basta acessar a url http://localhost:8080

# Estratégia

Foi utilizado a ferramenta Spring Boot pela facilidade do deploy. Por isso, opitei por utilizar o padrão Spring com camadas Controller, Service e Dao, deixando cada camada responsável por sua tarefa, assim facilitando a manuntenção e novas implementações futuras.

Além disso, para persistencia, foi utilizado Hibernate por sua fácil integração com o Spring boot.

Para o front end, utilizei jquery para fazer a solicitação da lista via Ajax e bootstrap para dar uma cara mais amigavel ao projeto.

# Melhorias

Para aprimorar o projeto, acredito que incluir uma ferramenta de login seria interessante e então fazer o desenvolvimento da parte de segurança do projeto, provavelmente utilizando o proprio Spring Security.




