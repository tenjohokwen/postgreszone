#Playground for timezone

*hibernate 4.3.X version
* To use jadira with timezone as annotated over modifiedDate, you need version 5.0.0.GA or higher, less you get an exception



spring.jpa.generate-ddl=true
=============================
* This means generate the sql

spring.jpa.properties.jadira.usertype.autoRegisterUserTypes=true
================================================================
* This property seems to be used just in older hibernate versions (saw a blog that said hibernate 4.5 but the repo had 4.3)
* It was used for joda time conversion
* did not have time to investigate