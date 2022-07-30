# java-springboot-tables-1
Bu projemde, veri aktarımı ve alımı için, DTO objelerini ve farklı katmanları kullanarak,  **GET, POST(CREATE), PUT(EDIT)** yaptım. 

- **h2 console girişi**

Kayıtlı ayarlar: Generic h2 (Embedded)

Ayar adı: Generic H2 (Embedded)

Driver class: org.h2.Driver

JDBC Url kısmı: ***jdbc:h2:mem:testdb***

Kullanıcı Adı: boş bırakınız

Şifre: boş bırakınız

- **Projem hakkında**

Bu projede H2 Memory Database kullanılmıştır. Tam veri tablosunu görmek için şu linke proje başlatıldıktan sonra girilmelidir:  **localhost:YOURPORT/h2-console** ***Normal port değeri 8080***

ModelMapper adında bir obje yöneticisi kullanılmıştır. Böylelikle service katmanına gereksiz veri gönderimini kısıtladık. İzlediğim eğitim videosunda adam bunu kullanıyordu :D

Veri tablosunda id 100'den başlıyor, bir bir artıyor.

Kullanıcı Ekle

Belirtilen ID'deki kullanıcıyı düzenle

Bütün kullanıcıları bul

Girilen ID'ye göre kullanıcı bul



- **Ben değişiklik yapmak için postman kullandım. Nasıl yaptığımı buraya yazıyorum ki sonrasında bakarsam anlayayım.**



- 0-- Bütün kullanıcıları ADMIN olarak bul-----------------------------------------------

link tipini GET yaptım

link kısmına şunu koydum ***localhost:8080/user/getAllUsersAdmin***

**SEND** dedikten sonra sonucu gördüm.






- 1-- Bütün kullanıcıları bul-----------------------------------------------

link tipini GET yaptım

link kısmına şunu koydum ***localhost:8080/user/getAllUsers***

**SEND** dedikten sonra sonucu gördüm.









- 2-- Girilen ID'ye göre kullanıcı bul-----------------------------------------------

link tipini GET yaptım

link kısmına şunu koydum ***localhost:8080/user/getUserById/ENTERTHEIDHERE*** ***Unutmayalım id 100'den başlıyor.***

**SEND** dedikten sonra sonucu gördüm.






- 3-- Kullanıcı Ekle-----------------------------------------------

link tipini POST yaptım

link kısmına şunu koydum ***localhost:8080/user/create***

 **BODY** kısmına geldim

**RAW**'ı seçtim ve text yerine **JSON**'u seçtim 

Şunu yazdım:

`
{
    "firstName": "anyname",
    "lastName": "anyname"
}
`

**SEND** dedikten sonra sonucu gördüm.










- 4--Kullanıcıyı ID'ye göre düzenle-----------------------------------------------

link tipini PUT yaptım

linke şunu yazdım ***localhost:8080/user/editUser/ENTERIDHERE*** ***Unutmayalım id 100'den başlıyor.***

**BODY** kısmına geldim

**RAW**'ı seçtim ve text yerine **JSON**'u seçtim 

Şunu yazdım

`
{
    "firstName": "anyname",
    "lastName": "anyname"
}
`

**SEND** dedikten sonra sonucu gördüm.






- ***Neler öğrendim?***

Postmapping, PutMapping, GetMapping kullanımını katmanlar kullanarak öğrenmiş oldum.

Belirli bir objeye nasıl global bir şekilde erişilebileceğini @Bean metoduyla beraber öğrendim.

Yapıcı metodları daha iyi bir şekilde kavradım sayılır. Eh işte :D

Veri Tablolarındaki düzenlemelerin nasıl yapıldığını daha iyi anladım.

Ve birkaç şey daha...

:) Sonuç olarak Spring bootta bir proje yapmayı başarmış bulunmaktayım. Bakalım bir sonraki hedefimiz ne olacak!

