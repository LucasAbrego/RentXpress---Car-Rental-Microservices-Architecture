CREATE DATABASE IF NOT EXISTS rent_xpress_user;
CREATE DATABASE IF NOT EXISTS rent_xpress_reservation;
CREATE DATABASE IF NOT EXISTS rent_xpress_vehicle;

USE rent_xpress_vehicle;
CREATE TABLE IF NOT EXISTS vehicle (
    id BIGINT(20) AUTO_INCREMENT PRIMARY KEY,
    availability BIT(1),
    color VARCHAR(255),
    description VARCHAR(255),
    image_url VARCHAR(255),
    license_plate VARCHAR(255),
    make VARCHAR(255),
    model VARCHAR(255),
    price_per_day DOUBLE,
    year INT(11)
);

	INSERT INTO vehicle (make, model, year, color, license_plate, price_per_day, availability, description, image_url)
	VALUES 
	('Toyota', 'Corolla', 2020, 'White', 'ABC1234', 45.99, true, 'A reliable and fuel-efficient sedan.', 'https://example.com/toyota_corolla.jpg'),
	('Honda', 'Civic', 2019, 'Black', 'DEF5678', 50.00, true, 'A compact car with great fuel economy.', 'https://example.com/honda_civic.jpg'),
	('Ford', 'Mustang', 2021, 'Red', 'GHI9101', 120.50, true, 'A powerful muscle car with modern tech.', 'https://example.com/ford_mustang.jpg'),
	('Chevrolet', 'Camaro', 2022, 'Yellow', 'JKL2345', 130.00, true, 'Sporty, bold, and full of performance.', 'https://example.com/chevrolet_camaro.jpg'),
	('BMW', '3 Series', 2020, 'Blue', 'MNO6789', 100.00, true, 'A luxury sedan with a sporty feel.', 'https://example.com/bmw_3series.jpg'),
	('Audi', 'A4', 2021, 'Gray', 'PQR1234', 105.99, true, 'Luxury and performance in a compact package.', 'https://example.com/audi_a4.jpg'),
	('Mercedes-Benz', 'C-Class', 2020, 'Silver', 'STU5678', 110.00, true, 'A stylish and comfortable luxury car.', 'https://example.com/mercedes_c_class.jpg'),
	('Nissan', 'Altima', 2019, 'White', 'VWX9101', 40.00, true, 'A smooth and efficient mid-size sedan.', 'https://example.com/nissan_altima.jpg'),
	('Hyundai', 'Elantra', 2018, 'Black', 'YZA2345', 35.00, true, 'Affordable and feature-packed sedan.', 'https://example.com/hyundai_elantra.jpg'),
	('Tesla', 'Model 3', 2022, 'White', 'BCD6789', 140.00, true, 'An all-electric luxury sedan with cutting-edge tech.', 'https://example.com/tesla_model3.jpg'),
	('Volkswagen', 'Golf', 2020, 'Red', 'EFG1234', 55.99, true, 'A compact hatchback with German engineering.', 'https://example.com/volkswagen_golf.jpg'),
	('Mazda', 'CX-5', 2021, 'Blue', 'HIJ5678', 60.00, true, 'A stylish and practical crossover.', 'https://example.com/mazda_cx5.jpg'),
	('Jeep', 'Wrangler', 2021, 'Green', 'KLM9101', 85.50, true, 'Off-road capability in a classic package.', 'https://example.com/jeep_wrangler.jpg'),
	('Kia', 'Sorento', 2020, 'Silver', 'NOP2345', 70.00, true, 'A versatile and spacious SUV.', 'https://example.com/kia_sorento.jpg'),
	('Subaru', 'Outback', 2019, 'Gray', 'QRS6789', 65.00, true, 'A rugged wagon ready for adventure.', 'https://example.com/subaru_outback.jpg'),
	('Volvo', 'XC90', 2021, 'White', 'TUV1234', 95.99, true, 'Luxury meets safety in this SUV.', 'https://example.com/volvo_xc90.jpg'),
	('Porsche', '911', 2022, 'Yellow', 'WXY5678', 250.00, true, 'A timeless sports car icon.', 'https://example.com/porsche_911.jpg'),
	('Lexus', 'RX 350', 2020, 'Black', 'ZAB9101', 85.00, true, 'A luxury SUV with a smooth ride.', 'https://example.com/lexus_rx350.jpg'),
	('Jaguar', 'F-Type', 2021, 'Red', 'CDE2345', 210.00, true, 'A high-performance luxury coupe.', 'https://example.com/jaguar_ftype.jpg'),
	('Ferrari', '488 GTB', 2022, 'Red', 'FGH6789', 500.00, true, 'Exotic supercar with blistering performance.', 'https://example.com/ferrari_488gtb.jpg');


USE rent_xpress_user;

CREATE TABLE IF NOT EXISTS user (
    id BIGINT(20) AUTO_INCREMENT PRIMARY KEY,
    address VARCHAR(255),
    email VARCHAR(255),
    full_name VARCHAR(255),
    password VARCHAR(255),
    phone_number VARCHAR(255),
    registration_date VARCHAR(255),
    username VARCHAR(255)

INSERT INTO user (address, email, full_name, password, phone_number, registration_date, username)
VALUES
('123 Main St', 'john.doe@gmail.com', 'John Doe', 'password123', '555-1234', '2023-01-01', 'johndoe'),
('456 Oak St', 'jane.smith@yahoo.com', 'Jane Smith', 'mypassword', '555-5678', '2023-02-15', 'janesmith'),
('789 Pine St', 'alice.johnson@hotmail.com', 'Alice Johnson', 'alicepass', '555-9876', '2023-03-22', 'alicejohnson'),
('101 Maple St', 'bob.williams@outlook.com', 'Bob Williams', 'bobbypass', '555-6543', '2023-04-10', 'bobwilliams'),
('202 Birch St', 'charlie.brown@icloud.com', 'Charlie Brown', 'charlie123', '555-3210', '2023-05-05', 'charliebrown'),
('303 Cedar St', 'emily.davis@gmail.com', 'Emily Davis', 'emilypass', '555-7890', '2023-06-17', 'emilydavis'),
('404 Walnut St', 'michael.jones@yahoo.com', 'Michael Jones', 'michaelpass', '555-2468', '2023-07-08', 'michaeljones'),
('505 Elm St', 'olivia.wilson@hotmail.com', 'Olivia Wilson', 'oliviapass', '555-1357', '2023-08-25', 'oliviawilson'),
('606 Spruce St', 'william.martinez@outlook.com', 'William Martinez', 'williampass', '555-8642', '2023-09-13', 'williammartinez'),
('707 Ash St', 'sophia.garcia@icloud.com', 'Sophia Garcia', 'sophiapass', '555-9753', '2023-10-02', 'sophiagarcia');


USE rent_xpress_reservation;

CREATE TABLE IF NOT EXISTS reservation (
    id BIGINT(20) AUTO_INCREMENT PRIMARY KEY,
    end_date_time DATETIME(6),
    start_date_time DATETIME(6),
    status VARCHAR(255),
    total_amount DOUBLE,
    user_id BIGINT(20),
    vehicle_id BIGINT(20)
);

INSERT INTO reservation (end_date_time, start_date_time, status, total_amount, user_id, vehicle_id)
VALUES
('2024-09-20 10:00:00', '2024-09-15 10:00:00', 'Booked', 200.00, 1, 1),
('2024-09-25 14:00:00', '2024-09-20 14:00:00', 'Completed', 190.00, 2, 2),
('2024-09-10 19:00:00', '2024-09-28 09:00:00', 'Cancelled', 120.00, 3, 3),
('2024-10-05 12:00:00', '2024-10-02 12:00:00', 'Booked', 250.00, 4, 4),
('2024-10-10 16:00:00', '2024-10-07 16:00:00', 'Completed', 350.00, 5, 5);
('2024-11-22 15:00:00', '2024-09-15 10:00:00', 'Booked', 200.00, 1, 1),
('2024-03-27 14:00:00', '2024-09-20 14:00:00', 'Completed', 110.00, 2, 2),
('2024-04-23 19:00:00', '2024-09-28 09:00:00', 'Cancelled', 320.00, 3, 3),
('2024-11-07 23:00:00', '2024-10-02 12:00:00', 'Booked', 250.00, 4, 4),
('2024-12-10 16:00:00', '2024-10-07 16:00:00', 'Completed', 350.00, 5, 5);