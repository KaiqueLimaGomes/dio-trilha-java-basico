# Desafio - Diagramação de classes do Iphone - Trilha Java Básico

### Classes JAVA reprentando o diagram UML
Implementação das classes Java representadas no diagrama UML

ModelagemDiagramacaoIPhone>src>TesteIphone.java

##
### Diagrama UML (Mermaid)

```mermaid
classDiagram
    %% Interfaces
    class ReprodutorMusical {
      <<interface>>
      +tocar()
      +pausar()
      +selecionarMusica(musica)
    }
    class AparelhoTelefonico {
      <<interface>>
      +ligar(numero)
      +atender()
      +iniciarCorreioVoz()
    }
    class NavegadorInternet {
      <<interface>>
      +exibirPagina(url)
      +adicionarNovaAba()
      +atualizarPagina()
    }

    %% Main class
    class iPhone {
    }

    %% Relationships (realizations)
    iPhone ..|> ReprodutorMusical
    iPhone ..|> AparelhoTelefonico
    iPhone ..|> NavegadorInternet
```
