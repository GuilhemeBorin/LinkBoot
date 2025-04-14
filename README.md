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

## Configuração do projeto ⚙️

Antes de criar qualquer coisa, precisamos configurar um novo projeto, aqui está o passo a passo:

1. Acesse o site [https://start.spring.io/](https://start.spring.io/)

2. Configure o projeto com as seguintes opções:
   - **Projeto**: Maven
   - **Linguagem**: Java
   - **Versão do Spring Boot**: 3.4.4
   - **Grupo**: `school`
   - **Artifact**: `sptech`
   - **Name**: `LinkBoot`
   - **Descrição**: `Meu projeto pessoal em Springboot`
   - **Package name**: `school.sptech`
   - **Packaging**: Jar
   - **Java**: 21

3. Dependências utilizadas:
   - Spring Web
   - Spring Data JPA
   - H2 Database
   - Validation

4. Após gerar o projeto, extraia os arquivos do `.zip` dentro do repositório:  
   [https://github.com/GuilhemeBorin/LinkBoot.git](https://github.com/GuilhemeBorin/LinkBoot.git)

5. **Atenção!**  
   A pasta `.git` **deve estar na mesma raiz** dos arquivos `src`, `pom.xml` e outros arquivos principais do projeto.  
   Isso garante que seu projeto está versionado corretamente com o Git e pronto para ser usado no GitHub.

<br/>
<br/>

---
<br/>

**Quando finalizar, suba o novo projeto para o GitHub com o commit: `add: estrutura projeto spring` e aguarde os próximos passos!☝️🤓**