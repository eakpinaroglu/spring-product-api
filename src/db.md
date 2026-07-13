Aşağıdaki kodu çalıştır db için (local)
docker run -d \
--name oracle-db \
-p 1521:1521 \
-p 5500:5500 \
-e ORACLE_PASSWORD=Oracle123 \
gvenzl/oracle-free