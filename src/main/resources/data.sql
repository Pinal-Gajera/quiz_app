CREATE TABLE question (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    question_text VARCHAR(255),
    option_a VARCHAR(255),
    option_b VARCHAR(255),
    option_c VARCHAR(255),
    option_d VARCHAR(255),
    correct_answer VARCHAR(10)
);

CREATE TABLE quiz_session (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    total_questions INT,
    correct_answers INT,
    incorrect_answers INT
);

INSERT INTO question (question_text, option_a, option_b, option_c, option_d, correct_answer)
VALUES ('What is the capital of France?', 'Paris', 'London', 'Berlin', 'Madrid', 'A'),
('Which is the largest planet?', 'Earth', 'Jupiter', 'Mars', 'Venus', 'B'),
('What is the square root of 16?', '2', '4', '8', '16', 'B'),
('Which is the fastest land animal?', 'Cheetah', 'Lion', 'Tiger', 'Elephant', 'A'),
('Who is the CEO of Tesla?', 'Elon Musk', 'Jeff Bezos', 'Bill Gates', 'Tim Cook', 'A'),
('What is the chemical symbol for water?', 'O2', 'CO2', 'H2O', 'HO2', 'C'),
('Which country is known as the Land of the Rising Sun?', 'China', 'South Korea', 'Japan', 'India', 'C'),
('How many continents are there?', '5', '6', '7', '8', 'C'),
('What is the largest ocean on Earth?', 'Atlantic Ocean', 'Indian Ocean', 'Pacific Ocean', 'Arctic Ocean', 'C'),
('Which animal is known as the King of the Jungle?', 'Lion', 'Tiger', 'Elephant', 'Cheetah', 'A'),
('What is the currency of Japan?', 'Yuan', 'Won', 'Yen', 'Ringgit', 'C'),
('Who developed the theory of relativity?', 'Isaac Newton', 'Albert Einstein', 'Galileo Galilei', 'Nikola Tesla', 'B');

