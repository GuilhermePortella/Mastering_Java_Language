# Conceitos da Linguagem Java

A linguagem Java é uma das linguagem mais completas e robustas disponíveis hoje, com milhões de horas/homem no desenvolvimento e aperfeiçoamento de seus recursos, hoje  conta com uma vasta lista de frameworks e bibliotecas para ajudar no desenvolvimento desde de seu aplicativo de dispositivo móvel a sites ou aplicativos de computador, nesse repositório você irá encontrar exemplos de vários conceitos para te ajudar a começar a entender e programar nessa linguagem, ou até mesmo em eventuais dúvidas sobre algum tema, aqui também vou deixar diversos conceitos que aprendi e estou aprendendo na faculdade de ciências da computação, como complexidade e algoritmos desde de ordenações a teoria de grafos, todos com exemplos em código e teorias escrita nos README das pastas em que o código estiver,  dê uma olhada uma abaixo para um overview.

### Bem vindo ao maravilhoso mundo da programação!
Se você está pensando em aprender a programar, sites e sistemas, mas não sabe por onde começar, não se preocupe! Eu tenho uma recomendação infalível: aprenda Java! A linguagem de programação é tão popular que tem até nome de café. Mas por que Java é a melhor linguagem para iniciantes? Deixe-me convencê-lo.

- Em primeiro lugar, a sintaxe do java é fácil e intuitiva de aprender, o que vai facilitar muito sua vida caso se depare com algum erro de sintaxe, as regras são simples e bem organizadas, vai te ajudar até com o aprendizado gramatical no inglês. 
- Em segundo lugar, java e uma linguagem extremamente popular, no dia que estou escrevendo esse texto ela conta com mais de 2 milhões de repositórios públicos no github e mais de 10 milhões de issues resolvidas, isso sem contar com os artigos, vídeos e stackoverflow, isso além de te ajudar em eventuais erros pode te ajudar a construir um senso de comunidade.
- Em terceiro lugar, java não demonstra sinais de desaceleração, eu mesmo estou trabalhando em um projeto que utiliza Java EE e está apenas no início. A tecnologia java e base de muitos softwares e aplicativos mais populares do mundo, estando presente até em sistemas operacionais, então você poderá trabalhar em serviços web, aplicativo mobile, em sistemas operacionais, qualquer área que gostar, um conhecimento valioso que pode te ajudar muito em seu primeiro emprego de programador.
- Em quarto lugar não poderia deixar de falar no aprendizado orgânico de estrutura de dados, algo que foi bastante fácil para mim que aprendi java como minha primeira linguagem, antes mesmo de conhecer conceitos e técnicas de otimização já as fazia em meu dia a dia de aprendizado com java, depois foi somente refinar os conhecimentos e dar nomes às coisas que já sabia na prática, algoritmos mais difíceis virão com o tempo e pode ter certeza que suas aplicações em java serão um desafio motivador para você, imagina você assumir posições de primeiro lugar em sites de desafios de programação ? Incrível né ? ainda te ajudaria a ser reconhecido na comunidade e a conseguir seu primeiro emprego como desenvolvedor java.
- Finalmente, Java é uma das melhores linguagens de programação para aprender o desenvolvimento backend. Se você pensa em criar aplicativos robustos e escaláveis, essa é uma ótima porta de entrada nesse mundo. Os recursos de segurança e escalabilidade e capacidade de integrar com outras tecnologias como computação cloud, banco de dados tradicionais, tornam java uma escolha popular para o desenvolvimento backend.

Se precisar de ajuda conte comigo ou uma das muitas comunidades disponíveis que estão prontas para te ajudar.

![](https://i.imgur.com/waxVImv.png)
 
# Como preparar o ambiente para programação com Java

> [!WARNING]
> #### Independentemente do uso do Java SE ou do Java EE, as etapas de pós-instalação devem ser seguidas.

[Download do Instalador Java - (Java 21 já disponível)](https://www.oracle.com/java/technologies/downloads/)

> [!TIP]
> #### Lembre-se de baixar o Instalador x64, assim as etapas serão mais intuitivas.

Após o download, execute o instalador do JDK clicando duas vezes no arquivo que foi baixado.

Na tela de boas-vindas do instalador, clique em "Next" para prosseguir.

Na próxima tela, aceite os termos de licença e clique em "Next".

Na tela seguinte, selecione a pasta de instalação. Você pode optar por manter o caminho padrão ou escolher uma pasta diferente. Clique em "Next" para continuar.

Na tela de seleção de componentes, selecione todas as opções disponíveis e clique em "Next".

Na próxima tela, selecione "Create a desktop icon" e clique em "Next".

Na tela de resumo, verifique se as configurações estão corretas e clique em "Install" para iniciar a instalação.

Aguarde o término da instalação. Quando ela estiver concluída, clique em "Finish" para finalizar.

Para verificar se o Java foi instalado corretamente, abra o Prompt de Comando e digite "java -version". Deverá ser exibida a versão do Java instalada.

> [!IMPORTANT]
> #### Após a instalação deve ser criado as variáveis de ambiente em qualquer sistema que você esteja isso será necessário: 
 
 A variável de ambiente é chamada JAVA_HOME e necessariamente deve apontar para o Java SE instalado. 

` 
 No CMD digite:
` 
 ~~~
 setx -m JAVA_HOME "C:\Program Files\Java\jdk19"
 ~~~
> [!IMPORTANT]
> ####  substitua o caminho "C:\Program Files\Java\jdk19" para o caminho que estiver os arquivos java em sua maquina, não se esqueça também de deixar adequado a versão baixada. 

 
Para adicionar o diretório bin do JDK à variável de ambiente PATH, abra o Painel de Controle, clique em "Sistema", selecione "Configurações avançadas do sistema" e clique em "Variáveis de ambiente". Na seção "Variáveis do sistema", selecione a variável "Path" e clique em "Editar". Adicione "%JAVA_HOME%\bin":
~~~
%JAVA_HOME%\bin;
~~~
no início da lista de valores separados por ponto-e-vírgula (;). Clique em "OK" para salvar as alterações.

Com isso você já está apto para programar e compilar programas java em sua máquina.

![](https://i.imgur.com/waxVImv.png)
 ## Sobre o projeto

- Os executáveis dos codigos estão na pasta "src/Capitulo_1, 2, 3 ...", sendo esses exemplos conceitos basicos da linguagem, também deixo alguns algoritmos dentre esses exemplos.
- Para ter os codigos e exemplos em seu computador basta fazer o clone do projeto com:     
~~~ 
git clone https://github.com/GuilhermePortella/Mastering_Java_Language.git
~~~

- Para executar utilize uma IDE como netbeans ou eclipse ou execute diretamente no terminal da seguinte forma:


` 
 1 - Abra seu terminal
 `
 
 `
 2 - Navegar até pasta do projeto
 `
 
 `
 3 - Digite: javac arquivo.java (substituindo pelo nome do arquivo que deseja compilar)
` 

`
 4 - Digite: java aquivo.java para execultar o arquivo 
` 
 
### Duvida ou sugestão estou a disposição.  🖖
 
 
![](https://i.imgur.com/waxVImv.png)
 

 
# Introdução a ciencias da computação com Java
  - [Ciencias da Computação](https://github.com/GuilhermePortella/IntroducaoCienciasComputacao)
 
 
 ![](https://i.imgur.com/waxVImv.png)

# Curiosidades 
 - [Mirror](https://pt.wikipedia.org/wiki/Mirror_(computa%C3%A7%C3%A3o))
  - [Redundância Modular Tripla](https://pt.wikipedia.org/wiki/Redund%C3%A2ncia_modular_tripla)
  - [Tolerância a Falhas](https://pt.wikipedia.org/wiki/Toler%C3%A2ncia_a_falhas)
  - [Checagem de Integridade](https://pt.wikipedia.org/wiki/Checagem_de_integridade)
 
# Conceitos Importantes 
  - [Complexidade Ciclomática](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Algoritmos/Complexidade/Ciclom%C3%A1tica)
  - [Complexidade Cognitiva](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Algoritmos/Complexidade/Cognitiva)
 - [CS50's Introduction to Computer Science - 2024](https://learning.edx.org/course/course-v1:HarvardX+CS50+X/home)
 - Servidores de Aplicação


![](https://i.imgur.com/waxVImv.png)

# Inicio de tudo em Java
 
  - [Fundamentos](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_1_Fundamentos) 
  - [Introdução a tipos de dados e operadores](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_2_Introdu%C3%A7%C3%A3o_a_Tipos_de_Dados_e_operadores)
  - [Instruções de controle de programa](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_3_Instru%C3%A7%C3%B5es_de_Controle_de_Programa)
  - [Introdução a classes, objetos e métodos](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_4_Introducao_a_Classes_Objetos_e_Metodos)
  - [Mais tipos de dados e operadores](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_5_Mais_tipos_de_Dados_e_Operadores)
  - [Verificação minuciosa dos métodos e classes](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_6_Verificacao_Minuciosa_dos_Metodos_e_Classes)
  - [Herança](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_7_Heranca)
  - [Pacotes e Interfaces](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_8_Pacotes_e_Interfaces)
  - [Tratamentos de exceções](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_9_Tratamentos_de_Excecoes)
  - [Usando I/O](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_10_Usando_IO)
  - [Programação com varias Threads](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_11_Programacao_com_Varias_Threads)
  - [Enumeração, Autoboxing, Importação estatica e anotações](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_12_Enumeracao_Autoboxing_Importacao_estatica_e_anotacoes)
  - [Tipos Genéricos](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_13_Tipos_Genericos)
  - [Expressões Lambda e referências de Métodos](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_14_Expressoes_Lambda_e_Referencias_de_Metodos)
  - [Appletes Eventos e Topicos Diversos](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_15_Applets_Eventos_e_Topicos_Diversos)
  - [Introdução a Swing](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_16_Introducao_a_Swing)
  - [Introdução a JavaFX](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Capitulo_17_Introducao_a_JavaFX)
  - [Algoritmos](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Algoritmos)
  - [Paralelismo](https://github.com/GuilhermePortella/Conceitos-Basicos-da-Linguagem-Java/tree/main/src/Paralelismo)


 ![](https://i.imgur.com/waxVImv.png)
  
  # Java Como Programar 10ª Ed - Paul Deitel - Desafios
  
  - [Resolução de Problemas]()
  - [Resolução de Desafios]()
  - [Conceitos Apresentados no Livro]()
