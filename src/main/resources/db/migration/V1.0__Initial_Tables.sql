CREATE TABLE IF NOT EXISTS notifications
(
    id            BIGSERIAL                NOT NULL,
    updated_time  TIMESTAMP WITH TIME ZONE NOT NULL,
    created_time  TIMESTAMP WITH TIME ZONE NOT NULL,
    subject       TEXT                     NULL,
    sender        TEXT                     NOT NULL,
    received_time TIMESTAMP WITH TIME ZONE NOT NULL,
    PRIMARY KEY (id)
);
