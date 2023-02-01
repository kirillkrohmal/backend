1. Создать dockerfile 
2. Подготовка файлов
2.1 Построить фронтэнд
Убедиться что папка src/resources/static пуста

В проекте фронтэнд (vscode) выполнить в терминале: 

``` 
npm run build
npm run deploy
```

Файлы откомпелированные в среде React окажутся в папке src/resources/static. 

2.2 Построить jar архив

``` 
mvnw package
```

3. Построить docker образ:
```
docker build --build-arg JAR_FILE=target/*.jar -t gerd1984/spring-webshop .
```
4. Запуск контейнера:
```
docker run --rm -it -p 8000:8080 gerd1984/spring-webshop
```
