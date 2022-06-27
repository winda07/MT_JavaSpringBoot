springboot
generate create table
Target runtuime ->new -> apache v10-> centang create->next -> download & install/ browse apache-> pilih jre jdk 17


response.getWriter().append("Served at: ").append(request.getContextPath());

<welcome-file-list>  
    <welcome-file>index.jsp</welcome-file>
  </welcome-file-list>
  
  <servlet>
       <servlet-name>LoginServlet</servlet-name>
       <servlet-class>com.welcome.web.LoginController</servlet-class>
   </servlet>
   <servlet-mapping>
       <servlet-name>LoginServlet</servlet-name>
       <url-pattern>/doLogin</url-pattern>
   </servlet-mapping>
   
  <servlet>
    <description></description>
    <display-name>HelloServlet</display-name>
    <servlet-name>HelloServlet</servlet-name>
    <servlet-class>com.welcome.web.HelloServlet</servlet-class>
  </servlet>  
  <servlet-mapping>
    <servlet-name>HelloServlet</servlet-name>
    <url-pattern>/HelloServlet</url-pattern>
  </servlet-mapping>
  
  
  <session-config>
	 <session-timeout>
	     30
	 </session-timeout>
  </session-config>


================================================

=Start Project=
Klik kanan
New Project -> Other -> SpringBoot -> Spring Starter Project
Name: BelajarSpringJPABook
Group: com.belajar.spring
Package: com.belajar.spring
Next

=Depedency=
Frequently Used:
- MySQL Driver
- Spring Boot DevTools
- Spring Data JPA
- Spring Web
Next

=Finish=


<dependency> put in application.properties
#MySQL Connection
spring.datasource.url=jdbc:mysql://localhost:3306/h8_book?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

#HikariCP
spring.datasource.hikari.connection-timeout=20000
spring.datasource.hikari.minimum-idle=5
spring.datasource.hikari.maximum-pool-size=12
spring.datasource.hikari.idle-timeout=300000
spring.datasource.hikari.max-lifetime=12000
spring.datasource.hikari.auto-commit=true
	
#JPA Properties
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
spring.jpa.hibernate.ddl-auto=update

-> @Entity		: merepresentasikan bahwa class tersebut adalah sebuah entitas, yang nantinya akan ada sebuah Tabel di database dengan nama Book
-> @Id 		: menunjukan bahwa variable itu adalah sebuah ID atau Primary Key dari suatu table. Penggunaan @Id di Spring Data JPA sangat lah mandatory /wajib. 			  Setiap class yang diberi annotasi @Entity harus mempunyai @Id.
-> @GeneratedValue: sebuah mekanisme dalam memberikan nilai. Karena disini menggunakan strategy = GenerationType.IDENTITY yang artinya nilai akan diberikan secara 			  increment atau fungsi nya sama dengan AUTO_INCREMENT pada sebuah table. 
-> @Column(nullable = false) : Memberikan info bahwa variable tersebut yang akan menjadi kolom di table Book, tidak boleh null atau not null.

