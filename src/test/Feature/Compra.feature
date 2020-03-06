# language: pt
# new feature
# Tags: optional


Funcionalidade: Compra

  Contexto:
    Dado que estou no site da Americanas e desejo pesquisar um produto

  Cenario: Busca produto
    Quando informo o nome do produto no campo de busca e clico em pesquisar
    Entao pagina de busca retorna a listagem de produtos encontrados


  Cenario: Escolher um produto na lista
