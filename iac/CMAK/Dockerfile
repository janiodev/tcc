FROM arm64v8/openjdk:11-jre-slim as build

ARG CMAK_VERSION="3.0.0.5"

RUN curl -L https://github.com/yahoo/CMAK/releases/download/${CMAK_VERSION}/cmak-${CMAK_VERSION}.zip -o /tmp/cmak.zip \
    && unzip /tmp/cmak.zip -d / \
    && ln -s /cmak-$CMAK_VERSION /cmak \
    && rm -rf /tmp/cmak.zip

FROM arm64v8/openjdk:11-jre-slim

COPY --from=build /cmak /cmak

VOLUME /cmak/conf

ENV JAVA_OPTS=-XX:MaxRAMPercentage=80

WORKDIR /cmak

ENTRYPOINT ["/cmak/bin/cmak", "-Dpidfile.path=/dev/null", "-Dapplication.home=/cmak", ""]
