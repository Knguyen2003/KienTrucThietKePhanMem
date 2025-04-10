FROM python:3.10

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy toàn bộ mã nguồn vào container
COPY . /app/

# Cài đặt các thư viện cần thiết
RUN pip install --no-cache-dir -r requirements.txt

# Mở cổng 8000 cho Django
EXPOSE 8000

COPY entrypoint.sh /app/entrypoint.sh

# Cấu hình ENTRYPOINT để chạy nhiều lệnh khác nhau
ENTRYPOINT ["./entrypoint.sh"]
