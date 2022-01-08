CREATE TABLE `comments` (
    `commentId` int NOT NULL,
    `articleId` int DEFAULT NULL,
    `comment` mediumtext,
    `dateAdded` datetime DEFAULT NULL,
    `approved` tinyint DEFAULT NULL,
    `deleted` tinyint DEFAULT NULL,
    `likes` int DEFAULT NULL,
    PRIMARY KEY (`commentId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
