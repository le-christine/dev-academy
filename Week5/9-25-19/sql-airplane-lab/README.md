---
title: Flying with SQL
type: lab
duration: "1:00"
creator: Isha Arora
---

# ![](https://ga-dash.s3.amazonaws.com/production/assets/logo-9f88ae6c9c3871690e33280fcf557f33.png) Flying with SQL 

## Setup

1. Create a new database called `flights`, connect to it, and run the following code:

  ```sql
  CREATE TABLE airlines (
    id int,
    name varchar(255) DEFAULT NULL,
    alias varchar(255) DEFAULT NULL,
    iata varchar(255) DEFAULT NULL,
    icao varchar(255) DEFAULT NULL,
    callsign varchar(255) DEFAULT NULL,
    country varchar(255) DEFAULT NULL,
    active varchar(255) DEFAULT NULL
  );

  CREATE TABLE airports (
    id int,
    name varchar(255) DEFAULT NULL,
    city varchar(255) DEFAULT NULL,
    country varchar(255) DEFAULT NULL,
    iata_faa varchar(255) DEFAULT NULL,
    icao varchar(255) DEFAULT NULL,
    latitude varchar(255) DEFAULT NULL,
    longitude varchar(255) DEFAULT NULL,
    altitude varchar(255) DEFAULT NULL,
    utc_offset varchar(255) DEFAULT NULL,
    dst varchar(255) DEFAULT NULL,
    tz varchar(255) DEFAULT NULL
  );

  CREATE TABLE routes (
    airline_code varchar(255) DEFAULT NULL,
    airline_id int DEFAULT NULL,
    origin_code varchar(255) DEFAULT NULL,
    origin_id int DEFAULT NULL,
    dest_code varchar(255) DEFAULT NULL,
    dest_id int DEFAULT NULL,
    codeshare varchar(255) DEFAULT NULL,
    stops int DEFAULT NULL,
    equipment varchar(255) DEFAULT NULL
  );
  ```

You can check if above tables are created by running command `\dt` in your psql shell. 

Clone this repo and copy [airlines.csv](/Week5/Code/3-Wednesday/3-SQL-Airplane-Lab/airlines.csv), [airports.csv](/Week5/Code/3-Wednesday/3-SQL-Airplane-Lab/airports.csv), and [routes.csv](/Week5/Code/3-Wednesday/3-SQL-Airplane-Lab/routes.csv) to your Desktop directory on your computer.

Run the following code, substituting your computer's username for mine. If you're unsure of the full path, `cd` to your Desktop and `pwd`.

  ```sql
  COPY routes FROM '/Users/<your-username>/Desktop/routes.csv' DELIMITER ',' CSV;
  COPY airports FROM '/Users/<your-username>/Desktop/airports.csv' DELIMITER ',' CSV;
  COPY airlines FROM '/Users/<your-username>/Desktop/airlines.csv' DELIMITER ',' CSV;
  ```

You should now have seeded three tables with flight data. Run `SELECT * FROM <table-name> LIMIT 10;` to confirm.

## Goal

1. Select airport code for airports LIKE 'John F Kennedy' or 'De Gaulle'. 

flights=# SELECT iata_faa FROM airports WHERE name LIKE '%John F Kennedy%' OR name LIKE '%De Gaulle%';
 iata_faa 
----------
 CDG
 JFK
(2 rows)

2. Select all the flights originating from 'JFK' AND going to 'CDG'.

flights=# SELECT * FROM routes WHERE origin_code = 'JFK' AND dest_code = 'CDG';
 airline_code | airline_id | origin_code | origin_id | dest_code | dest_id | codeshare | stops |    equipment    
--------------+------------+-------------+-----------+-----------+---------+-----------+-------+-----------------
 AA           |         24 | JFK         |      3797 | CDG       |    1382 |           |     0 | 763 757
 AF           |        137 | JFK         |      3797 | CDG       |    1382 |           |     0 | 332 772 388 343
 AY           |       2350 | JFK         |      3797 | CDG       |    1382 |           |     0 | 763 757
 AZ           |        596 | JFK         |      3797 | CDG       |    1382 | Y         |     0 | 332 388 772 343
 BA           |       1355 | JFK         |      3797 | CDG       |    1382 | Y         |     0 | 763 757
 DL           |       2009 | JFK         |      3797 | CDG       |    1382 |           |     0 | 332 772 388 343
 EY           |       2222 | JFK         |      3797 | CDG       |    1382 | Y         |     0 | 763 757
 IB           |       2822 | JFK         |      3797 | CDG       |    1382 | Y         |     0 | 763 757
 QR           |       4091 | JFK         |      3797 | CDG       |    1382 | Y         |     0 | 757
 SE           |       5479 | JFK         |      3797 | CDG       |    1382 |           |     0 | 763 332
 US           |       5265 | JFK         |      3797 | CDG       |    1382 |           |     0 | 763 757
(11 rows)


3. Find out the NUMBER of airports in Canada.

flights=# SELECT COUNT(id) FROM airports WHERE country = 'Canada';
 count 
-------
   435
(1 row)

4. Select airport names IN the following countries- Algeria, Ghana, Ethiopia, order by country.  

flights=# SELECT name, country FROM airports WHERE country IN ('Algeria', 'Ghana', 'Ethiopia') ORDER BY country;

5. Select all the airports that airlines 'Germania' flies from.
flights=# SELECT DISTINCT(a.name) as airport_name FROM airports a, airlines al, routes r WHERE r.origin_code = a.iata_faa AND al.id = r.airline_id AND al.name = 'Germania';
                      airport_name                       
---------------------------------------------------------
 Antalya
 Arlanda
 Augsburg
 Baden Airpark
 Blagnac
 Bristol
 Domododevo
 Dortmund
 Dresden
 Dusseldorf
 Enfidha - Zine El Abidine Ben Ali International Airport
 Erbil Intl
 Erfurt
 Frankfurt Main
 Franz Josef Strauss
 Friedrichshafen
 Fuerteventura
 Gatwick
 Gran Canaria
 Hamburg Finkenwerder
 Hawarden
 Ibiza
 Kassel Calden
 Laage
 Lanzarote
 Leipzig Halle
 Madeira
 Neuenland
 Nikos Kazantzakis
 Pristina
 Provence
 Rafic Hariri Intl
 Rhodes Diagoras
 Schonefeld
 Schwechat
 Skopje
 Son Sant Joan
 Sulaymaniyah International Airport
 Tegel
 Tenerife Sur
 Zonguldak
(41 rows)

## Bonus

If you want to practice writing SQL queries more, create an account on hackerrank.com and follow [this link](https://www.hackerrank.com/domains/sql?badge_type=sql&filters%5Bdifficulty%5D%5B%5D=easy&filters%5Bsubdomains%5D%5B%5D=select).


