# Questões de POO

## Questão 1:
Usar *getters* e *setters* para os atributos de uma classe é uma boa prática porque os usuários dessa classe não terão acesso direto aos atributos, impedindo que o usuário quebre alguma coisa ao escrever diretamente a um atributo essencial. Eles também podem ser utilizados como um nível de pré-processamento nos dados que serão atribuídos, podendo deixar eles em um formato pré-definido pelos programadores da classe ou fazer algum tipo de checagem/operação nos dados informados.
Por exemplo, uma classe Filme beneficiaria de um *setter* para um atributo *rating*, para se assegurar que o filme não teria mais de 5 estrelas e quebrar a visualização desse filme em algum *software* de filmes.