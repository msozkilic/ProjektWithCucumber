#Senaryo;
# 1-Siteyi aciniz
# 2-username ve password u gönderin ve login butonuna tiklayin
# 3-login old. dogrulayin
    Feature:Login Functionality
    //  @SmokeTest @Regression
      Scenario:Login with valid username and password

        Given Navigate to basqar
        When  Enter username and password and click login button
        Then User should login succesfully

