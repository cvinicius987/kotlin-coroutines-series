# Suspend Functions

Um determinado bloco de código que deve ser executado de forma paralela, pode ser adicionado dentro de uma função
marcada com o modificador *suspend*, todas as funções com o este modificador podem ser executadas de forma paralela.

A funcao somente será executada de forma paralela, em caso de ser atribuida a uma coroutine, sem isto,
uma suspend function é uma funcao normal.