INSERT INTO `authors` VALUES (1, 'Lewis', 'Carrol');
INSERT INTO `authors` VALUES (2, 'Charlotte', 'Bronte');
INSERT INTO `authors` VALUES (3, 'Miguel', 'de Cervantes');
INSERT INTO `authors` VALUES (4, 'Herbert', 'Wells');
INSERT INTO `authors` VALUES (5, 'Leo', 'Tolstoy');
INSERT INTO `authors` VALUES (6, 'Jane', 'Austen');
INSERT INTO `authors` VALUES (7, 'Gabriel', 'García Márquez');
INSERT INTO `authors` VALUES (8, 'Leonardo', 'Fibonacci');
INSERT INTO `authors` VALUES (9, 'Ilya', 'Ilf');
INSERT INTO `authors` VALUES (10, 'Yevgeni', 'Petrov');

INSERT INTO `books` VALUES (1, 'Alice in Wonderland', '1865');
INSERT INTO `books` VALUES (2, 'Jane Eyre', '1847');
INSERT INTO `books` VALUES (3,'Don Quixote', '1615');
INSERT INTO `books` VALUES (4, 'The Time Machine', '1895');
INSERT INTO `books` VALUES (5, 'Anna Karenina', '1878');
INSERT INTO `books` VALUES (6, 'Pride and Prejudice', '1813');
INSERT INTO `books` VALUES (7, 'Childhood', '1852');
INSERT INTO `books` VALUES (8, 'Boyhood', '1854');
INSERT INTO `books` VALUES (9, 'Love in the Time of Cholera', '1985');
INSERT INTO `books` VALUES (10, 'The Book of Calculation', '1202');
INSERT INTO `books` VALUES (11, 'The Twelve Chairs', '1928');
INSERT INTO `books` VALUES (12, 'The Little Golden Calf', '1931');

INSERT INTO `genres` VALUES (1, 'Literary realism');
INSERT INTO `genres` VALUES (2, 'Fantasy');
INSERT INTO `genres` VALUES (3, 'Autobiography');
INSERT INTO `genres` VALUES (4, 'Novel');
INSERT INTO `genres` VALUES (5, 'Science-fiction');
INSERT INTO `genres` VALUES (6, 'Romance');
INSERT INTO `genres` VALUES (7, 'Mathematics');
INSERT INTO `genres` VALUES (8, 'Children''s Literature');
INSERT INTO `genres` VALUES (9, 'Satire');

INSERT INTO `comments` VALUES (1, 'excellent', 1);
INSERT INTO `comments` VALUES (2, 'nice', 2);
INSERT INTO `comments` VALUES (3, 'awesome book', 2);
INSERT INTO `comments` VALUES (4, 'pretty good', 3);
INSERT INTO `comments` VALUES (5, 'very good', 5);

INSERT INTO `book_genre` VALUES (1, 2);
INSERT INTO `book_genre` VALUES (1, 8);
INSERT INTO `book_genre` VALUES (2, 4);
INSERT INTO `book_genre` VALUES (2, 6);
INSERT INTO `book_genre` VALUES (3, 4);
INSERT INTO `book_genre` VALUES (4, 5);
INSERT INTO `book_genre` VALUES (5, 1);
INSERT INTO `book_genre` VALUES (5, 4);
INSERT INTO `book_genre` VALUES (2, 3);
INSERT INTO `book_genre` VALUES (6, 6);
INSERT INTO `book_genre` VALUES (7, 3);
INSERT INTO `book_genre` VALUES (7, 1);
INSERT INTO `book_genre` VALUES (7, 4);
INSERT INTO `book_genre` VALUES (8, 3);
INSERT INTO `book_genre` VALUES (8, 1);
INSERT INTO `book_genre` VALUES (8, 4);
INSERT INTO `book_genre` VALUES (9, 4);
INSERT INTO `book_genre` VALUES (10, 7);
INSERT INTO `book_genre` VALUES (11, 4);
INSERT INTO `book_genre` VALUES (11, 9);
INSERT INTO `book_genre` VALUES (12, 4);
INSERT INTO `book_genre` VALUES (12, 9);

INSERT INTO `book_author` VALUES (1, 1);
INSERT INTO `book_author` VALUES (2, 2);
INSERT INTO `book_author` VALUES (3, 3);
INSERT INTO `book_author` VALUES (4, 4);
INSERT INTO `book_author` VALUES (5, 5);
INSERT INTO `book_author` VALUES (6, 6);
INSERT INTO `book_author` VALUES (7, 5);
INSERT INTO `book_author` VALUES (8, 5);
INSERT INTO `book_author` VALUES (9, 7);
INSERT INTO `book_author` VALUES (10, 8);
INSERT INTO `book_author` VALUES (11, 9);
INSERT INTO `book_author` VALUES (11, 10);
INSERT INTO `book_author` VALUES (12, 9);
INSERT INTO `book_author` VALUES (12, 10);
