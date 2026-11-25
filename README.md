# Spring Boot Giriş Örneği

Spring Boot'a giriş derslerinde yazılmış küçük bir örnek proje: controller, service ve Spring Data JPA repository katmanları ile Thymeleaf şablonu.

> **Not:** Bu depo 2017 yılında eğitim/örnek amaçlı yazıldı ve artık güncellenmiyor. Bağımlılıkları eskidir ve bilinen güvenlik açıkları içerir; üretimde kullanmayın.

## İçerik

- `controller/HelloController` — `/hello`, `/topla`, `/bol` gibi basit uçlarla servis katmanının çağrılması.
- `controller/CrudController` — `/veriekle`, `/veriekle2?param=...`, `/verigetir?id=...` ile `Person` kaydı ekleme ve getirme.
- `controller/LoginController` — `/login` adresinde Thymeleaf şablonu (`templates/index.html`) döndürür.
- `service/` — `MatematikService`, `StringService` ve bunları kullanan `MainService`; bağımlılık enjeksiyonu örnekleri.
- `dao/PersonDao` — `CrudRepository<Person, Integer>`.
- `static/` — sayfanın CSS/SCSS ve JavaScript dosyaları.

## Teknolojiler

- Java 8, Maven (wrapper dahil)
- Spring Boot 1.5.7 (Web, Data JPA, Thymeleaf), Lombok
- MySQL

## Çalıştırma

1. MySQL'de `vektorel` adlı bir veritabanı oluşturun.
2. `src/main/resources/application.properties` içindeki `spring.datasource.username` ve `spring.datasource.password` değerlerini kendi bilgilerinizle değiştirin. Tablolar `ddl-auto=update` ile otomatik oluşur.
3. `./mvnw spring-boot:run` (Windows'ta `mvnw.cmd spring-boot:run`) ile başlatın; uygulama varsayılan olarak `http://localhost:8080` adresinde açılır.
