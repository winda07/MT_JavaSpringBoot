1. create database h8_siakad / db_siakad / bfi_siakad
2. create tabel tb_mahasiswa / mahasiswa
3. create field (sesuaikan strtuktur tabel)
	> tabel mahasiswa
		id > pk (primary key), type data int  (11)/bigint (21), auto increment (yang di db inisialisasi primary key nya ID)
		nim (nomor induk mahasiswa) type data string (255) / 50 / 100 (Unik) 
		email (Unik)
		nama mahasiswa type data String (100)
		jenis kelamin > string/varchar 50 / 2 > value data (P,L) > Perempuan/Laki-Laki (tidak dikecualikan)
					enum (P,L) / Perempuan/Laki-Laki > jika diisi "yang lainnya" > ini idak bisa (sudah di kecualikan)
					int (2) > 0,1 > coment 0=laki-laki, 1=perempuan
4. insert record / insert data mahasiswa


yang ini auto
insert into tb_mahasiswa(nim, email, nama_mahasiswa, jenkel) values("123","arif@gmail.com","Arif","Laki-Laki");

yang ini di definisikan berdasarkan last id . contoh 5 yang terakhir > (di dalam record/data)
insert into tb_mahasiswa(id, nim, email, nama_mahasiswa, jenkel) values(6, "123","arif@gmail.com","Arif","Laki-Laki");

/lebih simpel
insert into tb_mahasiswa values("123","arif@gmail.com","Arif","Laki-Laki");