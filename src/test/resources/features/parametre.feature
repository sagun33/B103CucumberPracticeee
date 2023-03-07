Feature: Amazon testi
  @gp2
  Scenario: TC01_amazon_iphone_arama
    Given kullanici "amazonUrl" gider
    When kullanici "java" için arama yapar
    Then sayfa basliginin "java" icerdigini test eder
    And  sayfayi kapatir