use Banka
-- İlk olarak ana sınıfı oluşturmalıyız
-- Müşteri no'sunu primary key olarak tanımlamamız durumunda problemlerle karşılaşabiliriz.

create table Musteriler(
Id int primary key not null,
MusteriNo char(10) not null,
KanalId int not null
)

-- Miras odaklı tasarım, Musteriler ile GercekMusteriler arasında bire bir ilişki
create table GercekMusteriler(
MusteriId int primary key not null,
Ad varchar(50) not null,
Soyad varchar(50) not null,
TcKimlikNo char(11) not null
)

-- Miras odaklı tasarım, Musteriler ile TuzelMusteriler arasında bire bir ilişki
create table TuzelMusteriler(
MusteriId int primary key not null,
Unvan varchar(50) not null,
VergiNo char(10) not null
)

-- Bire çok ilişki, Musteriler id -> Adresler MusteriId  
create table Adresler(
Id int identity primary key  not null,
MusteriId int foreign key not null,
AdresDetay varchar(250)
)

-- Primary Key Tablo Foreign Key Tablo Hakkında Bilgi Tutmaz
-- TuzelMusteriler tablosunda Bilancolar'ı beslemek adına bir data tutmamız doğru değildir.
-- FK: Musteriler id --> Bilancolar MusteriId
create table Bilancolar(
Id int identity primary key not null,
MusteriId int not null,
Tarih datetime not null,
Tutar money
)

-- FK: GercekMusteriler MusteriId --> TicariFaaliyetler GercekMusteriId
create table TicariFaaliyetler(
Id int identity primary key not null,
GercekMusteriId int not null,
BaslangicTarihi datetime not null
)

-- Fk: Kanallar Id --> Musteriler KanalId bire çok ilişki
create table Kanallar(
Id int primary key not null identity,
Ad varchar(50) not null
)

-- Primary Key ve Unique Key alanlarının yanlış kullanılması
-- PK bir tablodaki kayıtları birbirinden ayırmak için kullanılan default olarak classtered index şeklinde 
-- oluşan tasarım şeklidir, bir anahtardır.
-- Unique key bu datanın bir daha tekrarlanmamasını söyleyen bir anahtardır.
-- MusteriNo değişimi muhtemel bir data olduğu için bunu diğer tablolarda tekrarlamamamız gerekir.
-- Birden çok alana Primary Key yapmak en büyük hatalardan biridir.

-- Musteriler Id -> Sendikalar MusteriId
create table Sendikalar(
MusteriId int primary key not null,
Ad varchar(50)
)

-- Sorguların Müşteri Girdileriyle Yönlendirilmesi
-- Kolay sorgu yazacağım diye tasarım yapılmamalıdır.
-- İnternet bankacılığına girdiğimiz zaman bize ticari mi bireysel mi diye sorar yani müşteriden bilgi almak.
-- Ben bir tabloya gideceğim ama hengisine gideceğimi söyler misin? banka yaptırıyor.

-- Denormalizasyon İhtiyacı
-- OLTP veri tabanlarını raporlama için nomalize olan yapıyı denormalize hale getiririz.
-- Denormalizasyon: 4 tablo tek tablo haline getirlibelir, yapılacak analize göre işlem değişir.