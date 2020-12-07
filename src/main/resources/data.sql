INSERT INTO USERS (EMAIL, FIRST_NAME, LAST_NAME, PASSWORD)
VALUES ('user@gmail.com', 'User_Firsr', 'User_Last', 'password'),
('admin@rfl.com', 'Admin_First', 'Admin_last', 'admin');

INSERT INTO USER_ROLE (ROLE, USER_ID)
VALUES ('ROLE_USER', 1),
('ROLE_USER', 2),
('ROLE_ADMIN', 2);