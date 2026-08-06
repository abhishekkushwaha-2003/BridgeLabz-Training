USE health_clinic_db;

show tables;

CREATE TABLE Billing_Log (
    LogID INT AUTO_INCREMENT PRIMARY KEY,
    BillID INT,
    Message VARCHAR(255),
    LogTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

DELIMITER $$
CREATE TRIGGER after_bill_insert
AFTER INSERT
ON Billing
FOR EACH ROW
BEGIN
    INSERT INTO Billing_Log (BillID, Message)
    VALUES (
        NEW.BillID,
        CONCAT('New Bill Generated. Bill ID = ', NEW.BillID));
END $$
DELIMITER ;


DELIMITER $$
CREATE PROCEDURE ShowBills()
BEGIN
    SELECT * FROM Billing;
END $$
DELIMITER ;

CALL ShowBills();
