@ProvaZup

Feature: ProvaZup

  Scenario: Acessar o site Lojas Americanas
    When acessar o site "https://www.americanas.com.br/"
    Then site é exibido

  Scenario Outline: Procurar produto
    When procurar o produto "<produto>"
    Then lista é apresentada "<produto>"
    Then selecionar um produto
    Then Adicionar ao carrinho
    Then Validar Carrinho

    Examples:
    | produto |
    | celular |