Code coverage

1. mengikuti stepbystep by https://codeshare.io/bfispring_sesi22
2. open terminal
3. cd C:\sonarqube\bin\windows-x86-64
4. dir
5. StartSonar.bat

6. open web sonarqube
7. create project -> manually->kasih nama-> locally -> klik generate-> continue-> pilih maven-> (get token)

8. open terminal in eclipse
9. copypaste(shift+insert) token sonarqube / mvn sonar:sonar
10. get url http://localhost:9191 .....
11. copy
12. open web browser -> paste

result di capture => result di web(result,code smell) and eclipse(build success, folder target, sonar)

example token when latihan: (enternya dihapus dan slash ditambah spasi)
mvn clean verify sonar:sonar \  -Dsonar.projectKey=BelajarSonar \  -Dsonar.host.url=http://localhost:9000 \  -Dsonar.login=sqp_c6ff4c7885347f9cb392447d87cef60c1f3f81d7
