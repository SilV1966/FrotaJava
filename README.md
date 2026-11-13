# FrotaJava
#Atividade — Sistema de Controle de Frota em Java
  Duração: 90 a 120 minutos
  Modalidade: Duplas
  Ambiente: Apache NetBeans
  Tema: Controle de frota corporativa
  Conhecimentos prévios: variáveis, métodos, condicionais e criação de classes simples

1. Objetivo
  Criar um programa pequeno que represente veículos, motoristas e viagens. Durante a atividade, vocês vão praticar:
  classes e objetos;
  encapsulamento;
  herança;
  interface;
  sobrescrita de métodos;
  polimorfismo;
  associação entre objetos.

3. Contexto
  Uma empresa usa diferentes veículos para transporte de pessoas e cargas. O sistema deverá cadastrar alguns veículos e motoristas, registrar viagens e mostrar a atividade de cada veículo.
  A ideia é começar com um exemplo pequeno. Ao final, a dupla poderá ampliar o sistema com novos recursos.

4. Antes de programar: conceitos em poucas palavras
  Classe: modelo que descreve dados e comportamentos. Carro é uma classe.
  Objeto: elemento criado a partir de uma classe. Um carro específico é um objeto.
  Encapsulamento: protege os dados dentro da classe. Neste exercício, os atributos serão private e serão acessados por métodos.
  Herança: permite criar uma classe especializada a partir de outra. Carro herda de Veiculo.
  Interface: declara um comportamento que uma classe deve oferecer. Operavel declara o método realizarAtividade().
  Polimorfismo: permite chamar o mesmo método em objetos de tipos diferentes e obter comportamentos diferentes.
  Associação: ocorre quando um objeto guarda ou utiliza outro objeto. Uma viagem utiliza um motorista e um veículo.

5. Preparação no NetBeans
  Crie um projeto Java Application chamado SistemaFrota.
  Crie um pacote chamado frota.
  Dentro do pacote, crie os arquivos abaixo.
  Em cada arquivo, mantenha a declaração package frota; no início.
  Para evitar excesso de conteúdo para iniciantes, esta versão não inclui manutenção, cadastro interativo nem uma classe gerenciadora da frota. Esses itens ficam como desafios extras.

6. Roteiro de trabalho da dupla
  Leiam o código juntos e identifiquem o que cada classe representa.
  Criem os arquivos no NetBeans, um por vez, e resolvam erros de compilação antes de avançar.
  Executem o programa e observem os dados exibidos.
  Localizem no código exemplos de encapsulamento, herança, interface e associação.
  Alterem os dados de teste: criem outro motorista, veículo ou viagem.
  Expliquem o polimorfismo observando as chamadas a realizarAtividade().

7. Questões para responder
  Qual é a diferença entre a classe Carro e o objeto carro criado em Main?
  Por que os atributos de Veiculo foram declarados como private?
  Qual é a função dos métodos getPlaca() e getModelo()?
  O que significa Carro extends Veiculo?
  Para que serve a interface Operavel?
  Onde o método realizarAtividade() é sobrescrito?
  Por que a lista aceita objetos Carro e Caminhao se foi declarada como ArrayList<Veiculo>?
  Como a classe Viagem se relaciona com Motorista e Veiculo?
  O que acontece com a quilometragem quando uma viagem é criada?
  Qual novo tipo de veículo poderia ser acrescentado ao sistema?

8. Desafios extras
  Escolham um ou dois desafios, conforme o tempo disponível:
  Criar a classe Moto, herdando de Veiculo.
  Criar um método que liste apenas os veículos com mais de 100.000 km.
  Impedir que uma viagem seja criada com distância igual a zero ou negativa.
  Criar um atributo status para indicar se o veículo está disponível ou em manutenção.
  Impedir uma viagem quando o veículo estiver em manutenção.
  Acrescentar na viagem um método que mostre o nome do motorista, modelo do veículo e distância percorrida.

9. Entrega esperada
  Cada dupla deverá entregar:
  o projeto Java do NetBeans;
  uma execução funcionando;
  as respostas das questões conceituais;
  uma explicação breve de onde aparece cada conceito de POO.

