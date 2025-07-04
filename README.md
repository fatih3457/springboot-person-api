# Person API — Spring Boot CRUD Projesi

Bu proje, Spring Boot kullanarak geliştirilmiş basit bir RESTful API'dir. Kişi (Person) nesneleri üzerinde **Create, Read, Update, Delete (CRUD)** işlemlerini yapmanıza olanak tanır.

## 🚀 Özellikler

- ✅ Yeni kişi ekleme (POST)
- ✅ Kişileri listeleme (GET)
- ✅ Kişi bilgilerini güncelleme (PUT)
- ✅ Kişi silme (DELETE)
- ✅ DTO kullanımı ile veri taşıma
- ✅ JPA ve H2 DB ile kalıcı veri kaydı
- ✅ Katmanlı mimari (Controller - Service - Repository - Model - DTO)

## 🛠️ Kullanılan Teknolojiler

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok (isteğe bağlı)
- IntelliJ IDEA

## 🧱 API Endpoint'leri

| Metot | Endpoint              | Açıklama             |
|-------|------------------------|----------------------|
| GET   | `/api/persons`         | Tüm kişileri getirir |
| POST  | `/api/persons`         | Yeni kişi ekler      |
| PUT   | `/api/persons/{id}`    | ID’ye göre günceller |
| DELETE| `/api/persons/{id}`    | ID’ye göre siler     |


## 🧪 Postman Testi İçin Örnek JSON

### POST / PUT Gövdesi

```json
{
  "name": "Fatih",
  "age": 30
}

🗃️ Veritabanı

H2 in-memory database kullanıldı.
Tarayıcı üzerinden erişim: http://localhost:8081/h2-console
JDBC URL: jdbc:h2:mem:testdb
✍️ Geliştirici

👤 Fatih Özcan
📌 Java / Spring Boot öğrenme süreci için geliştirilmiştir.

