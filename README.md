# Linkin Park-AI 🎸

Bem-vindo ao **Linkin Park-AI**, o projeto da primeira banda 100% virtual que vai revolucionar o mundo da música (ou quase isso)!  
Combinando tecnologia, criatividade e um pouquinho de nostalgia do bom e velho rock, esse projeto foi criado com o objetivo de aprender e aplicar os principais conceitos do **Spring Boot** na prática, de forma leve e divertida!

---
<br/>

## O início de tudo 🦾
Imagine que os integrantes da banda *Linkin Park* resolveram inovar: agora, com o avanço da tecnologia, eles decidiram se tornar uma banda 100% digital — com integrantes criados por inteligência artificial, que interagem com o público através de uma aplicação web.

Nosso objetivo aqui é construir essa aplicação REST que vai gerenciar a estrutura dessa banda virtual, chamada **Linkin Park-AI**.

---
<br/>

## As requisições REST e o CRUD 📖

No universo das APIs, usamos diferentes tipos de requisição HTTP para representar as ações do CRUD. Aqui vai uma analogia rock'n'roll pra lembrar:

- `POST` → **Create** (Criar)  
  > Como lançar um novo álbum — estamos colocando algo novo no ar.

- `GET` → **Read** (Ler)  
  > Como acessar o setlist de um show — apenas lendo as informações.

- `PUT` → **Update** (Atualizar)  
  > Como trocar a ordem de todas as músicas em um show — você atualiza completamente algo que já existe.

- `PATCH` → **Update** (Atualizar)  
  > Como trocar um trecho ou nota de uma música — você atualiza parcialmente algo que já existe.

- `DELETE` → **Delete** (Deletar)  
  > Como remover uma música da playlist — excluindo de vez.

---
<br/>

## Conhecendo a Entidade - Banda 🎶

Antes de mostrar a banda ao mundo, precisamos estruturar bem os integrantes da Link Park-AI. Cada integrante será representado por uma **entidade**, e vai conter as seguintes características:

- `nome` — Nome do integrante  
- `dataEntrada` — Data em que entrou na banda  
- `idade` — Idade atual do integrante  
- `papel` — O papel dele na banda (ex: vocalista, guitarrista, baterista...)  

**Importante:** Cada integrante deve ter **apenas um** papel!

Se você achar que existe alguma outra característica legal de se guardar sobre os membros da banda, fique à vontade para propor e adicionar. Afinal, criar é parte do processo!

---
<br/>

## Estrutura de Projeto 📦

Durante o projeto, vamos utilizar uma estrutura de pacotes comum em aplicações Spring Boot.  
Ela ajuda a manter o código organizado e cada parte com sua responsabilidade:

- `controller`: onde ficam os endpoints da aplicação.
- `service`: onde acontece a lógica de negócio.
- `repository`: responsável por interagir com o banco de dados.
- `entity`: representa as tabelas do banco, ou seja, nossos "objetos do mundo real".
- `dto`: carrega apenas os dados necessários para entrada e saída de informações.
- `mapper`: faz a conversão entre `entity` e `dto`.
- `exception`: tratamento de erros personalizado (iremos usar mais pra frente).

---
<br/>

## Configuração Inicial do Projeto ⚙️

Com as informações acima em mente, é hora de colocar a mão na massa!  
Sua próxima missão é estruturar o esqueleto do projeto — sem lógica ainda, apenas a base.  

**O que você precisa criar:**

- Todos os **pacotes** listados anteriormente (`controller`, `service`, etc.)
- Uma **classe para cada pacote** (já com as ligações de uma a outra)
- A **classe da entidade** `Banda`, com os atributos listados acima
- A **classe Mapper** (por enquanto vazia)

> Lembre-se: Não crie DTOs nem regras de negócio ainda — o foco é só na estrutura!

---
<br/>

## Ligando o Banco ao Spring🎲
### application.properties

Dentro do seu arquivo `application.properties`, no pacote `resources`, adicione as configurações abaixo:

```properties
# permite o acesso ao H2 Console: http://localhost:8080/h2-console
spring.h2.console.enabled=true

# configura o banco de dados H2 em memória
spring.datasource.url=jdbc:h2:mem:banco

# permite que o banco seja criado/atualizado automaticamente
spring.jpa.hibernate.ddl-auto=update
```

Essas configurações são fundamentais para conseguirmos testar o projeto localmente e garantir que o banco em memória funcione direitinho.

---
<br/>

**Quando finalizar, suba o novo projeto para o GitHub com o commit: `feat: pacotes e classes para projeto / fix: application properties` e aguarde os próximos passos!☝️🤓**