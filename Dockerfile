FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/slurry.jar /slurry/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/slurry/app.jar"]
