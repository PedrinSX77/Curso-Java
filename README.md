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
├── Section10/                 # Comportamento de Memória, Arrays, Listas e Matrizes
│   ├── Vetores/               # Manipulação de vetores de objetos e memória
│   │   ├── Main.java          # Vetor de objetos, cálculo de média e tratamento com ternário
│   │   └── Entities/
│   │       └── Product.java   # Entidade Product utilizada como tipo referência no vetor
│   ├── Listas/                # Coleções dinâmicas e programação funcional
│   │   └── Main.java          # Métodos de List, ArrayList, removeIf, streams e filtros lambda
│   └── Matrizes/              # Arrays bidimensionais (linhas e colunas)
│       └── Main.java          # Matriz quadrada, diagonal principal em O(N) e contagem otimizada de negativos
└── exercicios/                # Resoluções de desafios e exercícios práticos de fixação
    ├── BankExercice/          # Simulação de Sistema de Conta Bancária
    │   ├── Program.java       # Fluxo de abertura de conta, depósitos e saques com validação
    │   └── entities/
    │       └── Account.java   # Entidade Account com regras de negócio, taxa de saque e encapsulamento
    ├── Alturas/               # Estatísticas de Altura e Idade com Vetores de Objetos
    │   ├── Main.java          # Entrada com do-while defensivo, média e cálculo percentual
    │   └── entities/
    │       └── Person.java    # Entidade Person com atributos encapsulados (name, age, height)
    ├── Employee/              # Gerenciamento de Reajuste Salarial com Listas e Streams
    │   ├── Main.java          # Cadastro em List<Employee>, busca com Stream/Filter e tratamento de inexistência
    │   └── entities/
    │       └── Employee.java  # Entidade Employee com id, name, salary encapsulados e método growSalary
    └── Matriz/                # Busca e Navegação Bidimensional de Vizinhos em Matriz M x N
        └── Main.java          # Leitura Row-Major, proteção de bordas (off-by-one) e exibição de vizinhos
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

### 🔹 [Section 10: Comportamento de Memória, Arrays, Listas e Matrizes](./Section10/)
* **Vetores (`Section10/Vetores/`):**
  * **Comportamento de Memória (Stack vs. Heap):** Alocação dinâmica de arrays na Heap e armazenamento de ponteiros/referências na Stack.
  * **Vetores de Tipos Referência (`Product[]`):** Inicialização de posições com ponteiros nulos (`null`) e posterior instanciação de objetos na memória Heap.
  * **Iteração com `vect.length`:** Utilização da propriedade intrínseca do vetor para percorrer posições e acumular valores via getters.
  * **Programação Defensiva com Operador Ternário:** Tratamento para evitar o valor `NaN` em divisões de ponto flutuante com entrada zero (`(n == 0) ? 0.0 : sum / n`).
* **Listas & Programação Funcional (`Section10/Listas/`):**
  * **Coleções Dinâmicas (`List<T>` & `ArrayList<T>`):** Superação do tamanho fixo de vetores com alocação dinâmica e uso de Wrapper Classes.
  * **Operações de Lista:** Inserção posicional (`add(index, elem)`), contagem (`size()`), busca (`indexOf()`) e remoções por índice ou valor.
  * **Expressões Lambda e Predicados:** Remoção condicional declarativa com `removeIf(x -> x.charAt(0) == 'M')`.
  * **Streams e Filtros Funcionais:** Manipulação moderna de fluxos de dados com `list.stream().filter(...).collect(Collectors.toList())`.
* **Matrizes (`Section10/Matrizes/`):**
  * **Estrutura Bidimensional (`int[][]`):** Alocação de matrizes na memória (vetor de vetores), onde `mat.length` representa o número de linhas e `mat[i].length` representa as colunas da linha `i`.
  * **Algoritmo de Passagem Única (*Single Pass*):** Otimização da contagem de números negativos diretamente durante a leitura dos dados ($1 \times N^2$), reduzindo pela metade as iterações em relação ao modelo procedural tradicional.
  * **Diagonal Principal em $O(N)$:** Extração dos elementos onde linha é igual à coluna através de acesso direto `mat[i][i]` em um único laço, sem necessidade de laços aninhados.

### 🔹 [Exercícios de Fixação](./exercicios/)
* **[BankExercice - Sistema de Conta Bancária](./exercicios/BankExercice/):**
  * Implementação da entidade `Account` consolidando encapsulamento e proteção de saldo.
  * Imutabilidade do número da conta (sem `setAccountNumber`) e proteção de saldo (sem `setBalance`).
  * Regras de negócio de depósito e saque com taxa fixa de `$ 5.00`.
  * Validação defensiva de entrada (`y/n`) e consumo correto de quebra de linha com `sc.nextLine()`.
* **[Alturas - Vetores de Objetos e Estatísticas](./exercicios/Alturas/):**
  * Modelagem orientada a objetos da entidade `Person` em substituição ao uso de múltiplos vetores paralelos soltos.
  * Validação de entrada defensiva com laço `do-while (n <= 0)` para assegurar integridade do tamanho do vetor.
  * Tratamento do buffer do teclado intercalando `nextLine()`, `nextInt()` e `nextDouble()`.
  * Cálculo exato de média de altura e percentual de menores de 16 anos com ponto flutuante `(under16 * 100.0) / persons.length` e formatação `%%`.
* **[Employee - Reajuste Salarial com Coleções Dinâmicas (`List`)](./exercicios/Employee/):**
  * Modelagem orientada a objetos da entidade `Employee` com proteção de estado (sem `setSalary`, alteração exclusiva via método de negócio `growSalary(percentage)`).
  * Gerenciamento de coleção dinâmica com `List<Employee> list = new ArrayList<>()`.
  * Consulta e busca de objetos por identificador único (`id`) utilizando a API de Streams do Java moderno (`list.stream().filter(...).findFirst().orElse(null)`).
  * Tratamento resiliente para o cenário de ID não encontrado (*"Esse funcionario não foi encontrado"*), evitando quebras de fluxo ou exceções de ponteiro nulo (`NullPointerException`).
  * Sobrescrita de `toString()` com `String.format("%.2f", salary)` para formatação consistente na saída dos dados.
* **[Matriz - Navegação e Mapeamento de Vizinhos em Matriz $M \times N$](./exercicios/Matriz/):**
  * Alocação dinâmica de matriz bidimensional retangular `new int[m][n]`.
  * Leitura e iteração com ordenação por linhas (*Row-Major Order*), utilizando `list.length` para limites de linhas e `list[i].length` para limites de colunas.
  * Algoritmo de busca por ocorrências de um valor $X$ com localização de coordenadas `Position i,j:`.
  * Verificação defensiva de bordas para navegação nos 4 eixos cardeais:
    * **Esquerda (*Left*):** `j > 0` $\rightarrow$ `list[i][j - 1]`
    * **Direita (*Right*):** `j < list[i].length - 1` $\rightarrow$ `list[i][j + 1]`
    * **Acima (*Up*):** `i > 0` $\rightarrow$ `list[i - 1][j]`
    * **Abaixo (*Down*):** `i < list.length - 1` $\rightarrow$ `list[i + 1][j]`
  * Blindagem total contra exceções de estouro de limites (`ArrayIndexOutOfBoundsException`) em elementos situados nas extremidades da matriz.

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

