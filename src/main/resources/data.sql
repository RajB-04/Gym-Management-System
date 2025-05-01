-- Insert Plans
INSERT INTO plan(plan_name, plan_price, plan_duration) 
VALUES 
('Basic', 500, '1 Month'),
('Standard', 1200, '3 Months'),
('Premium', 4000, '1 Year');

INSERT INTO gym_goals(goal_type) 
VALUES 
('Weight Loss'),
('Muscle Gain'),
('Fitness Maintenance');

-- Insert Members
INSERT INTO members(name, age, plan, gym_goals, status, phoneno, email, address) 
VALUES 
('Yuvraj Bhosale', 24, 1, 1, 'true', '9876543210', 'yuvraj@example.com', 'Pune Maharashtra'),
('Anjali Mehta', 29, 2, 2, 'true', '9123456780', 'anjali@example.com', 'Mumbai Maharashtra'),
('Rohit Sharma', 34, 3, 3, 'false', '9012345678', 'rohit@example.com', 'Delhi India'),
('Ajay Dorale', 25, 1, 2, 'true', '9876543210', 'ajay@hotmail.com', 'Pune Maharashtra');
