FROM anapsix/alpine-java:8
VOLUME /tmp
ADD headless-chrome-selenide.jar headless-chrome-selenide.jar
RUN bash -c 'touch /headless-chrome-selenide.jar'
ENTRYPOINT ["java","-jar","/headless-chrome-selenide.jar"]