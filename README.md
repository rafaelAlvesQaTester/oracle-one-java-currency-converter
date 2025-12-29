# 💱 Conversor de Moedas — Challenge Back End ONE (Java)

## 📌 Descrição do Projeto

Este projeto consiste no desenvolvimento de um **Conversor de Moedas em Java**, com interação via **console**, capaz de realizar conversões monetárias utilizando **taxas de câmbio em tempo real**, obtidas por meio da **ExchangeRate-API**.

O projeto faz parte do **Challenge Back End ONE (Oracle Next Education)** e tem como objetivo aplicar, na prática, conceitos fundamentais de **Java**, **Orientação a Objetos**, **consumo de APIs**, **manipulação de JSON** e **boas práticas de desenvolvimento**.

---

## 🎯 Objetivo

Desenvolver uma aplicação back-end que:

- Interaja com o usuário via console  
- Ofereça um menu com opções de conversão de moedas  
- Utilize **taxas de câmbio dinâmicas**, obtidas em tempo real via API  
- Realize validações de entrada  
- Exiba resultados formatados e claros ao usuário  

---

## ⚙️ Funcionalidades

- Menu interativo no console  
- Conversão entre moedas da:
  - **América do Sul**
  - **América do Norte**
  - **Zona do Euro**
- Taxas de câmbio atualizadas em tempo real  
- Validação de entradas do usuário:
  - Não permite valores negativos  
  - Limite máximo de **1 bilhão**  
  - Tratamento de opções inválidas no menu  
- Resultados formatados com **duas casas decimais**  
- Mensagens claras e amigáveis  

---

## 🌍 Moedas Suportadas

| Código | Moeda |
|------|------|
| BRL | Real Brasileiro |
| ARS | Peso Argentino |
| BOB | Boliviano |
| CLP | Peso Chileno |
| COP | Peso Colombiano |
| USD | Dólar Americano |
| CAD | Dólar Canadense |
| MXN | Peso Mexicano |
| EUR | Euro |

---

## 🛠️ Tecnologias Utilizadas

- **Java 17+**
- **ExchangeRate-API**
- **Gson**
- **HttpURLConnection**
- **IntelliJ IDEA**
- **Git & GitHub**

---

## 🗂️ Estrutura do Projeto


---

## 🔐 Configuração da API Key

Este projeto utiliza a **ExchangeRate-API**.

### 1️⃣ Crie o arquivo `config.properties` na raiz do projeto:

```properties
API_KEY=SUA_CHAVE_DE_API_AQUI

▶️ Como Executar o Projeto

Clone o repositório:
git clone https://github.com/rafaelAlvesQaTester/oracle-one-java-currency-converter.git

Abra o projeto no IntelliJ IDEA

Crie o arquivo config.properties com sua API Key

Execute a classe:

Interaja com o menu via console

🧪 Exemplo de Uso
Para o valor de 1.000,00 EUR, a sua conversão atual será de 6.526,70 BRL

✅ Boas Práticas Aplicadas

Separação de responsabilidades (camadas)

Encapsulamento e organização de pacotes

Tratamento de erros e entradas inválidas

Proteção de dados sensíveis

Código limpo e legível

Versionamento com Git

📚 Aprendizados

Consumo de APIs REST em Java

Manipulação de JSON com Gson

Orientação a Objetos

Estruturação de projetos back-end

Boas práticas de desenvolvimento

👤 Autor

Marcos Rafael Alves
Challenge Back End ONE — Oracle Next Education

GitHub: rafaelAlvesQaTester


