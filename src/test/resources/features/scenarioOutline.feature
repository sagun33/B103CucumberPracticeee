#Scenario Outline, bir senaryonun farklı verilerle tekrar kullanılmasını sağlar.
#Böylece aynı senaryonun farklı durumlardaki davranışları belirlenir

Feature: Kullanıcı amazon sayfasında arama yapar

  Scenario Outline: amazon sayfasında arama yapar
    Given kullanici "amazonUrl" gider
    Then kullanici "<arananKelime>" için arama yapar
    And  sayfa basliginin "<istenenKelime>" icerdigini test eder
    And  sayfayi kapatir
    Examples:
      | arananKelime | istenenKelime |
      | selenium     | selenium      |
      | java         | java          |
      | iphone       | iphone        |




