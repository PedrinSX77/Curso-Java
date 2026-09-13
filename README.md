# ☕ Curso de Java: Do Zero à Programação Orientada a Objetos

Repositório dedicado ao registro de estudos, anotações e exercícios práticos desenvolvidos durante o curso completo de Java. O objetivo deste repositório é documentar a evolução no aprendizado da linguagem Java, desde a lógica de programação e sintaxe fundamental até tópicos avançados de Programação Orientada a Objetos (POO).

---

## 📌 Status do Projeto

![Status](https://img.shields.io/badge/Status-Em%20Andamento-yellow)
![Java](https://img.shields.io/badge/Java-JDK%2021%2B-orange?logo=openjdk)
![Git](https://img.shields.io/badge/Versionamento-Git%20%26%20GitHub-blue?logo=git)

---

## 📚 Trilha de Aprendizado e Estrutura

O repositório está organizado em módulos/seções sequenciais para facilitar a navegação e a consulta rápida:

```text
Curso-Java/
├── Section4/                  # Estrutura Sequencial
│   └── Program.java           # Configuração de ambiente, Locale e saída de dados
├── Section5/                  # Estrutura Condicional
│   └── Program.java           # if-else, switch-case e operador condicional ternário
├── Section6/                  # Estruturas Repetitivas e Depuração
│   ├── Program.java           # Cálculo de área/terreno e introdução ao Debug
│   ├── While/
│   │   └── While.java         # Estrutura repetitiva 'while' (condição no início)
│   ├── For/
│   │   └── For.java           # Estrutura repetitiva 'for' (iterações pré-determinadas)
│   └── DoWhile/
│       └── DoWhile.java       # Estrutura repetitiva 'do-while' (execução prévia à validação)
├── Section8/                  # Introdução à Programação Orientada a Objetos (POO)
│   ├── topico1/               # Classes, atributos e métodos
│   │   ├── Program.java       # Comparação de áreas com instanciação de objetos
│   │   └── entities/
│   │       └── Triangle.java  # Classe Triangle com atributos e método area()
│   ├── topico2/               # Reutilização, estado de objeto e toString()
│   │   ├── Program.java       # Gerenciamento de estoque com leitura e atualização
│   │   └── entities/
│   │       └── Product.java   # Classe Product com métodos de negócio e sobrescrita de toString()
│   └── topico3/               # Membros Estáticos (static) e Constantes
│       ├── Program.java       # Cálculos geométricos invocando membros de classe
│       └── Calculator.java    # Classe utilitária com constante PI e métodos estáticos
├── Section9/                  # Construtores, Sobrecarga e Encapsulamento
│   ├── Program.java           # Instanciação com construtores sobrecarregados e acesso via métodos
│   └── entities/
│       └── Product.java       # Classe Product com atributos privados, getters/setters e regras de negócio
└── exercicios/                # Resoluções de desafios e exercícios de fixação
```

---

## 📖 Conteúdo Detalhado por Seção

### 🔹 [Section 4: Estrutura Sequencial](./Section4/)
* **Conceitos abordados:**
  * Configuração de localidade com `Locale.setDefault(Locale.US)` para padronização de separadores decimais (ponto vs. vírgula).
  * Saída de dados na tela (`System.out.print`, `System.out.println` e `System.out.printf`).
  * Tipos primitivos e boas práticas na declaração de variáveis.

### 🔹 [Section 5: Estrutura Condicional](./Section5/)
* **Conceitos abordados:**
  * Estruturas de controle de fluxo: `if`, `else if` e `else`.
  * Verificação de paridade com operador de módulo (`%`).
  * Estrutura de múltipla escolha `switch-case` com `break` e tratamento de valor padrão (`default`).
  * Operador condicional ternário `(condição ? valor_se_verdadeiro : valor_se_falso)` para simplificação de lógica condicional.

### 🔹 [Section 6: Estruturas Repetitivas & Depuração](./Section6/)
* **Conceitos abordados:**
  * **Depuração de Código (Debug):** Execução passo a passo, inspeção de variáveis e uso de breakpoints para análise de fluxo em tempo de execução.
  * **Laço `while`:** Ideal quando não se sabe previamente o número de repetições, dependendo de uma condição de parada inicial.
  * **Laço `for`:** Ideal para iterações sobre intervalos e contagens conhecidas.
  * **Laço `do-while`:** Bloco executado ao menos uma vez antes da checagem da condição, amplamente utilizado em menus e fluxos com confirmação de repetição do usuário `(s/n)`.

### 🔹 [Section 8: Introdução à Programação Orientada a Objetos (POO)](./Section8/)
* **Tópico 1 - Classes, Atributos e Métodos:**
  * Criação da entidade `Triangle` para agrupar medidas e encapsular o cálculo da fórmula de Heron no método `area()`.
  * Instanciação de objetos com o operador `new` e alocação dinâmica de memória.
  * Delegação de responsabilidade: a classe é responsável por seu próprio comportamento.
* **Tópico 2 - Estado de Objeto, Operador `this` e `toString()`:**
  * Modelagem da entidade `Product` para controle de estoque (`addProducts`, `removeProducts`, `totalValueInStock`).
  * Uso do operador `this` para diferenciar atributos de classe de parâmetros homônimos.
  * Sobrescrita do método `toString()` herdado de `Object` para representação textual simplificada do objeto.
* **Tópico 3 - Membros Estáticos (`static`) & Constantes (`final`):**
  * Conceito de membros de classe vs. membros de instância.
  * Declaração de constantes com `public static final double PI`.
  * Criação de classe utilitária `Calculator` contendo métodos estáticos (`circumference`, `volume`) que podem ser invocados diretamente sem necessidade de instanciar a classe (`Calculator.circumference(radius)`).

### 🔹 [Section 9: Construtores, Sobrecarga e Encapsulamento](./Section9/)
* **Conceitos abordados:**
  * **Construtores Personalizados:** Inicialização de atributos obrigatórios no momento da instanciação (`new Product(name, price)`), impedindo a existência de objetos em estado inconsistente.
  * **Sobrecarga (Overload):** Criação de múltiplos construtores para a mesma entidade (construtor padrão vazio, construtor com parâmetros completos e construtor opcional com quantidade zerada).
  * **Operador `this`:** Associação inequívoca entre atributos da instância e parâmetros recebidos na inicialização.
  * **Encapsulamento & Modificadores de Acesso (`private`):** Blindagem dos atributos contra manipulações externas indevidas.
  * **Getters e Setters:** Métodos de acesso controlados para leitura e alteração de propriedades (`getName()`, `setName()`, `getPrice()`, `setPrice()`).
  * **Proteção de Regras de Domínio:** Omissão intencional de `setQtd()`, garantindo que o saldo em estoque seja modificado única e exclusivamente através dos métodos de negócio `addProducts()` e `removeProducts()`.

---

## 💡 Boas Práticas e Aprendizados Importantes

* **Gerenciamento do `Scanner`:**
  * O `Scanner(System.in)` gerencia o canal de entrada padrão do sistema.
  * Nunca feche o `Scanner` com `sc.close()` dentro de laços de repetição (`while`, `for`, `do-while`), pois isso invalida o fluxo `System.in` para as iterações seguintes, causando a exceção `IllegalStateException: Scanner closed`.
  * Feche o `Scanner` somente ao final de todo o ciclo de leituras do método principal.
* **Formatação Numérica:**
  * Uso de especificadores no `printf`:
    * `%.2f` para formatação de números de ponto flutuante com duas casas decimais.
    * `%n` para quebra de linha independente do sistema operacional (portabilidade Windows/Linux/macOS).

---

## 🚀 Como Executar os Códigos

### Pré-requisitos
* [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado (versão 17 ou superior recomendada).
* Terminal / Prompt de Comando ou IDE de sua preferência (VS Code, IntelliJ IDEA, Eclipse).

### Passo a passo

1. **Clonar o repositório:**
   ```bash
   git clone https://github.com/PedrinSX77/Curso-Java.git
   ```

2. **Acessar a pasta do projeto:**
   ```bash
   cd Curso-Java
   ```

3. **Compilar e executar um exemplo (exemplo da Section 6):**
   ```bash
   # Compilar
   javac Section6/DoWhile/DoWhile.java

   # Executar
   java Section6.DoWhile.DoWhile
   ```

---

## 👤 Autor

* **Pedro Henrique**
  * GitHub: [@PedrinSX77](https://github.com/PedrinSX77)

---

*Repositório mantido para fins didáticos e evolução profissional contínua.*

