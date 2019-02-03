# Otus Spring Framework Developer

- Course: Nov-2018

## HW 6. Library app with Spring Data JPA

- Create library application
- Implement all functionality with Spring Data JPA repositories

## How to get the project running

Clone repository from GitHub:

```shell
git clone git@github.com:ifqthenp/otus-spring-hw-05-spring-jpa
```

Change into the cloned folder:

```shell
cd otus-spring-hw-05-spring-jpa
```

Make `gradlew` script executable (or use `gradlew.bat` if running on Windows):

```shell
chmod +x gradlew 
```

Build executable `jar`:

```shell
./gradlew clean test bootJar
```

Run the program:

```shell
java -jar build/libs/otus-spring-hw-05-spring-jpa.jar
```

### Useful Docker commands

docker exec CONTAINER /usr/bin/mysqldump -u root --password=root DATABASE > backup.sql
