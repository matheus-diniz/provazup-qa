  # language: pt
    #  Definido fazer em pt para ter os fluxos de testes em linguagem mais natural possível

@ProvaZup
Funcionalidade: ProvaZup

  Cenario: Acessar o site Lojas Americanas
    Quando acessar o site "https://www.americanas.com.br/"
    Entao site é exibido

  Esquema do Cenario: Procurar produto
    Quando procurar o produto "<produto>"
    Entao lista é apresentada "<produto>"
    Entao selecionar um produto
    Entao Adicionar ao carrinho
    Entao Validar Carrinho

    Cenarios:
    | produto |
    | celular |