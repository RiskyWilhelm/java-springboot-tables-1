# java-springboot-tables-1
Bu projemde, veri aktarımı ve alımı için, DTO objelerini ve farklı katmanları kullanarak,  **GET, POST(CREATE), PUT(EDIT)** yaptım. 

- **Projem hakkında**

Bu projede H2 Memory Database kullanılmıştır. Tam veri tablosunu görmek için şu linke proje başlatıldıktan sonra girilmelidir:  **localhost:YOURPORT/h2-console** ***Normal port değeri 8080***

ModelMapper used for not send the full database to service layer.

ModelMapper adında bir obje yöneticisi kullanılmıştır. Böylelikle service katmanına gereksiz veri gönderimini kısıtladık.

Veri tablosunda id 100'den başlıyor, bir bir artıyor.

Kullanıcı Ekle

Belirtilen ID'deki kullanıcıyı düzenle

Bütün kullanıcıları bul

Girilen ID'ye göre kullanıcı bul



- **Ben değişiklik yapmak için postman kullandım?**






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










- 4-- Edit specified user by ID-----------------------------------------------

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












