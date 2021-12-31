# Demo padrão de projeto Observer na linguagem JAVA
 - O padrão de projeto Observer permite notificar os objetos quando determinada ação acontecer;
 No exemplo foi desenvolvida a classe `Observer`, que define a estrutura que a classe deve seguir para ser um observer, no caso foi utilizada uma classe abstrata, mas poderia ser uma interface.

 - A classe que será observada é a `Trabalho`, que extende a classe `Assunto`.

 - A classe `Assunto` é composta basicamente por um atributo do tipo `List` que armazerna a lista de observadores de um assunto e pelos métodos de registrar e o de notificar os observers.
 
 - As classes `AlunoObserver` e `ProfessorObserver` foi desenvolvida para ilustrar a interação do observer da classe `Trabalho`. 
