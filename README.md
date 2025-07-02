# Person API

Java ve Spring Boot kullanılarak geliştirilmiş basit bir REST API projesi.

## Teknolojiler

- Java 17  
- Spring Boot 3  
- Maven  
- H2 Database (in-memory)

## Özellikler

- Kişi ekleme (POST /api/persons)  
- Kişi listeleme (GET /api/persons)

## Kurulum

1. Projeyi klonla:  
   `git clone https://github.com/kullaniciadi/personapi.git`  
2. Proje dizinine gir:  
   `cd personapi`  
3. Uygulamayı çalıştır:  
   `./mvnw spring-boot:run` (Linux/Mac) veya `mvnw.cmd spring-boot:run` (Windows)

## Kullanım

- Yeni kişi eklemek için POST isteği:  
  URL: `http://localhost:8080/api/persons`  
  Body (JSON):  
  ```json
  {
    "name": "Fatih Özcan",
    "age": 35
  }

  Kişi listesini almak için GET isteği:
  URL: http://localhost:8080/api/persons
