CREATE TABLE IF NOT EXISTS tobacco
(
    id bigint not null auto_increment,
    brand     varchar(255),
    flavour varchar(255),
    country   varchar(255),
    grams int,
    primary key (id)
);