INSERT INTO Member (name, phone, email, cin, description, status) VALUES
                                                                      ('John Doe', '123-456-7890', 'john@example.com', 'AB123456', 'Member description 1', 'Active'),
                                                                      ('Jane Smith', '987-654-3210', 'jane@example.com', 'CD987654', 'Member description 2', 'Active');
INSERT INTO Admin (username, email, password, role) VALUES
                                                        ('admin1', 'admin1@example.com', 'password1', 'admin'),
                                                        ('admin2', 'admin2@example.com', 'password2', 'admin');

INSERT INTO Meet (title, link, description, date, speaker) VALUES
                                                               ('Introduction to Spring Boot', 'https://example.com/spring-boot', 'Learn the basics of Spring Boot', '2024-02-10', 'John Doe'),
                                                               ('Web Development Workshop', 'https://example.com/web-dev-workshop', 'Hands-on workshop on web development', '2024-03-15', 'Jane Smith');
