--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;

--
-- Name: projectschema; Type: SCHEMA; Schema: -; Owner: postgres
--

CREATE SCHEMA projectschema;


ALTER SCHEMA projectschema OWNER TO postgres;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: customer; Type: TABLE; Schema: projectschema; Owner: postgres; Tablespace: 
--

CREATE TABLE projectschema.customer (
    mobileno bigint NOT NULL,
    location text NOT NULL,
    name text,
    age integer
);


ALTER TABLE projectschema.customer OWNER TO postgres;

--
-- Name: orders; Type: TABLE; Schema: projectschema; Owner: postgres; Tablespace: 
--

CREATE TABLE projectschema.orders (
    id bigint NOT NULL,
    name text NOT NULL,
    price double precision,
    uid bigint,
    ordereddate timestamp without time zone
);


ALTER TABLE projectschema.orders OWNER TO postgres;

--
-- Name: user; Type: TABLE; Schema: projectschema; Owner: postgres; Tablespace: 
--

CREATE TABLE projectschema."user" (
    user_id bigint NOT NULL,
    pass_wd text,
    fname text,
    lname text,
    dob date,
    location text,
    pincode bigint,
    address text,
    updt_by text,
    created_by text,
    created_dt timestamp without time zone,
    updt_dt timestamp without time zone,
    reg_dt timestamp without time zone,
    enroll_dt timestamp without time zone
);


ALTER TABLE projectschema."user" OWNER TO postgres;

--
-- Name: customer_pkey; Type: CONSTRAINT; Schema: projectschema; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY projectschema.customer
    ADD CONSTRAINT customer_pkey PRIMARY KEY (mobileno, location);


--
-- Name: orders_pkey; Type: CONSTRAINT; Schema: projectschema; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY projectschema.orders
    ADD CONSTRAINT orders_pkey PRIMARY KEY (id, name);


--
-- Name: user_pkey; Type: CONSTRAINT; Schema: projectschema; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY projectschema."user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (user_id);


--
-- Name: uid; Type: FK CONSTRAINT; Schema: projectschema; Owner: postgres
--

ALTER TABLE ONLY projectschema.orders
    ADD CONSTRAINT uid FOREIGN KEY (uid) REFERENCES projectschema."user"(user_id);


--
-- Name: SCHEMA public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--

