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
├── Section11/                 # Tópicos Especiais em Java: Data-Hora (API java.time)
│   └── Main.java              # Instanciação, parse ISO 8601, fusos horários e DateTimeFormatter
├── Section12/                 # Enumerações e Composição de Objetos
│   ├── Enum/                  # Enumerações e Ciclo de Vida de Pedidos
│   │   ├── Main.java          # Conversão String/Enum, valueOf() e instanciação de pedidos
│   │   └── entities/
│   │       ├── Order.java     # Entidade Order com id, moment e OrderStatus
│   │       └── OrderStatus.java # Enumeração representando ciclo de vida (PENDING_PAYMENT, PROCESSING, SHIPPED, DELIVERED)
│   └── Composition/           # Composição de Objetos (1-1 e 1-N)
│       ├── application/
│       │   └── Program.java   # Fluxo de entrada defensivo (do-while), leitura de contratos e cálculo temporal
│       ├── entities/
│       │   ├── Department.java   # Entidade Departamento
│       │   ├── HourContract.java # Contrato por hora com data (LocalDate), valor/hora e horas
│       │   └── Worker.java       # Trabalhador com salário base, departamento e lista protegida de contratos
│       └── enums/
│           └── WorkerLevel.java  # Nível de experiência profissional (JUNIOR, MID_LEVEL, SENIOR)
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
    ├── Matriz/                # Busca e Navegação Bidimensional de Vizinhos em Matriz M x N
    │   └── Main.java          # Leitura Row-Major, proteção de bordas (off-by-one) e exibição de vizinhos
    ├── ListaArrays/           # Fundamentos e Manipulação de Arrays (Prof. Rafael Monteiro)
    │   ├── Array0.java        # Inicialização padrão de tipos numéricos e propriedade .length
    │   ├── Array1.java        # Inicializadores diretos com chaves e varredura indexada
    │   ├── Array2.java        # Transformação matemática com Math.sqrt() e casting explícito (int)
    │   ├── ArrayDiasMes.java  # Métodos estáticos, responsabilidade única e mapeamento mês/dia
    │   ├── Media3.java        # Geração pseudoaleatória com Math.random(), soma e média formatada
    │   ├── TesteArray.java    # Análise de alocação de memória: Stack vs. Heap e erro de inicializador solto
    │   └── respostas_lista6_Arrays.txt # Gabarito técnico completo com explicações conceituais
    ├── DesafiosIteracao/      # Padrões e Paradigmas de Iteração em Java
    │   ├── ClassicProblem.java # Algoritmo de Fibonacci com offsets i-1 / i-2 e passo otimizado i+=2
    │   ├── Foreach.java       # Varredura segura com for-each e contagem condicional por tamanho de String
    │   ├── Streams.java       # Pipeline funcional declarativo (filter, map e sum em DoubleStream)
    │   └── AnaliseDeTemperaturas.java # Benchmark conceitual comparativo: for vs. for-each vs. Stream API (max)
    └── Retangulo/             # Instanciação, Construtores e Encapsulamento (Prof. Rafael Monteiro)
        ├── Retangle.java      # Entidade Retangle com base, altura, métodos de cálculo e getters/setters
        └── UseRetangle.java   # Executável com leitura dinâmica de N retângulos via Scanner
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

### 🔹 [Section 11: Tópicos Especiais em Java: Data-Hora](./Section11/)
* **Conceitos abordados:**
  * **API `java.time` (Java 8+):** Padrão moderno, imutável e thread-safe para manipulação temporal, superando classes legadas (`Date`, `Calendar`).
  * **Tipos Temporais Fundamentais:**
    * `LocalDate`: Representa apenas uma data (ano-mês-dia), sem componente de horário ou fuso horário.
    * `LocalDateTime`: Representa data e hora locais completas (com frações de segundos), sem fuso horário.
    * `Instant`: Representa um instante único na linha do tempo global em padrão UTC / GMT (horário Zulu 'Z', referência de Londres).
  * **Parsing com Padrão ISO 8601:** Conversão de strings formatadas diretamente para objetos temporais (`LocalDate.parse("2008-01-28")`, `Instant.parse("2008-01-28T20:30:00-03:00")` convertendo fuso para UTC).
  * **Formatação Customizada com `DateTimeFormatter`:** Criação de máscaras personalizadas (ex: `"dd/MM/yyyy"` e `"dd/MM/yyyy HH:mm"`) para parsing de datas e horários no formato brasileiro.
  * **Instanciação Direta (`.of()`):** Construção de objetos temporais a partir de dados inteiros isolados (`LocalDate.of(2008, 1, 28)` e `LocalDateTime.of(2008, 1, 28, 1, 30)`).

### 🔹 [Section 12: Enumerações e Composição](./Section12/)
* **Enumerações (`Section12/Enum/`):**
  * **Enumerações (`enum`):** Tipo especial que serve para especificar de forma literal um conjunto de constantes relacionadas (`OrderStatus`: `PENDING_PAYMENT`, `PROCESSING`, `SHIPPED`, `DELIVERED`), eliminando valores inválidos (magic numbers / strings).
  * **Ciclo de Vida de Pedido:** Modelagem de estados reais de negócio com a entidade `Order`.
  * **Conversões String/Enum:** Conversão de texto para enum via `OrderStatus.valueOf("DELIVERED")` e conversão inversa via `.name()`.
* **Composição de Objetos (`Section12/Composition/`):**
  * **Composição 1-1 e 1-N:** Relação onde `Worker` possui um `Department` e uma coleção `List<HourContract>`.
  * **Encapsulamento Defensivo:** A lista de contratos é instanciada diretamente (`new ArrayList<>()`), omitida do construtor e sem método `setContracts()`, sendo mutável apenas por métodos de domínio (`addContract` e `removeContract`).
  * **Delegação e Baixo Acoplamento:** O cálculo total de cada contrato é delegado a `HourContract.totalValue()`, mantendo o `Worker` focado na agregação por competência mensal (`income(year, month)`).
  * **Modernização com `java.time` (Java 8+):** Refatoração da API legada (`Date`/`Calendar`) para `LocalDate` e manipulação de competências temporais (mês/ano) utilizando `YearMonth` e `DateTimeFormatter`.
  * **Programação Defensiva no Client (`Program.java`):** Tratamento do buffer do `Scanner` e validação com laço `do-while` para quantidade de contratos.

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
  * **Blindagem total contra exceções de estouro de limites (`ArrayIndexOutOfBoundsException`) em elementos situados nas extremidades da matriz.**
* **[ListaArrays - Fundamentos de Arrays (Prof. Rafael Monteiro)](./exercicios/ListaArrays/):**
  * `Array0`: Investigação da inicialização default na Heap (`0` para inteiros e `0.0` para ponto flutuante) e medição dinâmica via propriedade `.length`.
  * `Array1`: Inicialização direta por chaves `{1, 4, 9, ...}` e impressão estruturada de índices e elementos.
  * `Array2`: Duplo array com transformação matemática via `Math.sqrt()` e casting explícito `(int)`.
  * `ArrayDiasMes`: Decomposição de métodos estáticos (`void`), responsabilidade única e cálculo de índice deslocado (`i + 1`).
  * `Media3`: Geração pseudoaleatória com `Math.random() * 10`, média aritmética e formatação de casas decimais.
  * `TesteArray`: Diagnóstico e resolução do erro `"Array initializer is not allowed here"`, distinguindo a alocação do ponteiro na Stack da instanciação com `new int[]{...}` na Heap.
  * `respostas_lista6_Arrays.txt`: Documento formal contendo as respostas técnicas e conceituais da lista.
* **[DesafiosIteracao - Os 3 Paradigmas de Iteração em Java](./exercicios/DesafiosIteracao/):**
  * `ClassicProblem`: Implementação do clássico de Fibonacci usando offsets de memória (`i - 1` e `i - 2`), combinada com laço de passo duplo (`i += 2`) para visitar apenas índices ímpares em tempo $O(N/2)$ e sem condicionais.
  * `Foreach`: Varredura resiliente a erros de limite (`IndexOutOfBoundsException`) e diferenciação entre `array.length` (propriedade de vetor) e `string.length()` (método de objeto String).
  * `Streams`: Pipeline puramente funcional sobre `DoubleStream` encadeando `filter(salary < 2000)`, `map(salary * 1.1)` e redução terminal imediata com `sum()`.
  * `AnaliseDeTemperaturas`: Desafio comparativo implementando o cálculo de valor máximo (`max`) através das três abordagens (`for`, `for-each` e `Stream API` com `OptionalInt` e `.getAsInt()`), avaliando trade-offs de legibilidade, performance e segurança.
* **[Retangulo - Instanciação, Construtores e Encapsulamento (Lista 8 - Prof. Rafael Monteiro)](./exercicios/Retangulo/):**
  * `Retangle`: Modelagem de entidade com atributos encapsulados (`private int base`, `private int height`), construtor para inicialização mandatória, métodos de negócio para cálculo (`showArea()` e `showPerimeter()`), getters, setters e sobrescrita de `toString()`.
  * `UseRetangle`: Classe executável integrando leitura dinâmica de múltiplos retângulos via `Scanner`, instanciação dinâmica de objetos no laço e exibição dos resultados.

### 🔹 [LeetCode: Algoritmos e Estruturas de Dados](./Leetcode/)
* **[LeetCode #1 - Two Sum](./Leetcode/TwoSum.java):**
  * **Problema:** Encontrar os dois índices em um vetor de inteiros cuja soma resulte no valor `target`.
  * **Estratégia:** Força Bruta (*Brute Force*) com dois ponteiros/laços aninhados (`j = i + 1`), testando combinações sem repetir o mesmo elemento.
  * **Complexidade de Tempo:** $O(N^2)$ ($\approx \frac{N^2}{2}$ comparações no pior caso).
  * **Complexidade de Espaço:** $O(1)$ (Espaço Constante), superando **84.69%** das submissões em consumo de memória no LeetCode.
  * **Status:** Aceito (*Accepted - 65/65 testcases*) na primeira submissão.

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

