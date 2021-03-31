# GIF RECEIVER
## Техническое задание
Написать простой web сервис для Tomcat 7 возвращающий по Get запросу с параметром найденную запись из БД в виде json.
Реализация сервиса должна позволять возвращать все поля заданного в конфигурации произвольного SQL запроса без изменения реализации.

Для определённости:
* в качестве БД используем derby, подключение (прописывается в context.xml) - url="jdbc:derby://localhost:1527/test" username="uname" password="pass"
* sql запрос (прописывается в web.xml) - select * from ttable where id = ?
* обрабатываемый get запрос - http://localhost:8080/db2any/bykey/getjson?key=1
* требуемый формат ответа - {"data":{"ID":1,"VALUE":"first"},"response":"ok","request":"1"}, где data - все поля запроса с их значениями, response - признак успеха или причина сбоя, request - переданный на вход параметр

Желательно применить (будет учитываться в плюс): jersey, jdbctemplate (spring).  
***
## Stack
- Open JDK 6    
- Spring jdbc
- Jersey
- Derby DB
- Tomcat 7
***
## Запуск
- Создать базу данных(Derby) с именем-test, логин-uname, пароль-pass;
- Создать таблицу с названием ttable, создать поля id, value;
- Заполнить тестовыми данными;
- Добавить в Tomcat  war-архив, который находится в папке target;
- Или открыть проект в IDE -> Maven-install -> и подключаем tomcat-run;
***
## Endpoints
- `/db2any/`  
Происходит редирект на нужный Url  
**_Пример_**   
`http://localhost:8080/db2any/`
------
- `/db2any/bykey/getjson`  
Возвращает найденную запись в БД в формате json;  
**Parameters**   
key: integer (1)   
**_Пример_** 
`http://localhost:8080/db2any/bykey/getjson?key=1`
***
