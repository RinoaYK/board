--liquibase formatted sql
--changeset lidia:202503031559
--comment: card column created_at add

ALTER TABLE CARDS
    ADD COLUMN created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP AFTER description;

--rollback ALTER TABLE CARDS DROP COLUMN created_at;