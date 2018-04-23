set projectLocation=C:\Users\Josimar\.jenkins\workspace\Executar
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause