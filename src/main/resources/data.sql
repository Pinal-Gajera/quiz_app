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
VALUES ('What is 2 + 2?', '3', '4', '5', '6', 'B'),
       ('What is the capital of France?', 'Berlin', 'Madrid', 'Paris', 'Rome', 'C');

