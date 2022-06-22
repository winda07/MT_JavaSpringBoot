
1. one to one
Hubungan antar tabel dimana tabel A adalah data master dan tabel B harus mempunyai data yang ada pada tabel A.

-use rumah_sakit
//create database
-db.createCollection("pasien");
-db.createCollection("penyakit");
//create collection pesien dan penyakit
db.pasien.insertOne({nama: "Foxy", umur:20, penyakit:"sakit_0001"});
//insert data
db.pasien.insertOne({nama: "Foxy", umur:20, penyakit:"sakit_0001"});
//insert data
//var penyakit_id = db.pasien.findOne().penyakit
menyimpan data di collection penyakit
db.penyakit.findOne({_id: penyakit_id});
//memanggil data di collection penyakit dengan variabel penyakit

2. One to Many
Sebuah hubungan antara tabel dimana tabel A memiliki sebuah data yang bisa di pakai pada tabel B data tersebut bisa banyak data atau beberapa data saja
use transaksi
//create database
db.createCollection("pelanggan");
db.createCollection("transaksi");
//create collection pelanggan dan transaksi
db.pelanggan.insertOne({_id : "PL0001", nama_pelanggan : "Brudi"});
//insert data
db.pelanggan.insertOne({_id : "TR0001", tanggal_transaksi : new Date(), total_harga : 100000, id_pelanggan : "PL0001"});
//insert data
db.transaksi.insertOne({_id: "TR0002", tanggal_transaksi: new Date(), total_harga: 210000, id_pelanggan: "PL0001" });
//insert data
db.transaksi.insertOne({_id: "TR0003", tanggal_transaksi: new Date(), total_harga: 170000, id_pelanggan: "PL0001" });
//insert data
db.transaksi.find().pretty()
//menampilkan isi dari collection transaksi

3. many to many
Sebuah hubungan antara tabel dimana tabelnya ini ada banyak. Hubungannya itu bisa banyak tabel misalkan tabel A dengan tabel B dan tabel C dengan tabel B seperti itu
db.createCollection("detail_transaksi");
//create database
db.detail_transaksi.insertOne({no_trans: "TR0001", barang: "Gelas", jumlah: 3});
db.detail_transaksi.insertOne({no_trans: "TR0001", barang: "Piring", jumlah: 2});
db.detail_transaksi.insertOne({no_trans: "TR0001", barang: "Sapu", jumlah: 2});
//insert data
db.detail_transaksi.find().pretty()
//mendapatkan output seperti berikut
{
        "_id" : ObjectId("62b322f139b03eb4a9eac43d"),
        "no_trans" : "TR0001",
        "barang" : "Gelas:",
        "jumlah" : 3
}
{
        "_id" : ObjectId("62b3230139b03eb4a9eac43e"),
        "no_trans" : "TR0001",
        "barang" : "Piring",
        "jumlah" : 2
}
{
        "_id" : ObjectId("62b3231239b03eb4a9eac43f"),
        "no_trans" : "TR0001",
        "barang" : "Sapu",
        "jumlah" : 2
}

Validasi dengan json schema
db.createCollection("barang", {
  $jsonSchema: {
        bsonType : "object",
        Required : ["namabarang", "hargabarang", "jenisbarang", "description"]
  },
  namaBarang : {
    bsonType : "string",
    Description : "nama barang harus berupa karakter dan tidak boleh kosong!"
  },
  hargaBarang : {
    bsonType : "number",
    Description : "Harga barang harus berupa number dan tidak boleh kosong!"
  },
  jenisBarang : {
    bsonType : "objectId",
    Description : "Jens barang harus berupa objectID dan tidak boleh kosong!"
  },
  description : {
    bsonType : "array",
    Description : "Deskiripsi harus berupa karakter dan tidak boleh kosong!"
    items:{
      bsonType : "object",
      required: ["merk", "ukuran","stok"],
      Properties : [
      Merk : {
        bsonType : "string",
        description : "Merk harus berupa karakter dan tidak boleh kosong!"
      }
      ukuran : {
        bsonType : "string",
        description : "ukuran harus berupa karakter dan tidak boleh kosong!"
      }
      stok {
        bsonType : "number",
        description : "number harus berupa angka dan tidak boleh kosong!"
      }]
    }
  }),
}