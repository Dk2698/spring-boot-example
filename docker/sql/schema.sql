CREATE TABLE IF NOT EXISTS Run(
    run_id INT NOT NULL,
    title varchar(250) NOT NULL,
    miles INT NOT NULL,
    PRIMARY KEY(run_id)
);
INSERT INTO Run(run_id, title, miles) VALUES(1, "Monday Morning RUn", 3);
INSERT INTO Run(run_id, title, miles) VALUES(2, "Wednesday Morning RUn", 35);
INSERT INTO Run(run_id, title, miles) VALUES(3, "Saturday Morning RUn", 8);
