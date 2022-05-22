CREATE TABLE IF NOT EXISTS coal
(
    id bigint not null auto_increment,
    brand     varchar(255),
    cube_size double,
    country   varchar(255),
    price     double,
    primary key (id)
);