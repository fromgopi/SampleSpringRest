-- auto-generated definition
create table cities
(
  id           int auto_increment primary key,
  country      varchar(255) not null,
  state        varchar(255) not null,
  city         varchar(255) not null,
  famous_place varchar(255) not null,
  constraint cities_id_uindex unique (id)
)engine = InnoDB;

create index city on cities (city);

create index country on cities (country);

create index state on cities (state);

