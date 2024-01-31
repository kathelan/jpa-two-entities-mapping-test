CREATE TABLE base_code (
                           id BIGINT PRIMARY KEY AUTO_INCREMENT,
                           "value" VARCHAR(255),
                           "type" VARCHAR(255),
                           related_entity_id BIGINT,
                           entity_type VARCHAR(255)
);

CREATE TABLE "user" (
                      id BIGINT PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE address (
                         id BIGINT PRIMARY KEY AUTO_INCREMENT
);
