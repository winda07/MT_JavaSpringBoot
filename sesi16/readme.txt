Spring Web + Thymeleaf

-> Spring Web adalah salah satu projek yang membantu kita untuk membuat sebuah aplikasi web (yang bisa berjalan menggunakan browser) dan Spring Web ini pasti menggunakan 
   annotasi @Controller pada level Controller nya. Sedangkan Thymeleaf adalah sebuah template engine khusus Java tempat kita menuliskan file-file HTML nya sama seperti 
   JSP tapi Thyemeleaf adalah template engine yang paling baru didunia Java / thymeleaf dynamic web

Function Depedency:
> Spring Boot DevTools
> Lombok
> Spring Web
> Thymeleaf
> Spring Data JPA

Cara jalanin
- Dashboard boot
- restart
- open web browser
- http://localhost:8080/
- http://localhost:8080/hello?name=winda

Tambahkan depedency dibawah ini di pom.xml
		<dependency>
			<groupId>org.webjars</groupId>
			<artifactId>bootstrap</artifactId>
			<version>4.2.1</version>
		</dependency>
