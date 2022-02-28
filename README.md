# CS-InstallmentServices

Restassured, allure ve log4j framework kullaranak birkaç senaryo üzerinden API Test projesi oluşturdum. Test sonuçlarının raporlanması için Log4j, monitoring edilmesi için de allure yapısını kullandım. Bu proje Çiçeksepeti Installment işleminde kullanılan apiyi monitoring logging yardımıyla çok amaçlı olarak isteğe göre değiştirilebilir ve geliştirilebilir bir projedir.

## Kullanılan Teknolojiler

- Java (Projenin yazılmış olduğu kodlama dilidir);
- TestNG(Test Caselerin yazılması ve çıktıların kontrollerinde kullanılan Test Yazım Aracıdır);
- RestAssured (Api istekleri oluşturmamızı sağlayan bir framework.);
- Allure (Test Sonuclarının monitorize edilmesini sağlar);
- Log4J (Hata sonuçlarının loglanmasını sağlar).

## Proje Yapısının Açıklanması

Proje de alttaki yapıyı kullandım. Her başlığın ne için açıldığını ve ne zaman kullanıldığını altta açıklıyorum.

![image](https://user-images.githubusercontent.com/56224909/156011031-9352c175-f35d-47db-a704-c23825d34ea4.png)

+ **helpers** Sistemde birden fazla yerde kullanılacağını düşündüğüm metodları bu klasör altında topladım. Böylelikle kod tekrarını önleyip okunaklığı arttırdığını düşündüm.
  + **DataHelpers** Listelerden random bir şekilde eleman çekmemize yarayan bir sınıftır.
  + **Listeners** Projede bulunan caseleri dinleyen bir yapıdır.
  + **Log** Loglama yapmamızı sağlayan bir yapıdır.

![image](https://user-images.githubusercontent.com/56224909/156011647-cdac50ed-c629-48a1-a842-a9952b6de736.png)

+ **models** API ye istek atarken bu isteklerin bir sınıf biçiminde olması gerekiyor. Genel olarak bu sınıfların ve bu sınıflar ile ilgili methodların yer aldığı klasördür. Bu klasörün içerisi projeye göre genişletilmelidir. İçerisinde Data, Error, InstallmentService, Price, Product, ve Result sınıfları bulunuyor.

![image](https://user-images.githubusercontent.com/56224909/156012403-94693acf-8b7d-421b-9218-97f936afe8a7.png)

+ **responseServices** İçerisinde response sınıflarının bulunduğu alandır.
  + **ResponseInstallmentServices** basit bir response isteği oluşturan ve gelen responsu nesneye eşitliyen bir sınıftır.

![image](https://user-images.githubusercontent.com/56224909/156013194-778be6fa-51a0-49ae-bca7-cb7b27c71557.png)

+ **retry** Bu klasör içerisinde RetryAnalyzer sınıfı bulunmaktadır. Bu sınıf testler sırasında hata alan testleri bizim verdiğimiz parametrele göre yeniden çalıştırır.

![image](https://user-images.githubusercontent.com/56224909/156013331-9c6a8fa4-4301-4000-b556-c334a8d9d638.png)

+ **servicesTestCases** Test caselerimizin olduğu klasördür. İçerisinde installment kontrollerini yapan test caseler bulunuyor.

![image](https://user-images.githubusercontent.com/56224909/156013546-619a4089-ad78-4526-9978-9bf9c1568601.png)

+ **resources** Properties dosyları ve testng.xml dosyları bulunur.
  + **allure.properties** allure kayıtlarını yönlendiren sınıftır.
  + **log4j.properties** log4j kullanarak log dosyası oluşturma standartlarını ayarladığımız sınıftır.
  + **testng.xml** testlerin koşumunu sağlayan bir xml dosyası.

## Projenin Ayağa Kaldırılması

- log4j.properties ve allure.properties dosyalarında kendi pathlerinizi ayarlayabilirsiniz.
- Allure monitoring kullanmak isterseniz de bilgisayarınızda allure'nin yüklü olması gerekiyor.

## Allure Monitoring Kullanımı

Allure yapısı caseler her tamamlandıktan sonra belirtilen path e kaydediliyor. Bunları görüntülemek için komut satırını açıp "allure serve [config dosyasında ayarladığınız path]\allure-results" girerseniz browserda açılan pencere üzerinde detaylı inceleme yapabilirsiniz.

## Örnek Ekran Çıktıları

- Log Yapısının Örnek çıktısı:

![image](https://user-images.githubusercontent.com/56224909/156014886-e7a7edcf-4100-475d-8221-faa1d7b1cf7a.png)

- Allure Ekran Görüntüsü:

![image](https://user-images.githubusercontent.com/56224909/156015205-2db4d287-978c-4f16-bce8-36200bb52626.png)
