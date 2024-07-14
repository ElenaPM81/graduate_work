DROP TABLE IF EXISTS providerTable;

CREATE TABLE IF NOT EXISTS providerTable ( id INT AUTO_INCREMENT PRIMARY KEY,
                                         company_name varchar(50) NOT NULL,
                                         application_day varchar(20) NOT NULL,
                                         product_day varchar(20) NOT NULL,
                                         payment_day varchar(20) NOT NULL,
                                         address_company varchar(100) NOT NULL,
                                         phone varchar(50) NOT NULL,
                                         email varchar(50) NOT NULL,
                                         note varchar(100) NOT NULL);


