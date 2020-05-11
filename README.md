# springboot-oracle-list-tables
Simple Springboot Application with embedded Tomcat for listing all tables &amp; owners from Oracle DB

# Setup
1. Install Oracle XE
2. Install Maven
3. Load JAR
```
mvn install:install-file -Dfile=/root/lib/ojdbc8.jar -DgroupId=com.oracle -DartifactId=ojdbc8 -Dversion=19.6 -Dpackaging=jar

mvn install:install-file -Dfile=/root/lib/CyberArk.jdbc.Generic.jar -DgroupId=com.cyberark.jdbc -DartifactId=CyberArk.jdbc.Generic -Dversion=11.4 -Dpackaging=jar

mvn install:install-file -Dfile=/root/lib/javapasswordsdk.jar -DgroupId=javapasswordsdk -DartifactId=javapasswordsdk -Dversion=11.4 -Dpackaging=jar
```
4. Setup CP 
5. Prepare credentials, application, safe owner on vault
6. Update DB configuration in `application.properties`

# Run
`mvn springboot-boot:run`


