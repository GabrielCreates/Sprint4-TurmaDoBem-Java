<div align="center">

<img src="https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
<img src="https://img.shields.io/badge/Quarkus-3.15.1-4695EB?style=for-the-badge&logo=quarkus&logoColor=white"/>
<img src="https://img.shields.io/badge/Oracle-DB-F80000?style=for-the-badge&logo=oracle&logoColor=white"/>
<img src="https://img.shields.io/badge/Maven-3.x-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white"/>
<img src="https://img.shields.io/badge/REST-API-009688?style=for-the-badge&logo=fastapi&logoColor=white"/>

<br/><br/>

# 🦷 Sorriso do Bem

### Inclusão Social Através do Sorriso

*Sistema de gestão odontológica para a ONG Turma do Bem*  
*FIAP — Challenge — Sprint 4*

<br/>

[![GitHub](https://img.shields.io/badge/GitHub-GabrielCreates-181717?style=flat-square&logo=github)](https://github.com/GabrielCreates/Sprint4-Java-SorrisodoBem)
[![FIAP](https://img.shields.io/badge/FIAP-Challenge%20TDB-ED1C24?style=flat-square)](https://fiap.com.br)

</div>

---

# 📌 Sobre o Projeto

O **Sorriso do Bem** foi desenvolvido em **Java** para apoiar digitalmente a ONG **Turma do Bem**, que oferece tratamentos odontológicos gratuitos a jovens em situação de vulnerabilidade social em todo o Brasil.

A solução centraliza a gestão de:

- Beneficiários atendidos pela ONG
- Dentistas voluntários cadastrados
- Doadores e doações recebidas
- Agendamentos e atendimentos realizados
- Triagens e procedimentos odontológicos

A API expõe endpoints completos (CRUD) para integração com o front-end da solução.

---

# 🛠️ Tecnologias Utilizadas

| Tecnologia | Versão | Descrição |
|:--|:--:|:--|
| Java | 17 | Linguagem principal |
| Quarkus | 3.15.1 | Framework REST |
| Oracle JDBC | 23.3.0 | Driver Oracle |
| Maven | 3.8+ | Gerenciamento de dependências |

---

# 🗂️ Estrutura do Projeto

```text
Sprint4-Java-SorrisodoBem/
├── pom.xml
├── README.md
└── src/
    └── main/
        ├── java/
        │   └── br/com/fiap/
        │       ├── Main.java
        │       │
        │       ├── entities/
        │       │   ├── Agendamento.java
        │       │   ├── Atendimento.java
        │       │   ├── Beneficiario.java
        │       │   ├── Dentista.java
        │       │   ├── Doacao.java
        │       │   ├── Doador.java
        │       │   ├── Procedimento.java
        │       │   └── Triagem.java
        │       │
        │       ├── dao/
        │       │   ├── AgendamentoDao.java
        │       │   ├── AtendimentoDao.java
        │       │   ├── BeneficiarioDao.java
        │       │   ├── DentistaDao.java
        │       │   ├── DoacaoDao.java
        │       │   ├── DoadorDao.java
        │       │   ├── ProcedimentoDao.java
        │       │   └── TriagemDao.java
        │       │
        │       ├── bo/
        │       │   ├── AgendamentoBO.java
        │       │   ├── AtendimentoBO.java
        │       │   ├── BeneficiarioBO.java
        │       │   ├── DentistaBO.java
        │       │   ├── DoacaoBO.java
        │       │   ├── DoadorBO.java
        │       │   ├── ProcedimentoBO.java
        │       │   └── TriagemBO.java
        │       │
        │       ├── resource/
        │       │   ├── AgendamentoResource.java
        │       │   ├── AtendimentoResource.java
        │       │   ├── BeneficiarioResource.java
        │       │   ├── DentistaResource.java
        │       │   ├── DoacaoResource.java
        │       │   ├── DoadorResource.java
        │       │   ├── ProcedimentoResource.java
        │       │   └── TriagemResource.java
        │       │
        │       ├── conexoes/
        │       │   └── ConexaoFactory.java
        │       │
        │       ├── exceptions/
        │       │   └── ErroNegocioException.java
        │       │
        │       └── main/
        │           ├── TesteAgendamento.java
        │           ├── TesteAtendimento.java
        │           ├── TesteBeneficiario.java
        │           ├── TesteConexao.java
        │           ├── TesteDentista.java
        │           ├── TesteDoacao.java
        │           ├── TesteDoador.java
        │           ├── TesteProcedimento.java
        │           └── TesteTriagem.java
        │
        └── resources/
            └── application.properties
```

---

# 🔗 Endpoints da API

## 👤 Beneficiários — `/beneficiarios`

| Método | Endpoint | Descrição | Status |
|:--:|:--|:--|:--:|
| GET | `/beneficiarios` | Lista todos os beneficiários | 200 |
| GET | `/beneficiarios/{id}` | Busca por ID | 200 / 404 |
| POST | `/beneficiarios` | Cadastro com validação de CPF | 201 / 400 / 500 |
| PUT | `/beneficiarios/{id}` | Atualização | 200 / 404 |
| DELETE | `/beneficiarios/{id}` | Remoção | 200 / 404 |

## 🦷 Dentistas — `/dentistas`

| Método | Endpoint | Descrição | Status |
|:--:|:--|:--|:--:|
| GET | `/dentistas` | Lista todos os dentistas | 200 |
| GET | `/dentistas/{id}` | Busca por ID | 200 / 404 |
| POST | `/dentistas` | Cadastro com validação de CRO | 201 / 400 / 500 |
| PUT | `/dentistas/{id}` | Atualização | 200 / 404 |
| DELETE | `/dentistas/{id}` | Remoção | 200 / 404 |

## 🤝 Doadores — `/doadores`

| Método | Endpoint | Descrição | Status |
|:--:|:--|:--|:--:|
| GET | `/doadores` | Lista todos os doadores | 200 |
| GET | `/doadores/{id}` | Busca por ID | 200 / 404 |
| POST | `/doadores` | Cadastro com validação de e-mail | 201 / 400 / 500 |
| PUT | `/doadores/{id}` | Atualização | 200 / 404 |
| DELETE | `/doadores/{id}` | Remoção | 200 / 404 |

## 💰 Doações — `/doacoes`

| Método | Endpoint | Descrição | Status |
|:--:|:--|:--|:--:|
| GET | `/doacoes` | Lista todas as doações | 200 |
| GET | `/doacoes/{id}` | Busca por ID | 200 / 404 |
| POST | `/doacoes` | Registro com validação de tipo e valor | 201 / 400 / 500 |
| PUT | `/doacoes/{id}` | Atualização | 200 / 404 |
| DELETE | `/doacoes/{id}` | Remoção | 200 / 404 |

## 📅 Agendamentos — `/agendamentos`

| Método | Endpoint | Descrição | Status |
|:--:|:--|:--|:--:|
| GET | `/agendamentos` | Lista todos os agendamentos | 200 |
| GET | `/agendamentos/{id}` | Busca por ID | 200 / 404 |
| POST | `/agendamentos` | Cadastro com validação de urgência | 201 / 400 / 500 |
| PUT | `/agendamentos/{id}` | Atualização | 200 / 404 |
| DELETE | `/agendamentos/{id}` | Remoção | 200 / 404 |

## 🏥 Atendimentos — `/atendimentos`

| Método | Endpoint | Descrição | Status |
|:--:|:--|:--|:--:|
| GET | `/atendimentos` | Lista todos os atendimentos | 200 |
| GET | `/atendimentos/{id}` | Busca por ID | 200 / 404 |
| POST | `/atendimentos` | Registro com validação de data e descrição | 201 / 400 / 500 |
| PUT | `/atendimentos/{id}` | Atualização | 200 / 404 |
| DELETE | `/atendimentos/{id}` | Remoção | 200 / 404 |

## 🔍 Triagens — `/triagens`

| Método | Endpoint | Descrição | Status |
|:--:|:--|:--|:--:|
| GET | `/triagens` | Lista todas as triagens | 200 |
| GET | `/triagens/{id}` | Busca por ID | 200 / 404 |
| POST | `/triagens` | Registro com classificação de risco | 201 / 400 / 500 |
| PUT | `/triagens/{id}` | Atualização | 200 / 404 |
| DELETE | `/triagens/{id}` | Remoção | 200 / 404 |

## 🔧 Procedimentos — `/procedimentos`

| Método | Endpoint | Descrição | Status |
|:--:|:--|:--|:--:|
| GET | `/procedimentos` | Lista todos os procedimentos | 200 |
| GET | `/procedimentos/{id}` | Busca por ID | 200 / 404 |
| POST | `/procedimentos` | Cadastro com validação de relatório | 201 / 400 / 500 |
| PUT | `/procedimentos/{id}` | Atualização | 200 / 404 |
| DELETE | `/procedimentos/{id}` | Remoção | 200 / 404 |

---

# ▶️ Projeto

## Pré-requisitos

- Java JDK 17+
- Maven 3.8+
- IntelliJ IDEA
- Acesso à rede Oracle FIAP

## Clonar o Repositório

```bash
git clone https://github.com/GabrielCreates/Sprint4-Java-SorrisodoBem.git
cd Sprint4-Java-SorrisodoBem
```

## API

API disponível em:

```
http://localhost:8080
```
---

# ⚙️ Configuração Oracle

```properties
quarkus.datasource.db-kind=oracle
quarkus.datasource.username=RM567023
quarkus.datasource.password=******
quarkus.datasource.jdbc.url=jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL
quarkus.http.port=8080
quarkus.http.cors=true
quarkus.http.cors.origins=*
```

---

# 🧠 Regras de Negócio

A camada BO implementa validações e lógicas como:

| Método | Classe | Descrição |
|:--|:--|:--|
| `validarCpf()` | BeneficiarioBO | Validação matemática dos dígitos verificadores |
| `verificarElegibilidade()` | BeneficiarioBO | Classifica prioridade por idade (menor, idoso, adulto) |
| `cadastrarComValidacao()` | BeneficiarioBO | Valida CPF, nome, data e duplicidade |
| `listarCasosUrgentes()` | BeneficiarioBO | Filtra por palavras-chave clínicas |
| `classificarPrioridade()` | AgendamentoBO | Classifica por nível de urgência (ALTA/MEDIA/BAIXA) |
| `classificarAntiguidade()` | AtendimentoBO | Calcula dias desde o atendimento |
| `calcularTotalDoacoes()` | DoacaoBO | Soma total de doações |
| `calcularTotalPorTipo()` | DoacaoBO | Soma por tipo (Dinheiro/Material) |
| `classificarRisco()` | TriagemBO | Classifica risco por palavras-chave clínicas |
| `classificarTipo()` | ProcedimentoBO | Categoriza procedimento (cirúrgico, preventivo, etc.) |
| `validarCro()` | DentistaBO | Valida formato do CRO |
| `validarEmail()` | DoadorBO | Valida formato de e-mail |

---

# 👥 Integrantes

| Nome | RM | GitHub |
|:--|:--|:--|
| Gabriel Rocha | RM567023 | [@GabrielCreates](https://github.com/GabrielCreates) |
| Luis Rodrigues | RM567918 | [@luisrodriguesss](https://github.com/luisrodriguesss) |
| Luiz Felipe Kichimoto | RM567726 | [@luizkichimoto](https://github.com/luizkichimoto) |
---

# 🔗 Repositório

📁 GitHub: https://github.com/GabrielCreates/Sprint4-TurmaDoBem-Java.git

---

<div align="center">

### FIAP — Challenge 2026

**Turma do Bem — Inclusão Social Através do Sorriso**

</div>
