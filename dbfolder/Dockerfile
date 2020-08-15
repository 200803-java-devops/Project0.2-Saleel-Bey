FROM postgres:12
ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD postgres
ADD *.sql /docker-entrypoint-initdb.d
EXPOSE 5432
