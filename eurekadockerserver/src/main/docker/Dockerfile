FROM 192.168.85.30:5000/ljc555_centos:7.3.161
VOLUME /tmp
ADD eurekadockerserver-0.0.1-SNAPSHOT.jar /home/ljc555/app.jar
#RUN bash -c 'touch /app.jar'
ENTRYPOINT ["/usr/local/jdk1.8.0_121/bin/java","-jar","/home/ljc555/app.jar"]
EXPOSE 8760