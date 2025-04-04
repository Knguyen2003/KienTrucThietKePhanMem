# Sử dụng PostgreSQL 15 làm image nền
FROM postgres:15

# Sao chép file SQL vào thư mục khởi tạo trong container
COPY init.sql /docker-entrypoint-initdb.d/

# Cấu hình môi trường (nếu cần, ví dụ như password cho user "postgres")
ENV POSTGRES_PASSWORD=mysecretpassword
