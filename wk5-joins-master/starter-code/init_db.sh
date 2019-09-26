#!/bin/sh
# TODO: Create database and initialize database table structure

# Credit to Austin Polanco for creating a template to follow
# Use sh init_db.sh in the terminal when in the directory corresponding to this file.

psql postgres -c 'CREATE DATABASE company2'

psql -d company2 -c 'BEGIN;

CREATE TABLE employees (
id SERIAL PRIMARY KEY NOT NULL,
ssn varchar(50) NOT NULL UNIQUE,
first varchar(50) NOT NULL,
last varchar(50) NOT NULL,
year_of_birth INT,
city varchar(50)
);

COMMIT;'
psql -d company2 -c 'BEGIN;
CREATE TABLE jobs (
id SERIAL PRIMARY KEY NOT NULL,
ssn varchar(50) NOT NULL,
company varchar(50),
salary INT NOT NULL,
experience INT NOT NULL,
FOREIGN KEY (ssn) REFERENCES employees(ssn)
);

COMMIT;'
# TODO: Insert data into tables
psql -d company2 -c "COPY employees(ssn,first,last,year_of_birth,city) FROM '`pwd`/employees.csv' DELIMITER ',' CSV HEADER";
psql -d company2 -c "COPY jobs(ssn,company,salary,experience) FROM '`pwd`/jobs.csv' DELIMITER ',' CSV HEADER";

pg_ctl start -D company2

