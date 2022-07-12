# CRUD Spring boot

This project is realized with java 11, maven, spring boot, maria db 10.3.35
Open the project and run the pom.xml to update the dependencies and resources.
Add the credentials to the application.properties file
## Create Data Base or you can use the script.sql

```bash
CREATE DATABASE crud_user;
use crud_user;
create table user(id INT NOT NULL AUTO_INCREMENT, name VARCHAR(50) NOT NULL, username VARCHAR(20), password TEXT NOT NULL, status INT NOT NULL, ts_insert TIMESTAMP NOT NULL, role_id INT, PRIMARY KEY (id));
create table role(id INT NOT NULL AUTO_INCREMENT, role_name VARCHAR(50) NOT NULL, PRIMARY KEY (id));
```