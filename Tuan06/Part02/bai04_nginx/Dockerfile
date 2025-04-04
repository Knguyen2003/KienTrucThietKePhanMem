# Sử dụng nginx:latest làm base image
FROM nginx:latest

# Copy file index.html vào thư mục mặc định của nginx
COPY index.html /usr/share/nginx/html/index.html

# Expose port 80 để có thể truy cập từ ngoài
EXPOSE 80

# CMD mặc định của nginx đã cấu hình sẵn, không cần thêm gì cả
