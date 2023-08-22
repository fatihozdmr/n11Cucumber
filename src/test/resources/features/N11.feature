@smoke

Feature: N11 Web Sitesine Gitme
  
  Scenario: N11 web sitesine gitmek istiyorum
    Given Kullanici anasayfaya gider
    When Anasayfanin yuklendigini dogrular
    And Kullanici anasayfada Giris Yap butonunu bulur ve tiklar
    And Giris sayfasinin yuklendigini dogrular
    And Kullanici giris sayfasinda kullanici adi alanina gecerli bir kullanici adi girer
    And Kullanici giris sayfasinda kullanici sifre alanina gecerli bir sifre girer
    And Kullanici "Giris Yap" butonuna tiklar
    Then Kullanici hesabina basariyla giris yapildigini dogrular

