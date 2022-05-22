CREATE TABLE IF NOT EXISTS hookah
(
    id bigint not null auto_increment,
    brand     varchar(255),
    height double,
    country   varchar(255),
    flask_volume double,
    price     double,
    primary key (id)
);