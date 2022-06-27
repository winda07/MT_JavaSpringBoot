Integration Firebase cloud messaging with spring-boot and secure spring-boot app

heroku
1. new project -> other -> spring boot project
2. push to github
3. open heroku
4. connect to github
5. search repository what we want

firebase
1. new project -> other -> spring boot project
2. open firebase-> choose settings project -> service account -> java -> generate new private key
3. change name to firebase-service-account.json
4. run as spring boot app
5. open postman
6. cara menggunakan fcm > buka postman
------------------------------------------------------------
- pilih get
- masukan url > http://localhost:8080/send-notification?topic=gold (sesuaikan)
- topic=gold >>> topic adalah parameter, gold adalah value parameter
- pilih body > buka tab raw (ganti menjadi json) > masukan isi body seperti berikut (sesuaikan isi data nya)
	{
    "subject": "some subject",
    "content": "Some long content",
    "image": "https://upload.wikimedia.org/wikipedia/en/9/95/Test_image.jpg",
    "data": {
      "key1": "Value 1",
      "key2": "Value 2",
      "key3": "Value 3",
      "key4": "Value 4"
    }
}


