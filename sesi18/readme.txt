springboot- OAuth2 with jwt
setelah membuat otentikasi pada restapi lalu sekarang kita implementasikan jwt
JSON web Token yang berarti token ini menggunakan JSON(Javascript Object Notation)
berbentuk string panjang yang sangat random, lalu token ini memungkinkann kita
untuk mengirimkan data yang dapat diverifikasi oleh dua pihak atau lebih.

IN POSTMAN
1. post user 
{
    "username": "windaa@gmail.com",
    "password": "root",
    "fullname" : "windaa"
}
-> sucess
2. getAuthorizatin->
{
    "username": "windaa@gmail.com",
    "password": "root"
}
-> get Auth
3. post blog -> Auth -> barear token
{
    "username": "windaa@gmail.com",
    "password": "root"
}