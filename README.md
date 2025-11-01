# API Hexagonal

## Descrição
Projeto Java com arquitetura hexagonal (ports & adapters) usando Spring Boot e Maven. Estrutura pensada para separar domínio, casos de uso e adaptadores (REST, persistência), facilitando manutenção e testes.

## Tecnologias
- Java 17+ (compatível com versões mais recentes)
- Spring Boot
- Maven
- JUnit / Mockito (testes)
- IntelliJ IDEA (ambiente recomendado)
- Windows (ambiente do desenvolvedor principal)

## Principais features
- Organização em camadas seguindo Hexagonal Architecture
- Endpoints REST com tratamento centralizado de exceções
- Separação clara entre `application` (casos de uso) e `adapters` (entrada/saída)

## Estrutura do projeto
- `src/main/java/com/william/hexagonal`
    - `application` — lógica de negócio, casos de uso, exceções
    - `domain` — entidades, value objects, regras de domínio
    - `adapters` — implementações de entrada/saída (controllers, repositories, mappers)
    - `config` — configuração do Spring, beans e infra
- `src/test` — testes unitários e de integração

## Requisitos
- JDK 17 ou superior instalado
- Maven instalado
- IntelliJ IDEA (recomendado)
- Git (opcional)

## Como rodar (local)
1. Clonar o repositório:

   git clone <url-do-repositorio>
   cd <nome-do-projeto>

2. Compilar e executar:

   mvn clean package
   mvn spring-boot:run

3. A aplicação iniciará na porta `8080` por padrão. Endpoints REST disponíveis conforme controllers implementados.

## Boas práticas
- Manter regras de negócio no `domain` / `application`.
- Expor apenas DTOs nos adaptadores externos.
- Cobrir regras críticas com testes automatizados.
- Usar logs estruturados e tratamento centralizado de exceções.
- Seguir convenções de código e revisar PRs antes de merge.

## Contribuição
- Abra issues para bugs ou melhorias.
- Para PRs: garanta que os testes passem e siga o padrão de código do projeto.
- Adicione descrições claras e testes quando aplicar mudanças de comportamento.

## Licença
- MIT License (substitua conforme necessidade)

---
Mantido por WilliamWJD