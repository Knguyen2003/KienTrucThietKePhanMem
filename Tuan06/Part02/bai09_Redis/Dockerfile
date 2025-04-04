# Sử dụng image redis mới nhất
FROM redis:latest

# Tạo thư mục để chứa file cấu hình nếu cần
RUN mkdir -p /usr/local/etc/redis

# Sao chép file cấu hình tùy chỉnh vào container
COPY redis.conf /usr/local/etc/redis/redis.conf

# Chạy Redis với file cấu hình tùy chỉnh
CMD ["redis-server", "/usr/local/etc/redis/redis.conf"]