# Chọn hình ảnh nền cho Python
FROM python:3.9-slim

# Đặt biến môi trường APP_ENV
ENV APP_ENV=development

# Sao chép mã nguồn vào container
COPY app.py /app.py

# Thiết lập thư mục làm việc
WORKDIR /

# Chạy ứng dụng Python
CMD ["python", "app.py"]
