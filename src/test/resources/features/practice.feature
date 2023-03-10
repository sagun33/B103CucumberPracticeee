#http://tutorialsninja.com/demo/index.php?route=common/home
Feature: tutorialsninja Search
  Scenario: TC01 kullanici tutorialsninja search'de telefon aratir
    Given kullanici "ninjaUrl" gider
    When kullanici phone sayfasina gider
    And  kullanici 2 saniye bekler
    Then telefonlarin marka adini alir
    And  kullanici 2 saniye bekler
    Then tum ogeleri sepete ekle
    And  kullanici 2 saniye bekler
    Then sepete tikla
    And  kullanici 2 saniye bekler
    Then sepetteki isimleri al
    And  kullanici 2 saniye bekler
    Then sepetteki ve sayfadaki listeleri karsilastir
    And  kullanici 2 saniye bekler
    And sayfayi kapatir