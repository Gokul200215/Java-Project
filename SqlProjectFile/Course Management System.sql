CREATE TABLE `student_data_man`.`crs_detail` (
  `STD_ID` INT NOT NULL AUTO_INCREMENT,
  `STD_NAME` VARCHAR(45) NULL,
  `TRAINER_NAME` VARCHAR(45) NULL,
  `COURSE` VARCHAR(45) NULL,
  `JOIN_DATE` date NULL,
  `PAID_AMT` INT NULL,
  `BAL_AMT` INT NULL,
  `STD_ADDRESS` VARCHAR(50) null,
  `STD_NUM` Real NULL,
  `STATUS` VARCHAR(45) NULL,
  PRIMARY KEY (`STD_ID`));
  
  
 DROP TABLE CRS_DETAIL; 
DESC crs_detail;

INSERT INTO crs_detail(STD_NAME,TRAINER_NAME,COURSE,JOIN_DATE,PAID_AMT,BAL_AMT,STD_ADDRESS,STD_NUM,STATUS) VALUES
('Gokul','Venkadesh','SQl','2024-10-05',15000,5000,'Porur',9876543321,'On Going'),
('Krish','Badri','Java','2024-08-15',20000,0,'Porur',8678954604,'Completed'),
('Pokesh','Badri','Java','2024-09-11',20000,0,'Vanagaram',8674454644,'Completed'),
('kumar','Venkadesh','SQl','2024-07-25',20000,0,'Madhuravoyal',8657754221,'Completed'),
('Dinesh','Badri','Java','2024-10-25',6000,14000,'Porur',6678911604,'On Going'),
('Selva','Prince','Reactjs','2024-11-11',11000,9000,'Madhuravoyal',8056057974,'Yet to Start'),
('Arun','Rakesh','Java Script','2024-11-10',12500,7500,'Vanagaram',8682990307,'Yet to Start'),
('Srikanth','Badri','Java','2024-09-03',20000,0,'Madhuravoyal',6383532388,'Completed'),
('Manoj','Rakesh','Java Script','2024-08-24',20000,0,'Porur',9884655851,'Completed'),
('Senthil','Rakesh','Java Script','2024-10-10',13500,16500,'Vanagaram',9566270443,'On Going'),
('Surendhar','Rakesh','Java Script','2024-07-02',20000,0,'Porur',6383352184,'Completed'),
('Deepika','Badri','Java','2024-09-22',10000,10000,'Madhuravoyal',6677348302,'On Going'),
('karthinika','Venkadesh','SQl','2024-10-20',14000,6000,'Madhuravoyal',6768950231,'On Going'),
('Lakshimi','Venkadesh','SQl','2024-10-28',10000,10000,'Porur',7894030211,'On Going'),
('Hari','Venkadesh','SQl','2024-07-16',10000,10000,'Valasaravakkam',9886654331,'On Going'),
('Sathish','Badri','Java','2024-08-19',20000,0,'Valasaravakkam',9967382133,'Completed'),
('Subash','Prince','Reactjs','2024-10-15',16000,4000,'Valasaravakkam',7879664323,'On Going'),
('Mothish','Badri','Java','2024-11-08',15000,5000,'Ramapuram',7418939730,'Yet to Start'),
('Arul','Prince','Reactjs','2024-11-06',9000,11000,'Valasaravakkam',7675589022,'Yet to Start'),
('Priya','Badri','Java','2024-09-27',15500,4500,'Ramapuram',9337678902,'On Going'),
('Moni','Prince','Reactjs','2024-10-08',15000,5000,'Ramapuram',8878954334,'On Going'),
('Swetha','Rakesh','Java Script','2024-11-07',13000,7000,'Ramapuram',6789124656,'Yet to Start');

SELECT * FROM crs_detail;
TRUNCATE CRS_DETAIL;

CALL STD_COUNT_IN_COURSE();

-- STD_ID,STD_NAME,TRAINER_NAME,COURSE,JOIN_DATE,PAID_AMT,BAL_AMT,STD_ADDRESS,STD_NUM,STATUS
CALL UPDATE_ROWS(22,'karthinika','Venkadesh','SQl','2024-10-20',14000,6000,'Madhuravoyal',6768950231,'On Going');
SELECT * FROM crs_detail;

-- STD_ID,PAID_AMT,BAL_AMT
CALL UPDATE_AMOUNT(22,20000,0);
SELECT * FROM crs_detail;

-- STD_ID,STATUS
CALL UPDATE_STATUS(22,'Completed');
SELECT * FROM crs_detail;

-- STD_ID,STD_NAME,TRAINER_NAME,COURSE,JOIN_DATE,PAID_AMT,BAL_AMT,STD_ADDRESS,STD_NUM,STATUS
CALL INSERT_DATA('Ganesh','Badri','Java','2024-11-08',15000,5000,'Ramapuram',8878954334,'Yet to Start');

-- Find Data By Name here STD_NAME
CALL FindByName('Mothish');

-- FIND STUDENT DATA BY TRAINER NAME TRAINER_NAME
CALL FINDBYTRAINER('rakesh');

-- FIND STUDENT DATA BY COURSE
CALL FindByCourse('reactjs');

-- NO OF STUDENT JOINED BY MONTH
CALL STUDENT_JOINED_COUNT_IN_MONTH();

-- NO OF STUDENT PAID COMPLETELY
CALL NO_DUE();

CALL PAID_ABOVE(10000);