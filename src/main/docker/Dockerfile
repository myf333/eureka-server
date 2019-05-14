FROM openjdk:8u151
VOLUME /tmp
MAINTAINER myf333@tom.com
WORKDIR /service/
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && echo 'Asia/Shanghai' >/etc/timezone
ADD eureka-server-1.0-SNAPSHOT.jar /service/
ENTRYPOINT ["java","-jar","/service/eureka-server-1.0-SNAPSHOT.jar"]